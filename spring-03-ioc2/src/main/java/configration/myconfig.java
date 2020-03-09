package configration;

import ioc.Hello;
import ioc.Hello2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myconfig {
    @Bean
    public Hello2 get2(){
        return new Hello2();
    }
    @Bean
    public Hello get1(){
        return new Hello("你好");
    }
}
