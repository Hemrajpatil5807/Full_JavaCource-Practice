package jdbcConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalaryDesc {
	 public static void main(String[] args) {
		 Connection con = DatabaseConnection.databaseConnection();
		 String query = "select * from user order by salary desc";
		 PreparedStatement ps = null;
		 
		 try {                                    //salary decending order
			ps = con.prepareStatement(query);   
			
			ResultSet result = ps.executeQuery();
			
			while(result.next()) {
				
				System.out.println(result.getInt("id")+"  "+result.getString("name")+"  "+result.getFloat("salary"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
