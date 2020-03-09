import com.cy.configration.myconfigration;
import com.cy.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mytest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(myconfigration.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
    }
}
