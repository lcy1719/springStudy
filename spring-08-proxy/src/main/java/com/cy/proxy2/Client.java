package com.cy.proxy2;

public class Client {
    public static void main(String[] args) {
        proxy2 proxy2 = new proxy2();//实例化一个代理类
        //传入被代理的类
        Serviceimp serviceimp = new Serviceimp();
        proxy2.setServiceimp(serviceimp);

        proxy2.add();//调用代理类(实际调用了代理类中被代理的类)
    }
}
