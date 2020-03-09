package UserService;

import User.UserMysqlimp;
import User.Userdao;
import User.Userdaoimp;
import User.userSqltieimp;

public class Userviceimpl implements Userservice {
    //IOC容器注入
    private Userdao userdao;
    public void setUserdao(Userdao userdao) {
        this.userdao = userdao;
    }
    public void getuser() {
        userdao.getuser();
    }

    //传统的模式
//    Userdao userdao=new userSqltieimp();
//
//    public void getuser() {
//        userdao.getuser();
//    }

}
