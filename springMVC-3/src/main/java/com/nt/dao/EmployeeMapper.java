package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nt.entity.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				
      Employee e = new Employee();
		
		e.setId(rs.getInt("id"));
		e.setName(rs.getString("name"));
		e.setSalary(rs.getFloat("salary"));
		
		
//		Employee e = new Employee(rs.getInt("id"),rs.getString("name"),rs.getFloat("salary"));
		
		return e;
	}

}
