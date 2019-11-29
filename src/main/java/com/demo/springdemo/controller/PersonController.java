package com.demo.springdemo.controller;

import com.demo.springdemo.entities.Person;
import com.demo.springdemo.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    private IPersonService service;

    @Autowired
    public PersonController(@Qualifier("PersonServiceImpl") IPersonService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public void save(@RequestBody Person person) {
        service.save(person);
    }

    @GetMapping("/getByName")
    public Person getByName(@RequestParam("name") String name) {
        return service.getByName(name);
    }

}
