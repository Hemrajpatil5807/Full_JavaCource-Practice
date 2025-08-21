package Test.Practice;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	
   private static Connection con =  null;
    
    static {
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vspl?useSSL=false","root","Hemraj@5807");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public static Connection databaseConnection() {
    	return con;
    }

}
