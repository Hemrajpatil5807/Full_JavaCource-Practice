package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.BranchDao;
import com.nt.entity.Branch;


@Service
public class BranchService {

	@Autowired
	BranchDao branchDao;
	
	
	public boolean addBranch(Branch b) {
		
		Branch br = branchDao.save(b);
		
		if(br != null)
			return true;
		else
			return false;
	}


	public boolean addMoreBranch(List<Branch> b) {
		
		List<Branch> bl = (List<Branch>) branchDao.saveAll(b);
		if(bl != null)
			return true;
		else
			return false;
	}


	public Branch updateBranch(int id, Branch b) {
		
		return branchDao.findById(id)
		.map(br -> {
			br.setBranchEmail(b.getBranchEmail());
			br.setBranchName(b.getBranchName());
			br.setContactNo(b.getContactNo());
			
			return branchDao.save(br);
		})
	    .orElseThrow(() -> new RuntimeException("Branch not found with id: " + id));
		
	}


	public Branch getBranchById(int id) {
		
		Optional<Branch> ob = branchDao.findById(id);
		if(ob.isPresent()) {
			Branch b = ob.get();
			return b;
		}
		return null;
	}


	public Branch getBranchByName(String name) {
		Branch b = branchDao.findByName(name);
		if(b != null)
		    return b;
		else
			return null;
	}


	public boolean deleteBranchById(int id) {
		
		branchDao.deleteById(id);
		Optional<Branch> ob = branchDao.findById(id);
        
		if(ob.isEmpty())
			return true;
		else
		    return false;
	}


	public boolean deleteAllBranch() {

		branchDao.deleteAll();
		long count = branchDao.count();
		
		if(count == 0)
			return true;
		else
			return false;
		
	}


	public long branchCount() {

		long count = branchDao.count();
		return count;
		
	}


	public boolean isExist(int id) {
		
		return branchDao.existsById(id);
	}

	
	
	
}
