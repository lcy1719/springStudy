package com.cy.proxy2;
public class proxy2 implements Service{
    private Serviceimp serviceimp;//调用需要代理的类
    public void setServiceimp(Serviceimp serviceimp) {
        this.serviceimp = serviceimp;
    }
    public void add() {
        msg("添加");
        serviceimp.add();
    }
    public void del() {
        msg("删除");
        serviceimp.del();
    }
    public void edit() {
        msg("编辑");
        serviceimp.edit();
    }
    public void select() {
        msg("查询");
        serviceimp.select();
    }
    //新增的方法
    public void msg(String msg){
        System.out.println("调用了"+msg+"方法");
    }
}
