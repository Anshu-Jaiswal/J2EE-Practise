package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
   // for xml config     
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml"); 
        
        // for java config
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
;
       StudentDao studentDao =  context.getBean("studentDao",StudentDao.class);
       
       //Insert
//       Student student = new Student();
//       student.setId(40);
//       student.setName("Aditya");
//       student.setCity("Banglore");
//       
//     int result=  studentDao.insert(student);
//     System.out.println("Student added "+result);
       
       //update
//       Student student2 = new Student();
//       student2.setId(20);
//       student2.setName("Dhruv Shrivastava");
//       student2.setCity("Indore");
//       
//       int result2 = studentDao.update(student2);
//       
   //  System.out.println("Student added "+result2);
       
       //delete by id 
       
//     int r=  studentDao.delete(40);
//     System.out.println("student deleted "+ r);
       
       //Get  Single Student Data
       
//       Student student = studentDao.getStudent(10);
//       System.out.println(student);

       
       // Get All Student
       
       List<Student> students = studentDao.getAllStudent();
       for (Student student : students) {
    	   System.out.println(student);
		
	}
     
     
       
         
      
        
         
         
        }
}
