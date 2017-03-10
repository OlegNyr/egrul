package ru.nyrk.egrul.loader;

import com.google.common.collect.ImmutableMap;
import com.google.common.net.HttpHeaders;
import lombok.Cleanup;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.text.StrSubstitutor;
import org.apache.commons.lang3.time.FastDateFormat;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParser;
import org.springframework.stereotype.Service;
import ru.nyrk.egrul.prop.ConfigAppProperties;

import javax.annotation.PostConstruct;
import javax.net.ssl.SSLContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.*;
import java.security.cert.CertificateException;
import java.util.Date;
import java.util.Map;
import java.util.Optional;

/**
 * Грузит данные с сервера Налоговой Инспекции
 */
@Service
public class LoaderFromNalogImpl implements LoaderFromNalog {

    private static final Logger logger = LoggerFactory.getLogger(LoaderFromNalogImpl.class);
    public static final String MD5_KEY_JSON = "md5";
    public static final String EMPTY_RESULT = "\"[]\"";
    //EGRUL/01.01.2017_FULL/EGRUL_FULL_2017-01-01_1.zip
    String patternFileName = "${typeFile}/${ddFirst}${full}/${typeFile}${full}_${yyFirst}${indx}.zip";
    FastDateFormat ddFirst = FastDateFormat.getInstance("dd.MM.yyyy");
    FastDateFormat yyFirst = FastDateFormat.getInstance("yyyy-MM-dd");

    @Autowired
    private ConfigAppProperties configAppProperties;

    private CloseableHttpClient httpClient;
    @Autowired
    private JsonParser jsonParser;

    @PostConstruct
    private void init() throws KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException, UnrecoverableKeyException, KeyManagementException {
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        File fileP12 = new File(configAppProperties.getNalog().getP12());
        @Cleanup FileInputStream fileInputStream = FileUtils.openInputStream(fileP12);
        keyStore.load(fileInputStream, configAppProperties.getNalog().getPassword().toCharArray());

        SSLContext sslcontext = SSLContexts.custom()
                .loadTrustMaterial(null, new TrustSelfSignedStrategy())
                .loadKeyMaterial(keyStore, configAppProperties.getNalog().getPassword().toCharArray())
                .build();

        httpClient = HttpClientBuilder
                .create()
                .setSSLSocketFactory(new SSLConnectionSocketFactory(sslcontext, NoopHostnameVerifier.INSTANCE))
                .setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE)
                .build();
    }

    @Override
    public File load(Date date, TypeFile typeFile, boolean isFull, Integer index) {
        String nameFile = makeFullNameFile(date, isFull, typeFile, index);
        Optional<File> file = findFromData(nameFile);
        if (file.isPresent()) {
            return file.get();
        } else {
            return loadPerform(nameFile);
        }
    }

    private File loadPerform(String nameFile) {
        String hashMD5Source = loadMD5File(nameFile);

        HttpUriRequest request = RequestBuilder
                .get(configAppProperties.getNalog().getUrl() + nameFile)
                .addHeader(HttpHeaders.AUTHORIZATION, createAuthorization())
                .build();

        try (CloseableHttpResponse httpResponse = httpClient.execute(request)) {
            checkNotOk(httpResponse);
            File outputFile = new File(configAppProperties.getDataDir(), nameFile);

            File outputFileTmp = new File(configAppProperties.getDataDir(), nameFile + ".tmp");
            outputFileTmp.deleteOnExit();
            DigestInputStream digestInputStream = new DigestInputStream(httpResponse.getEntity().getContent(), MessageDigest.getInstance("MD5"));

            FileUtils.copyInputStreamToFile(digestInputStream, outputFileTmp);

            digestInputStream.close();

            checkHash(hashMD5Source, digestInputStream);

            FileUtils.moveFile(outputFileTmp, outputFile);

            return outputFile;
        } catch (ClientProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private void checkNotOk(CloseableHttpResponse httpResponse) throws IOException {
        if (httpResponse.getStatusLine().getStatusCode() != 200) {
            logger.warn(EntityUtils.toString(httpResponse.getEntity()));
            throw new LoadException(httpResponse.getStatusLine());
        }
    }

    private void checkHash(String hashMD5Source, DigestInputStream digestInputStream) {
        byte[] mdbytes = digestInputStream.getMessageDigest().digest();
        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < mdbytes.length; i++) {
            sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
        }

        if (!sb.toString().equals(hashMD5Source)) {
            throw new LoadException(new BasicStatusLine(HttpVersion.HTTP_1_1, 500, "not md5 equals"));
        }
    }

    private String loadMD5File(String nameFile) {
        HttpUriRequest request = RequestBuilder
                .get(configAppProperties.getNalog().getUrl())
                .addParameter("hash", nameFile)
                .addHeader(HttpHeaders.AUTHORIZATION, createAuthorization())
                .build();

        try (CloseableHttpResponse httpResponse = httpClient.execute(request)) {
            checkNotOk(httpResponse);
            String resultText = EntityUtils.toString(httpResponse.getEntity());
            if (resultText.endsWith(EMPTY_RESULT)) { //такой текст они возвращают когда нет файла или ссылка битая
                return makeError404();
            }

            Map<String, Object> resultMap = jsonParser.parseMap(resultText);
            if (resultMap.containsKey(MD5_KEY_JSON)) {
                return (String) resultMap.get(MD5_KEY_JSON);
            } else {
                logger.warn(resultText);
                makeError404();
                return null;
            }
        } catch (ClientProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String makeError404() {
        throw new LoadException(new BasicStatusLine(HttpVersion.HTTP_1_1, 404, "not found Md5"));
    }

    private String createAuthorization() {
        return Base64.encodeBase64String(configAppProperties
                .getNalog()
                .getAutification()
                .getBytes());
    }

    private Optional<File> findFromData(String nameFile) {
        File file = new File(configAppProperties.getDataDir(), nameFile);
        if (file.exists())
            return Optional.of(file);
        else
            return Optional.empty();
    }

    private String makeFullNameFile(Date date, boolean isFull, TypeFile typeFile, Integer index) {
        ImmutableMap<String, String> map = ImmutableMap
                .<String, String>builder()
                .put("typeFile", typeFile.toString())
                .put("ddFirst", ddFirst.format(date))
                .put("yyFirst", yyFirst.format(date))
                .put("full", isFull ? "_FULL" : "")
                .put("indx", index == null ? "_1" : "_" + index)
                .build();
        StrSubstitutor sub = new StrSubstitutor(map);
        return sub.replace(patternFileName);
    }

}
