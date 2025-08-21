package com.controller;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class EmployeeRegister {

	public  void register() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id");
		int id = sc.nextInt();
		System.out.println("Enter your Name");
		String name = sc.next();
	    System.out.println("Enter your Salary");
		float salary = sc.nextFloat();
		System.out.println("Enter your Mobile");
		String mob = sc.next();
		System.out.println("Enter your Address");
		String adr = sc.next();
		System.out.println("Enter your Pan");
		String pan = sc.next();
		System.out.println("Enter your AADHAR");
		String aadhar = sc.next();
		System.out.println("Enter your Gender");
		String gen = sc.next();
		System.out.println("Enter your DOB");
		String dob = sc.next();
		System.out.println("Enter your Job Role");
		String role = sc.next();
		
		Employee e = new Employee(id,name,salary,mob,adr,pan,aadhar,gen,dob,role);
		EmployeeDao.register(e);
		
	}
	
}
