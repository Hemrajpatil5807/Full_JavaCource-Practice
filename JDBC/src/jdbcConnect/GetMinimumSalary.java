package jdbcConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetMinimumSalary {

	public static void main(String[] args) {
		
		Connection con =DatabaseConnection.databaseConnection();
		String query = "select min(Salary) as total from user";
		PreparedStatement ps = null;
		
		try {
			
			ps=con.prepareStatement(query);
			ResultSet result = ps.executeQuery();
			
			if(result.next()) {
				
				int minSal = result.getInt("total"); //result.getInt(1);
				System.out.println("Minimum Salary : "+minSal);
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
