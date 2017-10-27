package com.ebao.scm.devops.controller;

import com.ebao.scm.devops.dao.PersonRepository;
import com.ebao.scm.devops.model.Person;
import com.ebao.scm.devops.tools.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController extends CommonController {
    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/save")
    public Person save(String name, String address, Integer age) {
        Person p = personRepository.save(new Person(CommonUtil.generateUUID(), name, age, address));
        return p;
    }

    @RequestMapping("/q1")
    public List<Person> q1(String address) {
        List<Person> people = personRepository.findByAddress(address);
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        return people;
    }

    @RequestMapping("/q2")
    public Person q2(String name, String address) {
        Person person = personRepository.findByNameAndAddress(name, address);
        return person;
    }
    @RequestMapping("/q3")
    public Person q3(String name, String address){
        Person p = personRepository.withNameAndAddressQuery(name, address);
        return p;
    }

    @RequestMapping("/q4")
    public List<Person> q4(String name, String address){
        List<Person> list = personRepository.withNameAndAddressNamedQuery(name, address);
        return list;
    }

    @RequestMapping("/sort")
    public List<Person> sort(){
        List<Person> list = personRepository.findAll(new Sort(Sort.Direction.ASC, "age"));
        return list;
    }

    @RequestMapping("/page")
    public Page<Person> page(){
        Page<Person> page = personRepository.findAll(new PageRequest(1,2));
        return page;
    }



}
