package com.rv.springbootmongodb.controller;

import com.rv.springbootmongodb.model.Person;
import com.rv.springbootmongodb.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value = "Person Controller")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "returns persons list")
    public List<Person> getPersons() {
        return personService.getAllPersons();
    }

    @PostMapping(value = "/persons", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "adds a new person")
    public void createPerson(@RequestBody Person p, HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_CREATED);
        personService.createPerson(p);
    }

    @DeleteMapping("/persons/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value = "deletes a person by ID")
    public void deletePerson(@PathVariable String id) {
        personService.deletePersonById(id);
    }
}
