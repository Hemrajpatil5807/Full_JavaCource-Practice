package com.entity;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class ConnectionFactory {
	private static Connection con = null;
	
	static {
		try {
			Properties properties = new Properties();
			
         	InputStream instream = new FileInputStream("src//db.properties");
			
			properties.load(instream);
			
	        String driverClassName = properties.getProperty("jdbc.driverClassName");
	        String url = properties.getProperty("jdbc.url");
	        String username = properties.getProperty("jdbc.username");
	        String password = properties.getProperty("jdbc.password");
	        
			   Class.forName(driverClassName);
			   
			   con = DriverManager.getConnection(url,username,password);	
		   }catch(Exception e) {
			 e.printStackTrace();
		   }
	}
	
	public static Connection getCon() {
		return con;
	}

	
}
