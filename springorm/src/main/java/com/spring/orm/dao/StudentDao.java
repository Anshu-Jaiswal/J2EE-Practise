package com.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;


public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	
	//save student
	@Transactional
	public int insert(Student student) {
		
		Integer i = (Integer)this.hibernateTemplate.save(student);
		return i;
	}


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	
	@Transactional
    public void delete(Student s) { 
		hibernateTemplate.delete(s); 
    } 
  
    @Transactional
    public void update(Student s) { 
    	hibernateTemplate.update(s); 
    } 
  
    public Student getStudent(int id) { 
        return hibernateTemplate.get(Student.class,id); 
    } 
  
    //Get all student
    public List<Student> getAllStudents() { 
        return hibernateTemplate.loadAll(Student.class); 
    } 

}
