package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Employee;

public class EmployeeDao {
	
	private static Connection con = null;
	private static PreparedStatement ps = null;
	
	static {
	   try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   
		   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vspl?useSSl=false","root","Hemraj@5807");	
	   }catch(Exception e) {
		 e.printStackTrace();
	   }
	}
	//register method logic
	public static void register(Employee e) {
			
			try {
			   ps = con.prepareStatement("insert into user values(?,?,?,?,?,?,?,?,?,?)");
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
			   
			   if(result==1) {
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
	
	//Update method logic
	
	public static void updateEmployee(Employee e) {
		
		try {
			
		    ps = con.prepareStatement("update user set salary = ? where id = ?");
			
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
	
	//Delete method logic
	
	public static void deleteEmployee(int id){
		
		try {
		    ps = con.prepareStatement("delete from user where id = ?");
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
	
	//Select logic here
	
public static void selectEmployee(int id) {
	
	     try {
		    ps = con.prepareStatement("Select * from user where id=?");
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

   //SelectAllEmployee logic here

public static void selectAllEmployee(){
		
		try {
		    ps = con.prepareStatement("select * from user");
			
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
//end
	
  
}

