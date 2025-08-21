package jdbcConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BatchProcessing {
	
	private static Connection con = null;
	
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prac?useSSL=false","root","Hemraj@5807");
			con.setAutoCommit(false);
			System.out.println("Connection Establish Successful!");
		} catch (Exception e) {
           e.printStackTrace();		}
	}
	
	
	public static void main(String[] args) {
		String query = "INSERT INTO emp(name,salary) VALUES(?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			Scanner in = new Scanner(System.in);
			
		while(true) {	
			System.out.print("Name : ");
			String name = in.nextLine();
			System.out.print("Salary : ");
			float salary = in.nextFloat();
			
			ps.setString(1, name);
			ps.setFloat(2, salary);
			in.nextLine();
			
			ps.addBatch();
			System.out.print("You want to Add Employee Y/N :");
			String yn = in.nextLine();
			if(yn.toUpperCase().equals("N")) {
				break;
			}
			
		}
		
		int [] batchResult = ps.executeBatch();
		con.commit();
		System.out.println("Batch execute Successfull!");
		
		} catch (Exception e) {
           e.printStackTrace();	
        }
		
	}

}
