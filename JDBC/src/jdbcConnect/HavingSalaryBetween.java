package jdbcConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HavingSalaryBetween {
    
	public static void main(String[] args) {
		
		Connection con = DatabaseConnection.databaseConnection();
		String query = "Select * from user where salary between ? and ?";
		PreparedStatement ps = null;
		
		try {
			
			ps=con.prepareStatement(query);
			ps.setFloat(1, 1500);
			ps.setFloat(2, 10000);
			
			ResultSet result = ps.executeQuery();
			
			while(result.next()) {
//				int id = result.getInt("id");
//				String name = result.getString("name");
//				float salary = result.getFloat("salary");
				
				System.out.println(result.getInt("id")+"  "+result.getString("name")+"  "+result.getFloat("salary"));
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
