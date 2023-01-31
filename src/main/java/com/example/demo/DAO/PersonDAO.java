package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.Model.Person;

public interface PersonDAO {
    //for adding a new person to the database
    int insertPerson(UUID id,Person person);

    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id,person);
    }

    List<Person> selectAllPeople();
    
    Optional<Person> getPersonById(UUID id);

    int deletePersonById(UUID id);
    int updatePersonById(UUID id,Person person);

}
