package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ct = new FileSystemXmlApplicationContext("src/main/resources/application.xml");
		
		Employee e = (Employee) ct.getBean("emp");
				System.out.println(e);
		
	    Employee e1 = (Employee) ct.getBean("em");  // if you want to store different value then get that bean "em"
	           System.out.println(e1);
	}

}
