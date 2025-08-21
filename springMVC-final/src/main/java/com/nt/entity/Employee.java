package com.nt.entity;

public class Employee {
	int id;
	String name;
	String mobile;
	String email;
	String address;
	String pan;
	String aadhar;
	String gender;
	String bDate;
    String role;
    float salary;
    String password;
    
    public Employee() {
    	
    }
    
	public Employee(int id, float salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

	public Employee( String name,  String mobile,String email, String address, String pan, String aadhar,
			String gender, String bDate, String role,float salary) {
		
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.pan = pan;
		this.aadhar = aadhar;
		this.gender = gender;
		this.bDate = bDate;
		this.role = role;
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", address="
				+ address + ", pan=" + pan + ", aadhar=" + aadhar + ", gender=" + gender + ", bDate=" + bDate
				+ ", role=" + role + ", salary=" + salary + ", password=" + password + "]";
	}
    
	
    
}
