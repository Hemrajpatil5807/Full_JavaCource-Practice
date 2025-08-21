package controller.service;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import controller.entity.Employee;

@Service
public class HomeService {

	public boolean register(Employee e){
		
	// call another service
		
		RestTemplate template = new RestTemplate();
		String url = "http://localhost:8181/employees/add";
		
		HttpHeaders header = new HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		header.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<Employee> reqEntity = new HttpEntity<Employee>(e,header);
		template.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		
		ResponseEntity<String> resEntity = template.exchange(url, HttpMethod.POST, reqEntity, String.class);
		
		if(resEntity.getBody().equals("ok")) {
			return true;
		}
		
		return false;
		
		
	}

	public Employee getEmployee(int id) {
		System.out.println(id);
		RestTemplate template = new RestTemplate();
		String url = "http://localhost:8181/employees/employeeGetByID/"+id;
		
		HttpHeaders header = new HttpHeaders();
		
		HttpEntity<String> reqEntity = new HttpEntity<String>(url, header);
		
		ResponseEntity<Employee> resEntity = template.exchange(url, HttpMethod.GET, reqEntity, Employee.class);
		
		Employee e = resEntity.getBody();
		
		return e;
	}
	
}
