package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.entity.Employee;

public class RegisterDao {

	public  void register(Employee e) {
		//Databse logic here
		 Connection con = null;
			
			try {
				
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   
			   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vspl?useSSl=false","root","Hemraj@5807");
			   
			 
			   
			   PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?,?,?,?,?,?)");
			   ps.setInt(1, e.getId());
			   ps.setString(2, e.getName());
			   ps.setFloat(3, e.getSalary());
			   ps.setString(4, e.getMobile());
			   ps.setString(5, e.getAddress());
			   ps.setString(6, e.getPan());
			   ps.setString(7, e.getAadhar());
			   ps.setString(8, e.getGender());
			   ps.setString(9, e.getbDate());
			   ps.setString(10, e.getRole());
			   
			   int result = ps.executeUpdate();
			   
			   if(result>0) {
				   System.out.println("Register Succesfully");
			   }else {
				   System.out.println("Not Register, Please Retry");
			   }
			   
			}catch(Exception o) {
				o.printStackTrace();
			}finally {
				try {
					con.close();
				} catch (SQLException se) {
					// TODO Auto-generated catch block
					se.printStackTrace();
				}
	}
  }
}
