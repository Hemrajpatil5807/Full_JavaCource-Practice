package jdbcConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MaximumSalary {
	public static void main(String[] args) {
		Connection con = DatabaseConnection.databaseConnection();
		String query = "select max(salary) as total from user";
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(query);
			
			ResultSet result = ps.executeQuery();
			
			if(result.next()) {
				int maxSal = result.getInt("total");//result.getInt(1)
				System.out.println("Maximum Salary : "+maxSal);
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
