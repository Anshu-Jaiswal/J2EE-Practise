package com.springcore.spel;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		 Demo d = context.getBean("demo",Demo.class);
		 System.out.println(d);
		 
//		  API for spel but not generally used
//		   SpelExpressionParser temp = new SpelExpressionParser();
//		   Expression exp = temp.parseExpression("22+44"); 
//		   System.out.println(exp.getValue());
//		 
		 

	}

}
