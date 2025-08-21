package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dto.EmployeeRequestDto;
import com.nt.dto.EmployeeResponseDto;
import com.nt.entity.Employee;
import com.nt.exception.CustomException;
import com.nt.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/employee")
@PropertySource(value="classpath:email.properties")
//@CrossOrigin("*")   // We Config Cors origin Globally to access all Controller API
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	private Environment env;
	
	@GetMapping(value="/getHRemail", produces="application/json")
	public String getHRemail() {
		
		return env.getProperty("HR_mail");
	}
	
	 // This called content negotiation use consume=" " for post mapping or posting data
	// It only accept json data if you want to send xml then give "application/xml"
    // If you dont write anything it accept both json as well as xml data
	@PostMapping(value="/addEmployee" , consumes="application/json") 
	@Tag(name="Add Employee", description="Register Employee with Branch")  // This is for swagger
	@Operation(summary="Register-Employee" , description ="Adding Employee information in database")
	public EmployeeResponseDto register(@RequestBody EmployeeRequestDto e) { 
		                                                                       
	    Employee emp = employeeService.register(e);
      
	    EmployeeResponseDto erd = new EmployeeResponseDto();
	                        erd.setName(emp.getName());
	                        erd.setEmail(emp.getEmail());
	                        erd.setMobile(emp.getMobile());
	                        erd.setAddress(emp.getAddress());
	                        erd.setGender(emp.getGender());
	                        erd.setSalary(emp.getSalary());
	                        erd.setRole(emp.getRole());
	                        erd.setBranch(emp.getBranch());
		return erd;  
	}

	
	
	@PutMapping("/v1/update/{id}")
	public Employee updateEmployee(@PathVariable("id") int i, @RequestBody Employee e) {  
		System.out.println(e);
		
		Employee emp = employeeService.updateEmployee(i,e);
		
		return emp;
	}
	
	
	@GetMapping(value="/getById/{id}", produces="application/json")  // This is content negotiation use produces=" " for get mapping or getting data from backend
	public Employee getEmployee(@PathVariable("id") int i) {         // It only produce or give json data if you want to send xml then give "application/xml"
                                                                     // If you dont write anything it send/give both json as well as xml data  
		    if(i<0) {
		    	throw new ArithmeticException("ID can not be Negative.");
		    }else if(i==0) {
		    	throw new NullPointerException("Id can not be null.");
		    }
		    else {
		        Employee e = employeeService.getById(i);	
		        return e;
		    }
		    
	}
	
	
	@GetMapping("/getAllEmployee")
	public  List <Employee> getAllEmployee() {
		
		List <Employee> emp = employeeService.getAllEmployee();
		return emp;
		
	}
	
	@DeleteMapping("/deleteByID/{id}")
	public String deleteByID(@PathVariable("id") int i) {
		
		return employeeService.deleteByID(i);
		
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAll() {
		
		return employeeService.deleteAll();
	}
	
	
	
}
