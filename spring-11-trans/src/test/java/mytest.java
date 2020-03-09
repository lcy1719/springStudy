import com.cy.User;
import com.mapper.Usermapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class mytest {
    @Test
    public void red() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("all.xml");
        Usermapper usermapper = context.getBean("mapper", Usermapper.class);
        for (User user : usermapper.select()) {
            System.out.println(user);
        }
    }
    @Test
    public void s(){
        ApplicationContext context = new ClassPathXmlApplicationContext("all.xml");
        User user = context.getBean("user", User.class);
        Usermapper usermapper = context.getBean("mapper", Usermapper.class);
        usermapper.add(user);
        usermapper.del(6);
    }
}
