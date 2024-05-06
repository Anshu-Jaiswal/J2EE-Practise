package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.springcore.javaconfig  " )
public class JavaConfig {
	
	@Bean
	public CourseLang getCourseLangBean() {
		return new CourseLang();
	}
	
	@Bean(name = {"tempcourse","course"}) // we can acccess using any name
	public Course getCourseBean() {
		return new Course(getCourseLangBean());   
		}

}
