package com.nt.entity;


import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name="branch")
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column
	private int branchId;
	
	@Column
	@NonNull
	@NotEmpty
	private String branchName;
	
	@Column
	@Email
	private String branchEmail;
	
	@Column
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
