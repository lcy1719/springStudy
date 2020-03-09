package com.cy;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    //第一个参数(要执行的方法)，第二个参数(参数),第三个参数(目标对象)
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("MethodBeforeAdvice运行前执行");
        System.out.println(o.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}
