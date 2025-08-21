package jdbcConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Load Driver class and register with DriverManager service.
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = null;
		//Establish connection with database software.
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vspl?useSSL=false","root","Hemraj@5807");
		
		//Create JDBC statement object it is used send static values
		Statement st = con.createStatement();
		
		//Send and execute sql queries in database with the help of statement object.
		int result = st.executeUpdate("INSERT INTO user (id, name, salary) VALUES"
				+ "(106, 'Laptop', 500.00),"
				+ "(107, 'Smartphone', 300.00),"
				+ "(103, 'Headphones', 30.00),"
				+ "(104, 'Keyboard', 20.00),"
				+ "(105, 'Mouse', 15.00);");
		
		
		con.close();
	}
	
    

}
