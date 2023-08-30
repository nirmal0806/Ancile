  package com.example.demo.person.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.person.Person;
import com.example.demo.person.dao.PersonDao;

@Service
public class PersonService {
	@Autowired
	private PersonDao personDao;
	
	public Iterable<Person> saveAllPersons(Iterable<Person> personList){
		return personDao.saveAll(personList); //Inserts if record is not there
	}
	public Iterable<Person> getAllPersonByIds(Iterable<Integer> personIds){
		return personDao.findAllById(personIds); //findAllById can only be us
	}
	
}
 