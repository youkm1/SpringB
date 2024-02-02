package com.TIL.startSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StartSpringApplication {
    private static final Logger log =
            LoggerFactory.getLogger(StartSpringApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(StartSpringApplication.class, args);

        DBConfiguration dbConfiguration =
                applicationContext.getBean(DBConfiguration.class);

        log.info(dbConfiguration.toString());
    }

}
