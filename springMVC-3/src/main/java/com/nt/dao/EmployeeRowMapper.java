package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nt.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee e = new Employee();
		
		e.setId(rs.getInt("id"));
		e.setName(rs.getString("name"));
		e.setMobile(rs.getString("mobile"));
		e.setEmail(rs.getString("email"));
		e.setbDate(rs.getString("birthdate"));
		e.setGender(rs.getString("gender"));
		e.setAddress(rs.getString("address"));
	
		return e;
	}

}
