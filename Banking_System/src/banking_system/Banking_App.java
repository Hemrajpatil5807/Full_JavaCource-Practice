package banking_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class Banking_App {
	
	private static Connection con = null;
	private static PreparedStatement ps = null; 
	
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking_system?useSSL=false", "root","Hemraj@5807");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String email;
		long account_number;
		
		int choice1;
		
		
		while(true) {
			
			System.out.println("\n----! Welcome to Banking System !----\n");
			System.out.println("1 : Register");
			System.out.println("2 : Login");
			System.out.println("3 : Exit");
			choice1 = sc.nextInt();

			switch (choice1) {
			
			case 1: 
				System.out.println("Thank You for Registering");
				break;
			case 2: 
				System.out.println("Welcome to Banking System");
				break;
			case 3: 
				System.out.println("Thank You for Using Service.\nExit...");
				return;
		
			default:
				  System.out.println("Invalid Choice. Please choose Correct Option.");
			}
			
			
			
		}
		
		

	}

}
