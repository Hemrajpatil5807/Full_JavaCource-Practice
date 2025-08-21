package com.nt.dto;

import com.nt.entity.Branch;

public class EmployeeResponseDto {

	
	private String name;
    private	long mobile;
    private String email;
    private String address;
    private String gender;
	private double salary;
	private String role;
	private Branch branch;
	
	public EmployeeResponseDto(){ }

	public EmployeeResponseDto(String name, long mobile, String email, String address, String gender, double salary,
			String role, Branch branch) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.gender = gender;
		this.salary = salary;
		this.role = role;
		this.branch = branch;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
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

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public double getSalary() {
		return salary;
	}


	public void setSalary(double d) {
		this.salary = d;
	}
	
	
}
