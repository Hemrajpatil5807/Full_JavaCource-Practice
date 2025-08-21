package com.nt.dao;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.entity.Employee;

@Repository
public class LoginDao {
	
    @Autowired
	JdbcTemplate jdbcTemplate;
	
    //Register
	public void register(Employee e) {
		
		try {
			
			System.out.println(e);
			
			Object [] args = {e.getId(),e.getName(),e.getMobile(),e.getEmail(),e.getAddress(),e.getPan(),e.getAadhar(),e.getGender(),e.getbDate(),e.getRole(),e.getSalary(),e.getPassword()};
			int result = jdbcTemplate.update("INSERT INTO user (id, name, mobile, email, address, pan, aadhar, gender, dob, role, salary,password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
                                             , args);
			
			if(result == 1) {
				System.out.println("Register");
			}else {
				System.out.println("Not Register");
			}
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
	}

	public Employee login(String username, String password) {
		
		Employee user = null;
		
		try {
			
			Object [] args = {username,password};
			  user = jdbcTemplate.queryForObject("SELECT * FROM user WHERE email = ? AND password = ?",new EmployeeRowMapper(),args);
			
			return user;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	

}
