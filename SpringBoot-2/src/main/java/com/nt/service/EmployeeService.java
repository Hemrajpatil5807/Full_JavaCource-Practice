package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmployeeDao;
import com.nt.entity.Employee;




@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;

     public Employee register( Employee emp) {  
		
		
//			Employee emp = new Employee();
//			         emp.setId(e.getId());
//			         emp.setName(e.getName());
//			         emp.setSalary(e.getSalary());
			         
	       Employee ep = employeeDao.save(emp);
		   return ep;
	}
     
 	public List <Employee> registerAll(List<Employee> emplist) {

		List <Employee> result = (List<Employee>) employeeDao.saveAll(emplist);
		return result;
		
	}


	public Employee updateEmployee(Integer id ,Employee e) {
		
		return employeeDao.findById(id)
        .map(emp -> {
            emp.setName(e.getName());
            emp.setMobile(e.getMobile());
            emp.setEmail(e.getEmail());
            emp.setAddress(e.getAddress());
            emp.setAadhar(e.getAadhar());
            emp.setPan(e.getPan());
            emp.setGender(e.getGender());
            emp.setbDate(e.getbDate());
            emp.setRole(e.getRole());
            emp.setSalary(e.getSalary());
            emp.setPassword(e.getPassword());
            return employeeDao.save(emp);
        })
        .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
	}
     
     
	public Employee getById(int i) {
		Optional<Employee> op = employeeDao.findById(i);
		if(op.isPresent()) {
		   Employee e = op.get();
		   return e;
		}
		return null;
	}
	
	public List<Employee> getByName(String name) {
	      
		List <Employee> e = employeeDao.findByName(name);
		
		return e;
	}
	
	public List<Employee> getAllEmployee() {
		
		List <Employee> emplist = (List <Employee>)employeeDao.findAll();
		
		return emplist;
	}
	
	public String deleteByID(int i) {

		employeeDao.deleteById(i);
		return "Delete Succeffully";
	}

	public String deleteAll() {
		
		employeeDao.deleteAll();
		return "All Record Delete Succefully";
	}

	public List<Employee> salGreaterThan(float s) {
    
		List<Employee> elist = employeeDao.findGreaterSal(s);	
		System.out.println(elist);
		return elist;
	}
	
	public List<Employee> salLessThan(float s) {
		
		List<Employee> elist = employeeDao.findLessSal(s);	
		System.out.println(elist);
		return elist;
	}

	public long EmployeeCount() {
		
	    long result = employeeDao.count();
		return result;
	}

	public boolean EmployeeExist(int i) {
		
		boolean result = employeeDao.existsById(i);
		return result;
	}

	

	
	

}
