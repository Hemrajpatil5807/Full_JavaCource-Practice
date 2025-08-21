package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Employee;


public class SelectAllEmployeeDao {

	public void selectAllEmployee() {
Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vspl?useSSL=false","root","Hemraj@5807");
			
			PreparedStatement ps = con.prepareStatement("select * from user");
			
			ResultSet result = ps.executeQuery();
			
			List <Employee> al = new ArrayList<Employee>();
			  
			while(result.next()) {  

				
				 Employee e = new Employee(result.getInt("id"),result.getString("name"),result.getFloat("salary"),result.getString("mobile"),
						 result.getString("address"),result.getString("pan"),result.getString("aadhar"),result.getString("gender"),
						 result.getString("dob"),result.getString("role"));	
				 
				 al.add(e);
				 
			}
			
			for(Employee e: al) {
				System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getMobile()+" "+e.getAadhar()+" "+e.getAddress()+" "+e.getPan()+" "+
			   e.getbDate()+" "+e.getGender()+" "+e.getRole());
				//e.toString();
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
