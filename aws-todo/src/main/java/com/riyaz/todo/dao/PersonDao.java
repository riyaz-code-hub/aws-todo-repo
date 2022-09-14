package com.riyaz.todo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riyaz.todo.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Long> {

	public Optional<Person> findById(Long id);
	
	
}
