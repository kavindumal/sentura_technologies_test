package lk.ijse.sentura_test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeavyConfig {

    @Value("${weavy.url:https://8015b5dbc0724d38882ac90397c27649.weavy.io}")
    private String weavyUrl;

    @Value("${weavy.api-key:wys_hMWpXdekxcn9Gc8Ioah3azOllzUZ7l3HN9yB}")
    private String weavyApiKey;

    @Bean
    public String weavyUrl() {
        return weavyUrl;
    }

    @Bean
    public String weavyApiKey() {
        return weavyApiKey;
    }
}