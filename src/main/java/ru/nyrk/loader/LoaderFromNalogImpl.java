package ru.nyrk.loader;

import com.google.common.collect.ImmutableMap;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.StrSubstitutor;
import org.apache.commons.lang3.time.FastDateFormat;
import org.apache.http.HttpEntity;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import ru.nyrk.egrul.generate.egrul.EGRUL;
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
public class LoaderFromNalog implements CommandLineRunner {

    //    String patternFileName = "${typeFile}/01.01.2017_FULL/EGRUL_FULL_2017-01-01_1.zip";
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

    public File load(Date date, boolean isFull, TypeFile typeFile, Integer index) {
        String nameFile = makeFullNameFile(date, isFull, typeFile, index);
        Optional<File> file = findFromData(configAppProperties.getDataDir(), nameFile);
        if (file.isPresent()) {
            return file.get();
        } else {
            return null;
        }
    }

    private Optional<File> findFromData(String dataDir, String nameFile) {
        File file = new File(dataDir, nameFile);
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

    @Override
    public void run(String... args) throws Exception {


        HttpUriRequest request = RequestBuilder
                .get(url)
                .addHeader("Authorization", Base64.encodeBase64String(this.authorization.getBytes()))
                .build();

        try (CloseableHttpResponse httpResponse = httpClient.execute(request)) {

            System.out.println(httpResponse.getStatusLine());
            if (httpResponse.getStatusLine().getStatusCode() != 200) {
                System.out.println(EntityUtils.toString(httpResponse.getEntity()));
                return;
            }
            HttpEntity entity = httpResponse.getEntity();
            FileUtils.copyInputStreamToFile(entity.getContent(), new File("/work/trc/egrul/data/EGRUL_FULL_2017-01-01_1.zip"));
        }

    }
}
