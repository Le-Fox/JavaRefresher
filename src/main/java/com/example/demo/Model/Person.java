package com.example.demo.Model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {

    private UUID id;
    private String name;

    public Person(@JsonProperty("id") UUID id,
    @JsonProperty("name") String person) {
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
