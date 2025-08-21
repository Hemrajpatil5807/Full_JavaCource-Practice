package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.entity.User;

@Repository
public class LoginDao {
	
    @Autowired
	JdbcTemplate jdbcTemplate;
	
    //Register
	public boolean register(User e) {
		
		try {
			
			System.out.println(e);
			
			Object [] args = {e.getId(),e.getName(),e.getEmail(),e.getMobile(),e.getAddress(),e.getPan(),e.getAadhar(),e.getGender(),e.getbDate(),e.getPassword()};
			int result = jdbcTemplate.update("INSERT INTO user VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", args);
			
			if(result == 1) {
				return true;
			}else {
				return false;
			}
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return false;
	}

	public User login(String username, String password) {
		
		User user = null;
		
		try {
			
			Object [] args = {username,password};
			  user = jdbcTemplate.queryForObject("SELECT * FROM user WHERE email = ? AND password = ?",new UserRowMapper(),args);
			
			return user;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	

}
