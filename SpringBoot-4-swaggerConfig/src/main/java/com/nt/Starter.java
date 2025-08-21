package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
// @PropertySource(value="classpath:email.properties")  // If we load properties file here we can access this file in whole project means all classes 
public class Starter {

	public static void main(String[] args) {
		
		SpringApplication.run(Starter.class, args);
		
	}
	
}