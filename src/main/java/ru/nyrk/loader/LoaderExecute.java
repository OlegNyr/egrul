package ru.nyrk.loader;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import java.io.File;
import java.security.KeyStore;

/**
 * todo:java doc
 */
@Service
public class LoaderExecute implements CommandLineRunner {
    String url = "https://81.177.31.21/EGRUL/01.01.2017_FULL/EGRUL_FULL_2017-01-01_1.zip";
    String patchP12 = "/work/trc/egrul/document/$114004.p12";
    String password = "xR%5LHNU";
    String authorization = "$114004:Qaz1234";

    @Override
    public void run(String... args) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        keyStore.load(FileUtils.openInputStream(new File(patchP12)), password.toCharArray());

        SSLContext sslcontext = SSLContexts.custom()
                .loadTrustMaterial(null, new TrustSelfSignedStrategy())
                .loadKeyMaterial(keyStore, password.toCharArray())
                .build();

        CloseableHttpClient httpClient = HttpClientBuilder
                .create()
                .setSSLSocketFactory(new SSLConnectionSocketFactory(sslcontext, NoopHostnameVerifier.INSTANCE))
                .setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE)
                .build();

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
