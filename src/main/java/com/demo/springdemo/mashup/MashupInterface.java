package com.demo.springdemo.mashup;

import com.demo.springdemo.entities.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@FunctionalInterface
public interface MashupInterface {

    void display();

    default void getFieldNames() {
        Class clazz = Person.class;

        Field[] fields = clazz.getFields();
        Method[] methods = clazz.getMethods();


        for (Field f : fields) {
            System.out.printf(f.getName());
        }
    }
}
