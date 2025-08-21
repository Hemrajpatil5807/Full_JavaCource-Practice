package com.nt.entity;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	int id;
	String name;
	String mobile;
	String email;
	String bDate;
	String gender;
	String address;
    float salary;
    
    public Employee(int id, String name, String mobile, String email, String bDate, String gender, String address) {
    	this.id=id;
    	this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.bDate = bDate;
		this.gender = gender;
		this.address = address;
    }
	
	public Employee( String name, String mobile, String email, String bDate, String gender, String address) {
		super();
		
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.bDate = bDate;
		this.gender = gender;
		this.address = address;
	
	}
	
	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee() {
		
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail( String email) {
		this.email = email;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getbDate() {
		return bDate;
	}

	public void setbDate(String bDate) {
		this.bDate = bDate;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email +  ", bDate=" + bDate + ", gender=" + gender + ", address="
				+ address + "]";
	}
    
	
    
}
