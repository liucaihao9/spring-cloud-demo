package com.liucaihao.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceFallBack implements HelloService{
    @Override
    public String hello() {
        return "error";
    }
}
