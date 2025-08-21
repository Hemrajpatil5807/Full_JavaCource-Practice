package com.nt.dto;

public class EmployeeResponseDto {
	
	private String name;
	private float salary;
	
	public EmployeeResponseDto(){ }

	
	public EmployeeResponseDto(String name, float salary) {
		this.name = name;
		this.salary = salary;
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
	
	
	
	
	
}
