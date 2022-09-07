package com.example.lab1_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class First implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("First");

    }
}



