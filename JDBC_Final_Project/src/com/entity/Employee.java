package com.entity;

public class Employee {
	int id;
	String name;
	float salary;
	String mobile;
	String address;
	String pan;
	String aadhar;
	String gender;
	String bDate;
    String role;
    
    
    
	public Employee(int id, float salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

	public Employee(int id, String name, float salary, String mobile, String address, String pan, String aadhar,
			String gender, String bDate, String role) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.mobile = mobile;
		this.address = address;
		this.pan = pan;
		this.aadhar = aadhar;
		this.gender = gender;
		this.bDate = bDate;
		this.role = role;
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

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", mobile=" + mobile + ", address="
				+ address + ", pan=" + pan + ", aadhar=" + aadhar + ", gender=" + gender + ", bDate=" + bDate
				+ ", role=" + role + "]";
	}
    
	
    
}
