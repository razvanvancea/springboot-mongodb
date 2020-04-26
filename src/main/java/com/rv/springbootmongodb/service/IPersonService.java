package com.rv.springbootmongodb.service;

import com.rv.springbootmongodb.model.Person;

import java.util.List;

public interface IPersonService {

    public void createPerson(Person p);

    public void deletePersonById(String id);

    public List<Person> getAllPersons();
}
