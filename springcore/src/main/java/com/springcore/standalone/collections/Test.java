package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		
		 Person person = context.getBean("person1",Person.class);
		 System.out.println(person);
		 System.out.println(person.getFee());
		 System.out.println(person.getFriends().getClass().getName());
		 
		 Person person2 = context.getBean("person2",Person.class);
		 System.out.println(person2);
		 System.out.println(person2.getFriends().getClass().getName());
		
		
		
	}

}
