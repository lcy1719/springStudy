package com.cy.proxy;

public class Zhongjie implements Proxy {
    //要代理的人
    private Host host;

    Zhongjie(Host host){
        this.host=host;
    }
    //调用rent()方法，看似调用了this.rent(),实则调用了host.rent()
    public void rent() {
        host.rent();
        fare();
    }
    public void fare(){
        System.out.println("收取租借费");
    }
}
