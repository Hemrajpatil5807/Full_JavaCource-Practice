package com.controller;

import java.util.Scanner;

import com.dao.DeleteEmployeeDao;

public class EmployeeDelete {
	
	public  void deleteEmployee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id You want to Delete");
		int id = sc.nextInt();
		
		DeleteEmployeeDao d = new DeleteEmployeeDao();
		    d.deleteEmployee(id);
		
	}

}
