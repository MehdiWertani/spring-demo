package com.demo.springdemo.service;

import com.demo.springdemo.entities.Person;

public interface IPersonService  {

    void save(Person person);

    Person getByName(String name);
}
