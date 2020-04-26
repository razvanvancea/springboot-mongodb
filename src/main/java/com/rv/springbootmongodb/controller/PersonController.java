package com.rv.springbootmongodb.controller;

import com.rv.springbootmongodb.model.Person;
import com.rv.springbootmongodb.repository.PersonRepository;
import com.rv.springbootmongodb.service.PersonService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    @ResponseStatus(HttpStatus.OK)
    public List<Person> getPersons() {
        return personService.getAllPersons();
    }

    @PostMapping("/persons")
    @ResponseStatus(HttpStatus.CREATED)
    public void createPerson(@RequestBody Person p) {
        personService.createPerson(p);
    }

    @DeleteMapping("/persons/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePerson(@PathVariable String id) {
        personService.deletePersonById(id);
    }
}
