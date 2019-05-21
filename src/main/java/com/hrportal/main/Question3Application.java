package com.hrportal.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Question3Application {

	@Autowired
	ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(Question3Application.class, args);
		
	}

}
