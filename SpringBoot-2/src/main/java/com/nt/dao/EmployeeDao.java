package com.nt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nt.entity.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer>{

	@Query("SELECT e FROM Employee e WHERE e.name = :name")  //here Employee is Entity
    List <Employee> findByName(@Param("name") String name);

	@Query("SELECT e FROM Employee e WHERE e.salary > :salary")
	List <Employee> findGreaterSal(@Param("salary") float s);
	
	@Query("SELECT e FROM Employee e WHERE e.salary < :salary")
	List <Employee> findLessSal(@Param("salary") float s);
	
}
