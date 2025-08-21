package jdbcConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteRecord {
	
	public static void main(String[] args) {
		  Connection con = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vspl?useSSl=false","root","Hemraj@5807");
			
			Employee e = new Employee(108,"Ganesh",78000);
			
			PreparedStatement ps = con.prepareStatement("delete from user where id = ?");
			ps.setInt(1, e.getId());
			
			int result = ps.executeUpdate();
			
			System.out.println(result);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
