import com.cy.pojo.Student;
import com.cy.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
    @Test
    public void get(){
        ApplicationContext context = new ClassPathXmlApplicationContext("User.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(user.toString());
    }
}
