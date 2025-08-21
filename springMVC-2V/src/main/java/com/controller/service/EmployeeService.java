package com.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controller.dao.EmployeeDao;
import com.controller.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
//	public void register(String fname, String midname, String lname, String mobile, String email, String Birthdate, String Gender, String Address) {
		
	public void register(Employee e) {
//	    System.out.println(fname+" "+midname+" "+lname+" "+mobile+" "+email+" "+Birthdate+" "+Gender+" "+Address);
		System.out.println(e);
	    
//	    employeeDao.register(fname, midname, lname, mobile, email, Birthdate, Gender, Address);
		employeeDao.register(e);

	}
	
}