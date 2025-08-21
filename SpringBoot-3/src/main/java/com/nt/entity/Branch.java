package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="branch")
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="branchId")
	private int branchId;
	
	@Column(name="branchName")
	private String branchName;
	
	@Column(name="branchEmail")
	private String branchEmail;
	
	@Column(name="contactNo")
	private long contactNo;
	
	public Branch () {
		
	}
	
	public Branch (int branchId, String branchName, String branchEmail, long contactNo ) {
		
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchEmail = branchEmail;
		this.contactNo = contactNo;
		
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchEmail() {
		return branchEmail;
	}

	public void setBranchEmail(String branchEmail) {
		this.branchEmail = branchEmail;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", branchEmail=" + branchEmail
				+ ", contactNo=" + contactNo + "]";
	}
	
	
	
	
	
}
