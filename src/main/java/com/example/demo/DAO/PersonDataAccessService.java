package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo.Model.Person;

@Repository("postgres")
public class PersonDataAccessService implements PersonDAO {

    @Override
    public int insertPerson(UUID id, Person person) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        // TODO Auto-generated method stub
        return List.of(new Person(UUID.randomUUID(),"from postgres db"));
    }

    @Override
    public Optional<Person> getPersonById(UUID id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
