package com.example.SpringBootWeb.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.example.SpringBootWeb.Model.Student;
import com.example.SpringBootWeb.dao.StudentDao;

@Component
@Transactional
public class StudentDaoImpl implements StudentDao{

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public Student saveStudent(Student student) {

		entityManager.persist(student);
		
		return student;
	}

	@Override
	public List<Student> getStudent() {
		Query query = entityManager.createQuery("select * from Student");
		List<Student> list = query.getResultList();
		return list;
	}

}
