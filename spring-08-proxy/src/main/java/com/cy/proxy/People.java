package com.cy.proxy;

public class People {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //中介帮房东租房子
        Zhongjie zhongjie = new Zhongjie(host);
        //不用找房东，找中介租房
        zhongjie.rent();
    }
}
