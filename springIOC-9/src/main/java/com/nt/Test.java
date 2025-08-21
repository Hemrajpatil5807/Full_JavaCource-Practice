package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
       ApplicationContext ct = new FileSystemXmlApplicationContext("src/main/resources/application.xml");
       
       StringArray s = (StringArray) ct.getBean("st");
       
       s.display();
		
	}

}
