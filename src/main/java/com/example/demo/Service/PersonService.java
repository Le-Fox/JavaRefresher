package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.PersonDAO;
import com.example.demo.Model.Person;

@Service
public class PersonService {

    private final PersonDAO personDAO;
    
    @Autowired
    public PersonService(@Qualifier("fakeDAO")PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public int addPerson(Person person) {
        return  personDAO.insertPerson(person);
    }
}