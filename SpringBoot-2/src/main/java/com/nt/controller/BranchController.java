package com.nt.controller;

import java.util.List;

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

import jakarta.validation.Valid;


@RestController
@RequestMapping("/branch")
public class BranchController {
	
	@Autowired
	BranchService branchService;
	
	@PostMapping("/addBranch")
	public String addBranch(@RequestBody @Valid  Branch b) {
		
		boolean isSave =  branchService.addBranch(b);
		
		if(isSave) {
			return "Branch Added Succefully !";
		}else {
			return "Branch Not Added !";
		}
	}
	
	@PostMapping("/addManyBranches")
	public String addMoreBranch(@RequestBody @Valid List<Branch> b) {
		
		boolean isAdded = branchService.addMoreBranch(b);
		
		if(isAdded) {
			return "Branches Added Succefully !";
		}else {
			return "Branches Not Added !";
		}
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
	
	
	@GetMapping("/getBranchByName")
	public Branch getBranchByName(@RequestParam("name") String name) {
		
		Branch br = branchService.getBranchByName(name);
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
	
	
	@GetMapping("/getBranchCount")
	public long branchCount() {
		
	   long br = branchService.branchCount();
		if(br > 0)
		   return br;
		else			
		   return 0;
	}
	
	
	@GetMapping("/isExist")
	public String isExist(@RequestParam("id") int id) {
		
		boolean b = branchService.isExist(id);
		if(b)
			return "Branch is Present";
	    else	
		    return "Branch not Present";
	}
	
	
	
	
}
