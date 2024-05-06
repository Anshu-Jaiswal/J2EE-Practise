package com.springcore.javaconfig;


public class Course {
	
	private CourseLang lang; //inject dependency using @Bean 
	
	
	
	public Course(CourseLang lang) {
		super();
		this.lang = lang;
	}
	
	public CourseLang getLang() {
		return lang;
	}

	public void setLang(CourseLang lang) {
		this.lang = lang;
	}
	

	public void getCourse() {
		this.lang.language();
		System.out.println(" BackEnd "+" FrontEnd "+" Full Stack Developer ");
	}

	
	

}
