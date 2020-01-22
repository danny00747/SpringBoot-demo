package com.example.demo;


import org.springframework.stereotype.Component;

@Component("sch1")
public class School {
    private int id;
    private String town;
    private String name;

    @Override
    public String toString() {
        return "Laptop [Id=" + id + ", Name=" + name + " ,Town=" + town + "]";
    }

    public void compile() {
        System.out.println("compiling school class...");
    }
}

