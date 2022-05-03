package com.muazmemis.aop.interceptor;

@InterceptorYolKesici
public class Login {
    public String isLoginMethod(String data) {
        return "is login: " + data;
    }
}
