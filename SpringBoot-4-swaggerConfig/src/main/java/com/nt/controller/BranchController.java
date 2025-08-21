package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Branch;
import com.nt.service.BranchService;


@RestController
@RequestMapping("/branch")
public class BranchController {
	
	@Autowired
	BranchService branchService;
	
	@PostMapping("/addBranch")
	public Branch addBranch(@RequestBody Branch b) {
		
//		boolean isSave =  branchService.addBranch(b);
		
//		if(isSave) {
//			return "Branch Added Succefully !";
//		}else {
//			return "Branch Not Added !";
//		}
		
		Branch br = branchService.addBranch(b);
		return br;
	}
	
	
	@PostMapping("/updateBranch")
	public String updateBranch(@RequestParam("id") int id, @RequestBody Branch b) {
		
		Branch br = branchService.updateBranch(id, b);
		if(br != null) {
			return "Branch Updated Succefully !";
		}else {
			return "Branches Not Updated !";
		}
	}
	
	
	@GetMapping("/getBranch")
	public Branch getBranchById(@RequestParam("id") int id) {
		
		Branch br = branchService.getBranchById(id);
		return br;
	}
	
	
	@DeleteMapping("/deleteBranch")
	public String deleteBranchById(@RequestParam("id") int id) {
		
		boolean b = branchService.deleteBranchById(id);
		if(b){
			return "Branch Deleted Succefully !";
		}
		return "Branch Not Deleted !";
	}
	
	
	@DeleteMapping("/deleteAllBranch")
	public String deleteAllBranch() {
		
		boolean br = branchService.deleteAllBranch();
		
		if(br)
			return "Branches Deleted Succefully !";
		else
		    return "Branches Not Deleted !";
	}
	
	
	@GetMapping("/isExist")
	public boolean branchIsExist(@RequestParam("id") int id) {
		
		return branchService.branchIsExist(id);
	}
	

}
