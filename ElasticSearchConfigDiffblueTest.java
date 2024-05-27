package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.elasticsearch.client.RestClient;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ElasticSearchConfig.class})
@ExtendWith(SpringExtension.class)
@DisabledInAotMode
class ElasticSearchConfigDiffblueTest {
    @MockBean
    private ClientConfiguration clientConfiguration;

    @Autowired
    private ElasticSearchConfig elasticSearchConfig;

    @MockBean
    private RestClient restClient;

    /**
     * Method under test: {@link ElasticSearchConfig#clientConfiguration()}
     */
    @Test
    void testClientConfiguration() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange, Act and Assert
        assertThrows(RuntimeException.class, () -> (new ElasticSearchConfig()).clientConfiguration());
    }

    /**
     * Method under test: {@link ElasticSearchConfig#clientConfiguration()}
     */
    @Test
    void testClientConfiguration2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        elasticSearchConfig.clientConfiguration();
    }

    /**
     * Method under test: {@link ElasticSearchConfig#getsslContext()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetsslContext() throws IOException, GeneralSecurityException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@3c87d5d0 testClass = com.example.demo.DiffblueFakeClass7, locations = [], classes = [com.example.demo.ElasticSearchConfig], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@7813fdd8, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@6ca930a9, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@5d29a441], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        elasticSearchConfig.getsslContext();
    }
}
