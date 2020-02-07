package com.example.SpringBootWeb.dao;

import java.util.List;

import com.example.SpringBootWeb.Model.Student;


public interface StudentDao {

	public Student saveStudent(Student student);
	
	public List<Student> getStudent();
	
}
