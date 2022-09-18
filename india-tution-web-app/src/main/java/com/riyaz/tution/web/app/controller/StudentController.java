package com.riyaz.tution.web.app.controller;

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
	
	@GetMapping(value = "/id/{studentId}")
	public Student getAllStudent(@PathVariable("studentId") Long studentId)
	{
		return service.getStudent(studentId);
	}
	
	@PostMapping(value = "/add")
	public Student addStudent(@RequestBody Student student)
	{		
		return service.addStudent(student);
	}
	
	@DeleteMapping(value = "/delete/{studentId}")
	public Student deleteStudent(@PathVariable("studentId") Long studentId)
	{
		return service.deleteStudent(studentId);
	}
	
}
