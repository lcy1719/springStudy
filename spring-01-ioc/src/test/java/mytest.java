import User.UserMysqlimp;
import User.Userdao;
import User.userSqltieimp;
import UserService.Userservice;
import UserService.Userviceimpl;
import configration.myconfigration;
import javaa.Human2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.plugin2.gluegen.runtime.CPU;

public class mytest {
    public static void main(String[] args) {
        //用户调用业务层
        ApplicationContext context = new AnnotationConfigApplicationContext(myconfigration.class);
        Human2 user = context.getBean("user", Human2.class);
        user.introduce();

        //传统的实现代码
//        Userviceimpl userviceimpl=new Userviceimpl();
//        userviceimpl.setUserdao(new userSqltieimp());
//        userviceimpl.getuser();
    }
}
