package com.riyaz.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riyaz.todo.dao.PersonService;
import com.riyaz.todo.entity.Person;

@RestController
@RequestMapping(value = "/person")
@CrossOrigin(origins = "*")
public class PersonController {

	@Autowired
	private PersonService personService;

	@GetMapping(value = "/id/{id}")
	public Person findPerson(@PathVariable("id") Long id) {

		return personService.findPerson(id).get();
	}

	@GetMapping(value = "/all")
	public List<Person> findAllPerson() {
		return personService.findAllPerson();
	}

	@PostMapping()
	public Person addPerson(@RequestBody Person person) {
		return personService.addPerson(person);
	}

	@DeleteMapping(value = "id/{id}")
	public Person deletePerson(@PathVariable("id") Long id) {
		
		Person person=personService.findPerson(id).get();
		personService.deletePerson(person);

		return person;
	}

}
