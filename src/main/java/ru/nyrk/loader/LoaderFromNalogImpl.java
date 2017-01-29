package ru.nyrk.loader;

import com.google.common.collect.ImmutableMap;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.text.StrSubstitutor;
import org.apache.commons.lang3.time.FastDateFormat;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nyrk.prop.ConfigAppProperties;

import javax.annotation.PostConstruct;
import javax.net.ssl.SSLContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.*;
import java.security.cert.CertificateException;
import java.util.Date;
import java.util.Optional;

/**
 * todo:java doc
 */
@Service
public class LoaderFromNalogImpl implements LoaderFromNalog {

    private static final Logger logger = LoggerFactory.getLogger(LoaderFromNalogImpl.class);
    //EGRUL/01.01.2017_FULL/EGRUL_FULL_2017-01-01_1.zip
    String patternFileName = "/${typeFile}/${ddFirst}${full}/${typeFile}${full}_${yyFirst}${indx}.zip";
    FastDateFormat ddFirst = FastDateFormat.getInstance("dd.MM.yyyy");
    FastDateFormat yyFirst = FastDateFormat.getInstance("yyyy-MM-dd");

    @Autowired
    private ConfigAppProperties configAppProperties;

    private CloseableHttpClient httpClient;

    @PostConstruct
    private void init() throws KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException, UnrecoverableKeyException, KeyManagementException {
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        try (FileInputStream fileInputStream = FileUtils.openInputStream(new File(configAppProperties.getNalog().getP12()))) {
            keyStore.load(fileInputStream, configAppProperties.getNalog().getPassword().toCharArray());
        }

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
        HttpUriRequest request = RequestBuilder
                .get(configAppProperties.getNalog().getUrl())
                .addHeader("Authorization",
                        Base64.encodeBase64String(configAppProperties
                                .getNalog()
                                .getAutification()
                                .getBytes()))
                .build();

        try (CloseableHttpResponse httpResponse = httpClient.execute(request)) {
            if (httpResponse.getStatusLine().getStatusCode() != 200) {
                logger.warn(EntityUtils.toString(httpResponse.getEntity()));
                throw new LoadException(httpResponse.getStatusLine());
            }
            File outputFile = new File(configAppProperties.getDataDir(), nameFile);

            File outputFileTmp = new File(configAppProperties.getDataDir(), nameFile + ".tmp");
            FileUtils.copyInputStreamToFile(httpResponse.getEntity().getContent(), outputFileTmp);
            FileUtils.moveFile(outputFileTmp, outputFile);

            return outputFile;
        } catch (ClientProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
