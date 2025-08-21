package jdbcConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NotHavingSalaryBetween {
	
	public static void main(String[] args) {
		Connection con = DatabaseConnection.databaseConnection();
		String query = "select * from user where salary not between ? and ?";
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(query);
			ps.setFloat(1, 1500);
			ps.setFloat(2, 5000);
			
			ResultSet result = ps.executeQuery();
			
			while(result.next()) {
				
				System.out.println(result.getInt("id")+" "+result.getString("name")+" "+result.getFloat("salary"));
			}
			
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