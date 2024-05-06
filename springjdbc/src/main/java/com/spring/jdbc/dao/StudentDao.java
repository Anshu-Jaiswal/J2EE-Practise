package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entites.Student;

public interface StudentDao {
	
	public int insert(Student student);
	
	public int update(Student student);
	
	public int delete(int StudentID);
	
	public Student getStudent(int studentID);
	
	public List<Student> getAllStudent();

}
