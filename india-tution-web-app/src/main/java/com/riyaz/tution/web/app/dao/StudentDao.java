package com.riyaz.tution.web.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riyaz.tution.web.app.bean.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Long> {

	//public List<Student> findAll();
}
