package com.zhl.stater.config;

import com.zhl.stater.service.PlayService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(Properties.class)
public class PlayConfig {

    private final Properties properties;

    @Bean
    public PlayService getPlayService(){
        return new PlayService();
    }


}
