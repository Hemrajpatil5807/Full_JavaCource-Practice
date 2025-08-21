package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.service.annotation.PatchExchange;

import com.nt.dto.EmployeeRequestDto;
import com.nt.dto.EmployeeResponseDto;
import com.nt.entity.Employee;
import com.nt.service.EmployeeService;

import jakarta.annotation.PostConstruct;

@RestController                         // @Controller +  @ResponseBody = @RestController    it returns   data
@RequestMapping("/employees")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
//	@RequestMapping(value = "/test" method = RequestMethod.GET )
//	@ResponseBody                         // It is used to send JSON formate response to service API call
//	public Employee Testing() {
//		Employee e = new Employee(101, "Hemraj", 1000);
//		return e;
//	}
	
	
//	@RequestMapping(value = "/test/{id}/{name}")
//	@ResponseBody
	@GetMapping(value = "/test/{id}/{name}")
	public Employee Testing1(@PathVariable("id") int i, @PathVariable("name") String name) {
		Employee e = new Employee(i,name,1000);
		return e;	
	}
	
	
	@GetMapping(value = "/test")
	public Employee Testing2(@RequestParam("id") int i, @RequestParam("name") String name) {
		Employee e = new Employee(i,name,1200);
		return e;
	}
	
//	@PostMapping("/employee")
//	public Employee register(@RequestBody Employee e) {  // @RequestBody reads whole form data. and convert it in object
//		System.out.println(e);
//		
//		employeeService.register(e);
//		
//		return e;
//	}
	
	// we always use RequestDto to get data from client 
	@PostMapping("/add")
	public String register(@RequestBody EmployeeRequestDto erd) {
		
	    Employee e = employeeService.register(erd);
//		System.out.println(e);
	    if(e!=null)
		    return "ok";
	    else
	    	return "notOK";
	}
	
	
	@PostMapping("/employeeUpdate/{id}")
	public Employee updateEmployee(@PathVariable("id") int i, @RequestBody Employee e) {  
		System.out.println(e);
		
		Employee emp = employeeService.updateEmployee(i,e);
		
		return emp;
	}
	
	@PostMapping("/allEmployee")
	public List<Employee> registerAll(@RequestBody List<Employee> emplist) {
		System.out.println(emplist);
		
		List <Employee> emp = employeeService.registerAll(emplist);
		
		return emp;
	}
	
	
	
	@GetMapping("/employeeGetByID/{id}")
	public  Employee getById(@PathVariable("id") int i) {
		
		Employee emp = employeeService.getByID(i);
		
//		EmployeeResponseDto ept = new EmployeeResponseDto(emp.getName(), emp.getSalary()); // commented for MicroServices
		return emp;
		
	}
	
	@GetMapping("/GetByName/{name}")
	public List<Employee> getByName(@PathVariable("name") String name) {
		
		List<Employee> emp = employeeService.getByName(name);
		
		return emp;
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
	
	
}
