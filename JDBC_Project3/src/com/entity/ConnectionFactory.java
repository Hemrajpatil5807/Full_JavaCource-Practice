package com.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnectionFactory {
	private static Connection con = null;
	
	static {
		try {
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   
			   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vspl?useSSl=false","root","Hemraj@5807");	
		   }catch(Exception e) {
			 e.printStackTrace();
		   }
	}
	
	public static Connection getCon() {
		return con;
	}

	
}
