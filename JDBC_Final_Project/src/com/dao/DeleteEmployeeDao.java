package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DeleteEmployeeDao {
	
	public void deleteEmployee(int id){
	
	  Connection con = null;
		
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vspl?useSSl=false","root","Hemraj@5807");
		
		PreparedStatement ps = con.prepareStatement("delete from user where id = ?");
		ps.setInt(1, id);
		
		int result = ps.executeUpdate();
		
		 if(result==1) {
			   System.out.println("Delete Record Succesfully");
		   }else {
			   System.out.println("Record not Deleted, Please Retry");
		   }
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			con.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

   }
}	


