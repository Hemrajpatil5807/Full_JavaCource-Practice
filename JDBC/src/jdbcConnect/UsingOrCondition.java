package jdbcConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsingOrCondition {
	
	
	public static void main(String[] args) {
		Connection con = DatabaseConnection.databaseConnection();
		String query = "select * from user where name=? or name= ?";
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, "hemraj");
			ps.setString(2, "Ganesh");
			
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
