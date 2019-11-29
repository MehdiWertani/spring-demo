package com.demo.springdemo.dao;

import com.demo.springdemo.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;


public interface IPersonDao extends JpaRepository<Person, BigDecimal> {

    default void displayInfo(Person person) {
        System.out.printf(person.toString());
    }

    Person getByName(String name);
}
