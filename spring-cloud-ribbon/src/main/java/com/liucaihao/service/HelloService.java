package com.liucaihao.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallBack")
    public String helloConsumer(){
        return restTemplate.getForEntity("http://EUREKA-CLIENT/hello" , String.class).getBody();
    }

    public String helloFallBack(){
        return "call hello fail";
    }
}
