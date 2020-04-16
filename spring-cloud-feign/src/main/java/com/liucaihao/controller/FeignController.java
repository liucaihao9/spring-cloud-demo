package com.liucaihao.controller;

import com.liucaihao.domain.BusinessResult;
import com.liucaihao.domain.TestObject;
import com.liucaihao.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/feign-consumer" , method = RequestMethod.GET)
    public BusinessResult<TestObject> helloConsumer(){
        String result = helloService.hello();
        TestObject testObject = new TestObject();
        testObject.setStr1(result);
        return BusinessResult.success(testObject);
    }
}
