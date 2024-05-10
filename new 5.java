import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpHeaders;
import org.springframework.util.Assert;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ElasticSearchConfigTest {

    @Test
    public void testClientConfiguration() {
        // Mocking ClientConfiguration
        ClientConfiguration clientConfiguration = mock(ClientConfiguration.class);
        when(clientConfiguration.connectedTo(Mockito.anyString())).thenReturn(clientConfiguration);
        when(clientConfiguration.usingSsl()).thenReturn(clientConfiguration);
        when(clientConfiguration.withSocketTimeout(Duration.ofSeconds(15))).thenReturn(clientConfiguration);
        when(clientConfiguration.withBasicAuth(Mockito.anyString(), Mockito.anyString())).thenReturn(clientConfiguration);
        when(clientConfiguration.withHeader(Mockito.any())).thenReturn(clientConfiguration);

        ElasticSearchConfig elasticSearchConfig = new ElasticSearchConfig();
        elasticSearchConfig.setClientConfiguration(clientConfiguration); // Setter for ClientConfiguration

        // Call the method being tested
        ClientConfiguration result = elasticSearchConfig.clientConfiguration();

        // Assertions
        Assert.notNull(result, "ClientConfiguration should not be null");
        // Add more assertions as needed
    }

    @Test
    public void testGetSSLContext() {
        // Mocking KeyStore
        KeyStore keyStore = mock(KeyStore.class);
        // Mock other dependencies as needed

        ElasticSearchConfig elasticSearchConfig = new ElasticSearchConfig();

        try {
            // Call the method being tested
            SSLContext sslContext = elasticSearchConfig.getsslContext();

            // Assertions
            Assert.notNull(sslContext, "SSLContext should not be null");
            // Add more assertions as needed
        } catch (Exception e) {
            // Handle exceptions
            e.printStackTrace();
        }
    }

    @Test
    public void testHeaders() {
        ElasticSearchConfig elasticSearchConfig = new ElasticSearchConfig();

        // Call the method being tested
        HttpHeaders headers = elasticSearchConfig.getHeaders();

        // Assertions
        Assert.notNull(headers, "Headers should not be null");
        Assert.isTrue(headers.containsKey("CurrentTime"), "Headers should contain CurrentTime");
        // Add more assertions as needed
    }
}


===============================
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.sniff.Sniffer;
import org.elasticsearch.client.RestClientBuilder.HttpClientConfigCallback;
import org.elasticsearch.client.RestClientBuilder.RequestConfigCallback;
import org.elasticsearch.client.RestClientBuilder.FailureListener;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.mock;

public class ElasticSearchConfigTest {

    private ElasticSearchConfig elasticSearchConfig;

    @BeforeEach
    void setUp() {
        elasticSearchConfig = new ElasticSearchConfig();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testClientConfiguration() {
        RestClientBuilder builder = elasticSearchConfig.clientConfiguration().restClientBuilder();

        // Assert that the builder is not null
        assertNotNull(builder);

        // Add more assertions here if needed
    }

    @Test
    void testGetsslContext() {
        // Mocking necessary objects
        ElasticSearchConfig configSpy = Mockito.spy(elasticSearchConfig);
        String password = "tochar"; // Assuming this is the password
        KeyStore keystoreMock = mock(KeyStore.class);
        InputStream inputStreamMock = mock(InputStream.class);
        KeyManagerFactory keyManagerFactoryMock = mock(KeyManagerFactory.class);
        TrustManagerFactory trustManagerFactoryMock = mock(TrustManagerFactory.class);

        try {
            Mockito.doReturn(keystoreMock).when(configSpy).getKeystore();
            Mockito.doReturn(inputStreamMock).when(configSpy).getFileInputStream(Mockito.anyString());
            Mockito.doReturn(keyManagerFactoryMock).when(configSpy).getKeyManagerFactory();
            Mockito.doReturn(trustManagerFactoryMock).when(configSpy).getTrustManagerFactory();

            // Test the method
            SSLContext sslContext = configSpy.getsslContext(password);

            // Assert that the sslContext is not null
            assertNotNull(sslContext);

            // Add more assertions here if needed
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception occurred: " + e.getMessage());
        }
    }
}
