package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SelectEmployeeDao {
	
	public void selectEmployee(int id) {
		
		Connection con = null;
	     try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vspl?useSSL=false","root","Hemraj@5807");
			
			PreparedStatement ps = con.prepareStatement("Select * from user where id=?");
			ps.setInt(1, id);
			
			ResultSet result = ps.executeQuery();
			
			while(result.next()) {
				//fetch the query 
				int id1 = result.getInt("id");
				String name = result.getString("name");
				float salary = result.getFloat("salary");
				String mobile = result.getString("mobile");
				String address = result.getString("address");
				String pan = result.getString("pan");
				String aadhar = result.getString("aadhar");
				String gender = result.getString("gender");
				String bDate = result.getString("dob");
			    String role = result.getString("role");
				
				System.out.println("\n"+id1+" "+name+" "+salary+" "+mobile+" "+address+" "+pan+" "+aadhar+" "+gender+" "+bDate+" "+role);
			}
		} catch (Exception o) {
			o.printStackTrace();
		}
	     finally {
	    	 try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	     }
	}

}
