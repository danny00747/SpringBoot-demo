package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        // run method returns an object of type ConfigurableApplicationContext
        // spring container is initialised here.

        Student stud = context.getBean(Student.class);
        //getBean creates an object for us, here we ask for an Object of type Alien

        stud.show();
        // we call an Alien method to see if getBean really created an object for us
    }

}
