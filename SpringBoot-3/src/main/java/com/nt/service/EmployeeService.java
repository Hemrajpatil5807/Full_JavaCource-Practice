package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmployeeDao;
import com.nt.dto.EmployeeRequestDto;
import com.nt.entity.Branch;
import com.nt.entity.Employee;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	@Autowired
	BranchService branchService;

	public Employee register(EmployeeRequestDto e) {

		if(e.isFlag()) {
			
			Employee emp = new Employee();
			emp.setName(e.getName());
			emp.setEmail(e.getEmail());
			emp.setMobile(e.getMobile());
			emp.setAddress(e.getAddress());
			emp.setGender(e.getGender());
			emp.setSalary(e.getSalary());
			emp.setRole(e.getRole());
//			Branch br = branchService.getBranchById(e.getBranch_id());			
//			emp.setBranch(br);
			boolean isPresent = branchService.branchIsExist(e.getBranch().getBranchId());
			System.out.println(isPresent);
			if(isPresent) {
				emp.setBranch(e.getBranch());
			}else {
				emp.setBranch( branchService.addBranch(e.getBranch()));
			}
			Employee er = employeeDao.save(emp);
			
			if (er != null)
				return emp;
				
		}
		return null;
		
	}

	public Employee updateEmployee(Integer id, Employee e) {

		return employeeDao.findById(id).map(emp -> {
			emp.setName(e.getName());
			emp.setMobile(e.getMobile());
			emp.setEmail(e.getEmail());
			emp.setAddress(e.getAddress());
			emp.setGender(e.getGender());
			emp.setRole(e.getRole());
			emp.setSalary(e.getSalary());
			emp.setBranch(e.getBranch());
			return employeeDao.save(emp);
		}).orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
	}

	
	
	public Employee getById(int i) {
		Optional<Employee> op = employeeDao.findById(i);
		if(op.isPresent()) {
		   Employee e = op.get();
		   return e;
		}
		return null;
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
	
	
	
	
}