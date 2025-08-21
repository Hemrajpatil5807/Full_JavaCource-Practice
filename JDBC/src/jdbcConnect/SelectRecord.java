package jdbcConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectRecord {
	
	public static void main(String[] args) {
		Connection con = null;
		     try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vspl?useSSL=false","root","Hemraj@5807");
				
				Employee e = new Employee(103,"sam",2000);
				
				PreparedStatement ps = con.prepareStatement("Select * from user where id=?");
				ps.setInt(1, e.getId());
				
				ResultSet result = ps.executeQuery();
				
				while(result.next()) {
					//fetch the query 
					int id = result.getInt("id");
					String name = result.getString("name");
					float salary = result.getFloat("salary");
					
					System.out.println(id+" "+name+" "+salary);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
