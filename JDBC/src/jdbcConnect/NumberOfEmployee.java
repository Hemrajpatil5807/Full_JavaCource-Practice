package jdbcConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NumberOfEmployee {
	
    public static void main(String[] args) {
		 Connection con = DatabaseConnection.databaseConnection();
		 String query = "select count(id) as num from user";
		 PreparedStatement ps = null;
		 
		 try {
			ps = con.prepareStatement(query);
			
			ResultSet result = ps.executeQuery();
			
			while(result.next()) {
				
				System.out.println("Total Employee : "+result.getInt(1));  // or result.getInt("num")
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
