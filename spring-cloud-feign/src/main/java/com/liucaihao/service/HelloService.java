package com.liucaihao.service;

import com.liucaihao.configuration.FullLoggerConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client" , fallback = HelloServiceFallBack.class , configuration = FullLoggerConfiguration.class)
public interface HelloService {
    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    String hello();
}
