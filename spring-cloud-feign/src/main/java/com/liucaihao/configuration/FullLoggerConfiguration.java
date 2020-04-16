package com.liucaihao.configuration;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FullLoggerConfiguration {
    @Bean
    Logger.Level feignLoggerFull(){
        return Logger.Level.FULL;
    }
}
