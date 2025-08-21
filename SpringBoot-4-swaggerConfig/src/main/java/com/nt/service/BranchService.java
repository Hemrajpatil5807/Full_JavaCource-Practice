package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.BranchDao;
import com.nt.entity.Branch;

@Service
public class BranchService {

	@Autowired
	BranchDao branchDao;

	public Branch addBranch(Branch b) {

		Branch br = branchDao.save(b);

//		if (br != null)
//			return true;
//		else
//			return false;
		return br;
	}

	public Branch updateBranch(int id, Branch b) {

		return branchDao.findById(id).map(br -> {
			br.setBranchEmail(b.getBranchEmail());
			br.setBranchName(b.getBranchName());
			br.setContactNo(b.getContactNo());

			return branchDao.save(br);
		}).orElseThrow(() -> new RuntimeException("Branch not found with id: " + id));

	}

	public Branch getBranchById(int id) {

		Optional<Branch> ob = branchDao.findById(id);
		if (ob.isPresent()) {
			Branch b = ob.get();
			return b;
		}
		return null;
	}

	public boolean deleteBranchById(int id) {

		branchDao.deleteById(id);
		Optional<Branch> ob = branchDao.findById(id);

		if (ob.isEmpty())
			return true;
		else
			return false;
	}

	public boolean deleteAllBranch() {

		branchDao.deleteAll();
		long count = branchDao.count();

		if (count == 0)
			return true;
		else
			return false;

	}

	public boolean branchIsExist(int id) {
		
		return branchDao.existsById(id);
	}

}
