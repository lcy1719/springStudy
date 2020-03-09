import com.cy.User;
import com.mapper.Usermapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class mytest {
    @Test
    public void red() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        Usermapper usermapper = context.getBean("select", Usermapper.class);
        for (User user : usermapper.select()) {
            System.out.println(user);
        }
    }
}
