package com.nt.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nt.entity.Branch;

@Repository
public interface BranchDao extends CrudRepository<Branch, Integer>{

	@Query("SELECT b FROM Branch b WHERE b.branchName = :name")
	Branch findByName(@Param("name") String name);
	
	
}
