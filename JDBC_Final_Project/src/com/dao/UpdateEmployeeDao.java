package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.entity.Employee;

public class UpdateEmployeeDao {

	public  void updateEmployee(Employee e) {
		//Databse logic here
		Connection con=null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vspl?useSSl=false","root","Hemraj@5807");
			
			
			PreparedStatement ps = con.prepareStatement("update user set salary = ? where id = ?");
			
			ps.setFloat(1,e.getSalary());
			ps.setInt(2, e.getId());
			
			int result = ps.executeUpdate();
			
			 if(result==1) {
				   System.out.println("Salary Update Succesfully");
			   }else {
				   System.out.println("Salary Not Updated, Please Retry");
			   }
			
			
		} catch (Exception o) {
			// TODO Auto-generated catch block
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
