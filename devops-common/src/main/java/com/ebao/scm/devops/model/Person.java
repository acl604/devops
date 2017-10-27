package com.ebao.scm.devops.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@Data
@NamedQuery(name = "Person.withNameAndAddressNamedQuery", query = "select p from Person p where p.name=?1 and p.address=?2")
public class Person {

    public Person() {
        super();
    }

    public Person(String id, String name, Integer age, String address) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Id
    private String id;
    private String name;
    private Integer age;
    private String address;

}
