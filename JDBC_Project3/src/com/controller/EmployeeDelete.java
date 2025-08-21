package com.controller;

import java.util.Scanner;
import com.dao.EmployeeDao;

public class EmployeeDelete {
	
	public  void deleteEmployee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id You want to Delete");
		int id = sc.nextInt();
		
		EmployeeDao.deleteEmployee(id);
		
	}

}
