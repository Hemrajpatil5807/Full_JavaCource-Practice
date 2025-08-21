package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dto.EmployeeRequestDto;
import com.nt.entity.Employee;
import com.nt.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
//	@Value("${message}")   // First Way To read data from properties file
//	private String msg ;
	
	@Autowired
	private Environment ev;
	
	@PostMapping("/addEmployee")
	public String register(@RequestBody @Valid Employee e) {
		
	    Employee emp = employeeService.register(e);
		System.out.println(emp);
		
		String msg = ev.getProperty("message");
		return msg;  // send Properties File message to API caller
	}
	
	@PostMapping("/manyEmployee")
	public List<Employee> registerAll(@RequestBody List<Employee> emplist) {
		System.out.println(emplist);
		
		List <Employee> emp = employeeService.registerAll(emplist);
		
		return emp;
	}
	
	@PostMapping("/employeeUpdate/{id}")
	public Employee updateEmployee(@PathVariable("id") int i, @RequestBody Employee e) {  
		System.out.println(e);
		
		Employee emp = employeeService.updateEmployee(i,e);
		
		return emp;
	}
	
	@GetMapping("/getById/{id}")
	public Employee getEmployee(@PathVariable("id") int i) {
		
		Employee e = employeeService.getById(i);	
		return e;
		
	}
	
	@GetMapping("/getByName/{name}")
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
	
	@DeleteMapping("/deleteAll")
	public String deleteAll() {
		
		return employeeService.deleteAll();
	}
	
	@GetMapping("/salGreaterThan/{salary}")  //Greater than 30000
	public List<Employee> salGreaterThan(@PathVariable("salary") float s){
		List<Employee> el = employeeService.salGreaterThan(s);
		System.out.println(el);
		return el;
		
	}
	
	@GetMapping("/salLessThan/{salary}")  //Greater than 30000
	public List<Employee> salLessThan(@PathVariable("salary") float s){
		List<Employee> el = employeeService.salLessThan(s);
		System.out.println(el);
		return el;
		
	}
	
	@GetMapping("/numberOfEmployee")
	public long EmployeeCount() {
		
		long count = employeeService.EmployeeCount();
		return count;
	}
	
	@GetMapping("/employeeExist/{id}")
	public boolean EmployeeExist(@PathVariable("id") int i) {
		
		boolean isExist = employeeService.EmployeeExist(i);
		return isExist;
	}
	
	
	
}
