package com.example.demo.Model;

import java.util.UUID;

public class Person {

    private UUID id;
    private String name;

    public Person(UUID id, String person) {
        this.id =id;
        this.name = person;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

     
    
    
}
