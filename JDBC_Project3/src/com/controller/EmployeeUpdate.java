package com.controller;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class EmployeeUpdate {
	
	public void updateEmployee(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Salary You want Update");
		float salary = sc.nextFloat();
		
	    Employee e = new Employee(id,salary);
		
		EmployeeDao.updateEmployee(e);
	} 

}
