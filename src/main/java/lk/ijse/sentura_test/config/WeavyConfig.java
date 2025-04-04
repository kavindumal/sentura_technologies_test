package lk.ijse.sentura_test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeavyConfig {

    @Value("${weavy.api.url}")
    private String weavyApiUrl;

    @Value("${weavy.api.token}")
    private String weavyApiToken;

    public String getWeavyApiUrl() {
        return weavyApiUrl;
    }

    public String getWeavyApiToken() {
        return weavyApiToken;
    }
}