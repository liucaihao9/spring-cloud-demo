package com.liucaihao.domain;

import java.io.Serializable;
import java.util.UUID;

public class BusinessResult<T> implements Serializable {

    private String nonceStr = UUID.randomUUID().toString().replaceAll("-" , "");

    private Long now = System.currentTimeMillis();

    private boolean isSuccess;

    private T data;

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public Long getNow() {
        return now;
    }

    public void setNow(Long now) {
        this.now = now;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    private BusinessResult(boolean isSuccess, T data) {
        this.isSuccess = isSuccess;
        this.data = data;
    }

    public static <T> BusinessResult success(T data){
        BusinessResult<T> result = new BusinessResult(true , data);
        return result;
    }

    public static <T> BusinessResult fail(T data){
        BusinessResult<T> result = new BusinessResult(false , data);
        return result;
    }
}
