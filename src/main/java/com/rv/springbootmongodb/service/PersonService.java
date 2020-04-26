package com.rv.springbootmongodb.service;

import com.rv.springbootmongodb.model.Person;
import com.rv.springbootmongodb.repository.PersonRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void createPerson(Person p) {
        personRepository.save(p);
    }

    @Override
    public void deletePersonById(String id) {
        personRepository.deleteById(id);
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
