package com.nt.dto;

public class EmployeeResponseDto {

	private String name;
	private float salary;
	
	public EmployeeResponseDto(String name, float salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public EmployeeResponseDto() { }

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

	@Override
	public String toString() {
		return "EmployeeResponseDto [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
