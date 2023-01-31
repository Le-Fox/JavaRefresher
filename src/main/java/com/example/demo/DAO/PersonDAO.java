package com.example.demo.DAO;

import java.util.UUID;

import com.example.demo.Model.Person;

public interface PersonDAO {
    //for adding a new person to the database
    int insertPerson(UUID id,Person person);

    default int addPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id,person);
    }

}
