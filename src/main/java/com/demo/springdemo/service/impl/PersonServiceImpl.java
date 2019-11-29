package com.demo.springdemo.service.impl;

import com.demo.springdemo.dao.IPersonDao;
import com.demo.springdemo.entities.Person;
import com.demo.springdemo.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PersonServiceImpl")
public class PersonServiceImpl implements IPersonService {

    private IPersonDao dao;

    @Autowired
    public PersonServiceImpl(IPersonDao dao) {
        this.dao = dao;
    }

    @Override
    public void save(Person person) {
        dao.save(person);
    }

    @Override
    public Person getByName(String name) {
        return dao.getByName(name);
    }
}
