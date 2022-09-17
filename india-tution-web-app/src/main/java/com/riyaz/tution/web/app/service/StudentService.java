package com.riyaz.tution.web.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riyaz.tution.web.app.bean.Student;
import com.riyaz.tution.web.app.dao.StudentDao;

@Service
public class StudentService {

	@Autowired
	private  StudentDao dao;
	
	public List<Student> getAllStudent()
	{
		return dao.findAll();
	}
	
	
	public Student addStudent(Student student)
	{
		return dao.save(student);
	}
}
