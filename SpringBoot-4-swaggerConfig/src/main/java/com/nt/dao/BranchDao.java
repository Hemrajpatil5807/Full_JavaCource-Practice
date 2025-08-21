package com.nt.dao;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Branch;

public interface BranchDao extends CrudRepository<Branch, Integer> {

}
