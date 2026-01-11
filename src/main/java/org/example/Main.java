package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // האנוטציה הזו הופכת את המחלקה למחלקת שרת
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}