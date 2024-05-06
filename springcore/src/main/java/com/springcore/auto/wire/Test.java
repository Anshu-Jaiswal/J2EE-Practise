package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		 Emp e = context.getBean("emp1",Emp.class);//no need to type cast when type is specified
		 System.out.println(e);
	}

}
