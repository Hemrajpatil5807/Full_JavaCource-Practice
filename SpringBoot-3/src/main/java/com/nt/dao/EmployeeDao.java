package com.nt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer>{

}
