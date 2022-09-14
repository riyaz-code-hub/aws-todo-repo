package com.riyaz.todo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riyaz.todo.entity.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDao personDao;
	
	public List<Person> findAllPerson()
	{
		return personDao.findAll();
	}
	
	public Optional<Person> findPerson(Long id)
	{
		return personDao.findById(id);
	}
	
	public Person addPerson(Person person)
	{
		return personDao.save(person);
	}
	
	public void deletePerson(Person p)
	{
	 personDao.delete(p);
	}
	
}
