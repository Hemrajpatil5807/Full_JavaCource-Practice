package com.nt.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nt.dao.EmployeeDao;
import com.nt.entity.Employee;



@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
			
	public boolean register(Employee e) {
		System.out.println(e);
	 
		return employeeDao.register(e);
	
		
		// call another service
		
//		RestTemplate template = new RestTemplate();
//		String url = "http://localhost:8181/employees/add";
//		
//		HttpHeaders header = new HttpHeaders();
//		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		header.setContentType(MediaType.APPLICATION_JSON);
//		
//		HttpEntity<Employee> reqEntity = new HttpEntity<Employee>(e,header);
//		template.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
//		
//		ResponseEntity<String> resEntity = template.exchange(url, HttpMethod.POST, reqEntity, String.class);
//		
//		if(resEntity.equals("ok")) {
//			return true;
//		}
		
//		return false;

	}

	public boolean update(int id, String mobile) {
		
		return employeeDao.update(id,mobile);
	}

	public Employee select(int id) {
		
		return employeeDao.select(id);	
	}

	public boolean delete(int id) {
		
		return employeeDao.delete(id);
	}

	public boolean deleteAll() {
		
		return employeeDao.deleteAll();
	}

	public List<Employee> selectAll() {
		
		return employeeDao.selectAll();
	}

	public Employee minimumSal() {
		
		return employeeDao.minimumSal();
	}
	
   public Employee maximumSal() {
		
		return employeeDao.maximumSal();
	}

   public List<Employee> salaryBetween() {
	
	return employeeDao.salaryBetween();
    }
	
   public int  numberOfEmployee() {
	   return employeeDao.numberOfEmployee();
   }
   
   public List<Employee> nameStart() {
		
		return employeeDao.nameStart();
   }
   
}