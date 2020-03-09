package com.cy.Proxy3;

public class Client {
    public static void main(String[] args) {
        //代理角色
        Handler handler = new Handler();
        //真实角色
        UserServiceImp userServiceImp = new UserServiceImp();
        //真实角色代理哪个角色(括号里的参数)
        handler.setTarget(userServiceImp);
        //将代理角色转换成接口
        UserService proxy = (UserService) handler.getProxy();
        //调用代理类(实际调用了接口方法)
        proxy.rent();

    }
}
