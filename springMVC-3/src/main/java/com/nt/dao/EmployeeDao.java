package com.nt.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.entity.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public boolean register(Employee e) {

		try {
//				   ps = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");

			Object[] args = { e.getId(), e.getName(), e.getMobile(), e.getEmail(), e.getbDate(), e.getGender(),
					e.getAddress() };
			int result = jdbcTemplate.update("insert into employee values(?,?,?,?,?,?,?)", args);

			if (result == 1) {
				return true;
			}
		} catch (Exception o) {
			o.printStackTrace();
		}

		return false;
	}

	public boolean update(int id, String mobile) {

		try {

			Object[] args = { mobile, id };
			int result = jdbcTemplate.update("update employee set mobile = ? where id = ?", args);

			if (result == 1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
	
	
	//select

	public Employee select(int id) {
		Employee e = null;
		try {

			Object[] args = { id };
			e = jdbcTemplate.queryForObject("select *from employee where id = ?",new EmployeeRowMapper(), args);

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return e;

	}

	public List<Employee> selectAll() {

		try {
		List<Employee> employeelist = jdbcTemplate.query("SELECT * FROM employee", new EmployeeRowMapper());

		return employeelist ;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
	// delete
	public boolean delete(int id) {

		try {

			Object[] args = { id };
			int result = jdbcTemplate.update("delete from employee where id = ?", args);

			if (result == 1) {
				return true;
			}

		} catch (Exception e1) {
			e1.printStackTrace();
		}

		return false;
	}

	public boolean deleteAll() {
		try {

			int result = jdbcTemplate.update("TRUNCATE TABLE employee");

			if (result != 1) {
				return true;
			}

		} catch (Exception e1) {
			e1.printStackTrace();
		}

		return false;
	}

	//minimum salary
	public Employee minimumSal() {
		
		try {
			
		 Employee e = jdbcTemplate.queryForObject("SELECT * FROM user WHERE salary = (SELECT MIN(salary) FROM user)", new EmployeeMapper());
			
		return e;
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return null;
	}
	
	//maximum salary
	public Employee maximumSal() {
		
		try {
			
		   Employee e = jdbcTemplate.queryForObject("SELECT * FROM user WHERE salary = (SELECT MAX(salary) FROM user)", new EmployeeMapper());
								
		   return e;
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return null;
	}
	
	
	// salary Between
	public List<Employee> salaryBetween() {
		
		try {
			List<Employee> employeelist = jdbcTemplate.query("Select * from user where salary between 1000 and 15000", new EmployeeMapper());

			return employeelist ;
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		return null;
	}

	// number of Employees
	public int numberOfEmployee() {
		
		try {
			
			int total = jdbcTemplate.queryForObject( "SELECT COUNT(*) AS total_employees FROM user",Integer.class);	
			return total;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
		
	}
	
	// Name Starts with
	public List<Employee> nameStart() {
        char prefix = 'H';
		try {
		List<Employee> employeelist = jdbcTemplate.query("SELECT * FROM user WHERE name LIKE ?",new Object[]{prefix + "%"}, new EmployeeMapper());

		return employeelist ;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	

}
