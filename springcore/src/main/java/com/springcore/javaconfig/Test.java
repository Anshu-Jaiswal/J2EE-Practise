package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

	
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		 Student s = context.getBean("student",Student.class);
		 
		 System.out.println(s);
		s.study();
		
		
		Course c =context.getBean("getCourseBean",Course.class);
		System.out.println(c);
		c.getCourse();
	}

}
