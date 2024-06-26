package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
      ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
     StudentDao studentDao=  context.getBean("studentDao",StudentDao.class);
     
     Student student = new Student(300,"Anjal","Bhopal");
     
     int r = studentDao.insert(student);
     
     System.out.println("Done "+r);
    }
}
