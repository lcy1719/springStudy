package com.cy.Proxy3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类，自动生成代理类
public class Handler implements InvocationHandler {
    //被代理的接口
    private UserServiceImp target;
    public void setTarget(UserServiceImp target) {
        this.target = target;
    }

    //设置代理类
    public Object getProxy(){
        //第一个参数(代理类),第二个参数(传入的实现接口),第三个参数(类本身)
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }
    //处理代理方法，返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //第一个参数(传入的实现接口)
        Object result = method.invoke(target, args);
        return result;
    }
}
