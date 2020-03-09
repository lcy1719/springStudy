import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Hello;

public class Mytest {
    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //对象都在spring进行管理，使用的时候直接拿出来
        Hello hello = (Hello) context.getBean("name");
        System.out.println(hello.toString());
    }
}
