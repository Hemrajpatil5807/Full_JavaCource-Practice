package com.controller;

import java.util.Scanner;
import com.dao.EmployeeDao;

public class EmployeeSelect {
	
	public  void selectEmployee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id That You Want to Select");
		int id = sc.nextInt();
		
		EmployeeDao.selectEmployee(id);
	}

}
