package com.cy;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class Logafter implements AfterReturningAdvice {
    //第一个参数(返回值),第三个参数(传入参数),第四个参数(目标对象)
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("AfterReturningAdvice运行后执行");
        System.out.println("执行了"+method.getName()+"返回值为"+o);
    }
}
