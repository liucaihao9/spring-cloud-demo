package com.liucaihao.Filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostDemoFilterTwo extends ZuulFilter {

    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("这是后置过滤器第二个执行逻辑");
        return null;
    }
}
