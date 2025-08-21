package com.nt;

public class Employee {

	private int id;
	private String name;
	private float sal;
	private Address adr;

	public Employee(int id, String name, float sal, Address adr) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.adr = adr;
	}
	
	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
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

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public String toString() {
		
		return id+" "+name+" "+sal+" "+adr;
		
	}
	
}
