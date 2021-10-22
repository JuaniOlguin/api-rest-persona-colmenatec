package com.example.persona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.persona.controllers", "com.example.persona.services"})
public class PersonaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonaApplication.class, args);
    }

}
