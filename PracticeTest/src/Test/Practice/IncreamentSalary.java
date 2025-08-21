package Test.Practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IncreamentSalary {
	public static void main(String[] args) {
		
	
	Connection con = DatabaseConnection.databaseConnection();
	String query = "update user set salary = salary+500 where salary<10000";
	PreparedStatement ps = null;
	
	try {
		ps = con.prepareStatement(query);
		
		int result = ps.executeUpdate();
		
		System.out.println(result);

	} catch (SQLException e) {
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
