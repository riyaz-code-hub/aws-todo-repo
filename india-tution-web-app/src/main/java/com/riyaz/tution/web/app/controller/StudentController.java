package com.riyaz.tution.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riyaz.tution.web.app.bean.Student;
import com.riyaz.tution.web.app.service.StudentService;

@RestController
@RequestMapping(value = "/student")
@CrossOrigin(origins = "*")
public class StudentController {

	@Autowired
	private StudentService service;
	
	
	@GetMapping(value = "/all")
	public List<Student> getAllStudent()
	{
		return service.getAllStudent();
	}
	
}
