package com.controller.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.controller.entity.Employee;



@Repository
public class EmployeeDao {

	static Connection con = null;
	       PreparedStatement ps = null;
	static {
		   try {
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   
			   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vspl?useSSl=false","root","Hemraj@5807");	
		   }catch(Exception e) {
			 e.printStackTrace();
		   }
		}
	
	
//	public void register(String fname, String midname, String lname, String mobile, String email, String Birthdate, String Gender, String Address) {
//		
//		   try {
//			      ps = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
//			      ps.setInt(1, 0);
//			      ps.setString(2, fname+" "+midname+" "+lname);
//			      ps.setString(3, mobile);
//			      ps.setString(4, email);
//			      ps.setString(5,Birthdate);
//			      ps.setString(6,Gender);
//			      ps.setString(7,Address);
//
//			      int result = ps.executeUpdate();
//				   
//				   if(result==1) {
//					   System.out.println("Register Succesfully");
//				   }else {
//					   System.out.println("Not Register, Please Retry");
//				   }
//			      
//			      
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		
//	}
	
	//register method logic
		public  void register(Employee e) {
				
				try {
				   ps = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
				   ps.setInt(1, 0);
				   ps.setString(2, e.getName());
				   ps.setString(3, e.getMobile());
				   ps.setString(4, e.getEmail());
				   ps.setString(5, e.getbDate());
				   ps.setString(6, e.getGender());
				   ps.setString(7, e.getAddress());
				   
				  
				   int result = ps.executeUpdate();
				   
				   if(result==1) {
					   System.out.println("Register Succesfully");
				   }else {
					   System.out.println("Not Register, Please Retry");
				   }
				   
				}catch(Exception o) {
					o.printStackTrace();
				}
		}
}
