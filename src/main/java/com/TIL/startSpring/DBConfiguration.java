package com.TIL.startSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:dbConfig.properties")
public class DBConfiguration {

    @Autowired
    private Environment env;

    @Override
    public String toString() {
        return "Username "+ env.getProperty("user")+
                ", paswword: "+ env.getProperty("password");
    }
}
