package com.nt.dto;

public class EmployeeRequestDto {

	private int id;
	private String name;
	private float salary;
	//private boolean flag;
	
	public EmployeeRequestDto(int id, String name, float salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		//this.flag = flag;
	}
	
	public EmployeeRequestDto() {}

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

//	public boolean isFlag() {
//		return flag;
//	}
//
//	public void setFlag(boolean flag) {
//		this.flag = flag;
//	}

	@Override
	public String toString() {
		return "EmployeeRequestDto [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
