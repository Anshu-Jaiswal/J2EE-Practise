package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entites.Student;

@Component("studentdao")
public class StudentDaoImpl implements StudentDao {
	 //for annotation config
	 //Autowired
	private JdbcTemplate jdbcTemplate; 

	@Override
	public int insert(Student student) {
		//insert query
		 String query = "insert into student(id,name,city) values(?,?,?)";
		 int r =  this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		return r;
	}
	
	@Override
	public int update(Student student) {
		//update query
		
		String query ="update Student set name=?, city=? where id=?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	@Override
	public int delete(int studentID) {
        // delete query
		
		String query ="delete from student where id=?";
		 int r = this.jdbcTemplate.update(query,studentID);
		return r;
	}
	
	@Override
	public Student getStudent(int studentID) {
		// Select single student data
		
		String query ="select * from student where id=?";
		
		 RowMapper<Student> rowMapper = new RowMapperImpl();
		 Student student = this.jdbcTemplate.queryForObject(query,rowMapper,studentID);

		return student;
	}
	
	@Override
	public List<Student> getAllStudent() {
		// select multiple student
		
		String query ="select * from student ";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;

	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	

	

	
	
	

	

}
