package jdbcConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SelectAll {

	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vspl?useSSL=false","root","Hemraj@5807");
			
			PreparedStatement ps = con.prepareStatement("select * from user");
			
			ResultSet result = ps.executeQuery();
			
			List <Employee> al = new ArrayList<Employee>();
			  
			while(result.next()) {  
				//without sending result to another class and not creating List
				
//				int id = result.getInt("id");
//				String name = result.getString("name");
//				float salary = result.getFloat("salary");	
//				System.out.println(id+" "+name+" "+salary);
				
				 Employee e = new Employee(result.getInt("id"),result.getString("name"),result.getFloat("salary"));	
				 
				 al.add(e);
				 
			}
			Demo.show(al);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
