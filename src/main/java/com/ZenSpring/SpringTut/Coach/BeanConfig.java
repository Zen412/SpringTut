package com.ZenSpring.SpringTut.Coach;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class BeanConfig {

    @Bean
    public Coach cricketCoach(){
        return new CricketCoach();
    }
}
