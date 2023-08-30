package com.example.demo.person.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.person.Person;

@Repository
public interface PersonDao extends CrudRepository<Person,Integer>{

}
