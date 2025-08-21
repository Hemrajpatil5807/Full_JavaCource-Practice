package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmployeeDao;
import com.nt.dto.EmployeeRequestDto;
import com.nt.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	
//	public Employee register(Employee e) { 
//		
//		Employee emp = employeeDao.save(e);
//		return emp;
//	}
     
	// Using RequestDto
	public Employee register(EmployeeRequestDto e) {  
		
//		if(e.isFlag()) {
			
			Employee emp = new Employee();
			         emp.setId(e.getId());
			         emp.setName(e.getName());
			         emp.setSalary(e.getSalary());
			         
	       Employee ep = employeeDao.save(emp);
		   return ep;
//		}
		
//		return null;
	}
	
	

	public Employee getByID(int i) {
		
		Optional<Employee> result = employeeDao.findById(i);
		
		if(result.isPresent()) {
			Employee emp = result.get();
			return emp;	
		}else {
			return null;
		}
		
	}


	public List <Employee> registerAll(List<Employee> emplist) {

		List <Employee> result = (List<Employee>) employeeDao.saveAll(emplist);
		return result;
		
	}


	public List<Employee> getAllEmployee() {
		
		List <Employee> emplist = (List <Employee>)employeeDao.findAll();
		
		return emplist;
	}


	public String deleteByID(int i) {

		employeeDao.deleteById(i);
		return "Delete Succeffully";
	}


	public List<Employee> getByName(String name) {
      
		List <Employee> e = employeeDao.findByName(name);
		
		return e;
	}


	public Employee updateEmployee(Integer id ,Employee e) {
		
		return employeeDao.findById(id)
        .map(emp -> {
            emp.setName(e.getName());
            emp.setSalary(e.getSalary());
            return employeeDao.save(emp);
        })
        .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
	}


}
