package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype") how to use the prototype scope
public class Student {

    private int id;
    private String name;

    @Autowired
    @Qualifier("sch1")
    private School laptop;

    public Student() {
        super();
        System.out.println("object created...");
        // to see how many object are created
    }

    public void show() {
        System.out.println("complile student class...");
        laptop.compile();
    }

}
