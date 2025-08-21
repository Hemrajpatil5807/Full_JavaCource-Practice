package jdbcConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateRecord {
	
	public static void main(String[] args) {
		Connection con=null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vspl?useSSl=false","root","Hemraj@5807");
			
			Employee e = new Employee(107,"Gaurav",78000);
			
			PreparedStatement ps = con.prepareStatement("update user set salary = ? where id = ?");
			
			ps.setFloat(1,e.getSalary());
			ps.setInt(2, e.getId());
			
			int result = ps.executeUpdate();
			
			System.out.println(result);
			
			
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
