package com.demo.springdemo.entities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@ToString
public class Person implements Serializable {

    @Id
    @GeneratedValue
    private BigDecimal id;
    private String name;
    private String lastName;
    private String adress;
    
}
