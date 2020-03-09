package com.cy.configration;

import com.cy.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.cy.pojo")
public class myconfigration {
    @Bean
    public User user(){
        return new User();
    }
}
