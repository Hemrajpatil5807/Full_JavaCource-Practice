package com.nt;

public class StringArray {
	
	String [] str;
	
	public void setStr(String [] str) {
		this.str = str;
	}
	
	public void display() {
		for(String s : str) {
			System.out.println(s);
		}
	}

}
