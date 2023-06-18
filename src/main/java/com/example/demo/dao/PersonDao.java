package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.Optional;
import java.util.UUID;
import java.util.List;
public interface PersonDao {
   //insert person with given id
    int insertPerson(UUID id, Person person);
    //insert person without id
   default int insertPerson(Person person){
       UUID id = UUID.randomUUID();
       return insertPerson(id, person);
   }


   List<Person> selectAllPeople();

   Optional <Person> selectPersonById(UUID id);

   int deletePersonById(UUID id);


   int updatePersonById(UUID id, Person person);



}
