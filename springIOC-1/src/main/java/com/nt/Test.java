package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/application.xml");  // It loads the xml, spring configuration file from FileSystem 
		
		WishGenerator w = (WishGenerator) ctx.getBean("w");  // It us use to get the Spring Object from that xml file.s
		w.wish();
	}

}
   