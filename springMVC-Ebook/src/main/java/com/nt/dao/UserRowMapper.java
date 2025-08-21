package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nt.entity.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		User e = new User();
		 e.setName(rs.getString("name"));
		 e.setEmail(rs.getString("email"));
		 e.setPassword(rs.getString("password"));
		 
		 return e;
	}

}
