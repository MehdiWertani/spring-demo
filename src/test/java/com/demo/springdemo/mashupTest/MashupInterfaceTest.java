package com.demo.springdemo.mashupTest;

import com.demo.springdemo.entities.Person;
import com.demo.springdemo.mashup.AddInterface;
import com.demo.springdemo.mashup.MashupInterface;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MashupInterfaceTest {

    private MashupInterface var;


    @Test
    public void personFieldTest() {
        Class clazz = Person.class;


        List<Field> fields = Arrays.asList(clazz.getFields());
        List<Integer> inetgers = Arrays.asList(1,2,3,4,5,8);
        Method[] methods = clazz.getMethods();


        //External iterations
        for (Field f : fields) {
            System.out.println("dssdg");
            System.out.println(f.getName());
        }

        //lambda expression <==> Internal iterations
        fields.forEach(field -> System.out.println(field.getName()));

        //method reference
        fields.forEach(System.out::println);

        List<Integer> i = inetgers.stream().map(param1 -> param1 * 2).filter(param2 -> param2 > 3).collect(Collectors.toList());
    }
}
