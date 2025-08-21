package jdbcConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionManagement {
	private static Connection con = null;
	
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prac?useSSL=false","root","Hemraj@5807");
		    System.out.println("Connection Establish Successfully");
			con.setAutoCommit(false);
		}catch (Exception e) {
              e.printStackTrace();
		}
		
	}
	
	
	
	public static void main(String[] args) throws SQLException {
		
		String withdrawQuery = "UPDATE accounts SET accountBalance = accountBalance - ? WHERE accountNumber = ?";
		String depositQuery = "UPDATE accounts SET accountBalance = accountBalance + ? WHERE accountNumber = ?";
		
		
		try {
			
			PreparedStatement withdraw = con.prepareStatement(withdrawQuery);
			PreparedStatement deposit = con.prepareStatement(depositQuery);
			 withdraw.setDouble(1, 500.00);
			 withdraw.setString(2, "account456");
			 
			 deposit.setDouble(1, 500.00);
			 deposit.setString(2, "account579");
			 
			int withdrawAffected =  withdraw.executeUpdate();
			int depositAffected = deposit.executeUpdate();
			
			if(withdrawAffected > 0 && depositAffected > 0) {   // here we check if both query is Affected in table then commit()
				con.commit();
				System.out.println("Transaction Successful!");
			}else {
				con.rollback();
				System.out.println("Transaction Failed");	
			}
				
		}catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
		
	}
	

}
