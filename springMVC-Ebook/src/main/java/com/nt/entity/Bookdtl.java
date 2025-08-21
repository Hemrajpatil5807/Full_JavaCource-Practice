package com.nt.entity;

import org.springframework.web.multipart.MultipartFile;

public class Bookdtl {

	int bookId;
	String bookName;
	String author;
	float price;
	String bookCategory;
	String status;
//	String photo;
	String email;

	private MultipartFile file; // This will hold the uploaded file
	 String filename;

	public Bookdtl() {
	}

	public Bookdtl(int bookId, String bookName, String author, float price, String bookCategory, String status,
			MultipartFile file, String email) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.bookCategory = bookCategory;
		this.status = status;
		this.file = file;
		this.email = email;
	}

	public Bookdtl(String bookName, String author, float price, String bookCategory, String status, MultipartFile file,
			String email) {

		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.bookCategory = bookCategory;
		this.status = status;
		this.file = file;
		this.email = email;
	}
	
	// Getters and Setters for all fields including file

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}


	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

//	public String getPhoto() {
//		return photo;
//	}
//
//	public void setPhoto(String photo) {
//		this.photo = photo;
//	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Bookdtl [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ ", bookCategory=" + bookCategory + ", status=" + status + ", email=" + email + ", filename=" + filename + "]";
	}

	public void setFileName(String filename) {
	
		this.filename = filename;
		
	}
	
	public String getFileName() {
		
		return filename;
		
	}
	

}
