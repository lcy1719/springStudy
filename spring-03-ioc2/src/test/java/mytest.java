import configration.myconfig;
import ioc.Hello;
import ioc.Hello2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mytest {
    public static void main(String[] args) {
        //配置文件
        ApplicationContext context = new AnnotationConfigApplicationContext(myconfig.class);
        Hello get1 = context.getBean("get1", Hello.class);
        Hello2 get2 = context.getBean("get2", Hello2.class);
        get1.show();
        System.out.println(get1);
        System.out.println(get2);
    }
}
