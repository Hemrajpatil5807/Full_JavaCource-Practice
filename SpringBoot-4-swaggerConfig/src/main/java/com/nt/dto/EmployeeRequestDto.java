package com.nt.dto;

import com.nt.entity.Branch;

public class EmployeeRequestDto {
	
	
	private int id ;
	private String name;
    private	long mobile;
    private String email;
    private String address;
    private String gender;
	private float salary;
	private String role;
//	private int branch_id;
	private Branch branch;
	private boolean flag;
	
	
	public EmployeeRequestDto(){ }

	public EmployeeRequestDto(int id, String name, float salary, boolean flag, Branch branch_id) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.flag = flag;
		this.branch = branch_id;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

//	public int getBranch_id() {
//		return branch_id;
//	}
//
//	public void setBranch_id(int branch_id) {
//		this.branch_id = branch_id;
//	}

	public long getMobile() {
		return mobile;
	}
	
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	} 

	
	
	
	

}
