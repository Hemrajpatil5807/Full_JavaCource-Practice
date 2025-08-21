package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.controller.entity.Employee;
import com.controller.service.EmployeeService;



@Controller
public class EmployeeController {
	
	@Autowired    
	EmployeeService employeeService; //this annotation used to get bean(object) from beanFactory
	
	@Autowired
	Employee employee;
	
	@RequestMapping("/register")
	public void register(@RequestParam("fname")String fname, @RequestParam String midname, @RequestParam String lname, @RequestParam String mobile,
			              @RequestParam String email, @RequestParam String Birthdate, @RequestParam String Gender, @RequestParam String Address ) 
 	{
		    System.out.println(fname+" "+midname+" "+lname+" "+mobile+" "+email+" "+Birthdate+" "+Gender+" "+Address);
		    
		  
		  employee = new Employee(fname+midname+lname, mobile, email, Birthdate, Gender, Address);

		  employeeService.register(employee);
		    
		
	}

}
