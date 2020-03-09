package configration;

import javaa.Human2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myconfigration {
    @Bean
    public Human2 user(){
        return new Human2("cy","男");
    }
}
