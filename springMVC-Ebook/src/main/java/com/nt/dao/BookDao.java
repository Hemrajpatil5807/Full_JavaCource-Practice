package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.nt.entity.Bookdtl;

@Repository
public class BookDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Bookdtl> newBook() {
	
		try {
			String n ="New";
			String active = "Active";
			
			Object [] args = {n,active};
			List<Bookdtl> booklist = (List<Bookdtl>) jdbcTemplate.query("select *from book_dts where bookCategory= ? and status= ?", new BookRowMapper(), args);
			System.out.println(booklist);
			return booklist;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

	public boolean addbook(Bookdtl book) {
		System.out.println(book);
		
		try {
			Object [] args = {book.getBookId(),book.getBookName(),book.getAuthor(),book.getPrice(),book.getBookCategory(),book.getStatus(),book.getFile().getOriginalFilename(),book.getEmail()};
			
			int result = jdbcTemplate.update("INSERT INTO book_dts VALUES (?, ?, ?, ?, ?, ?, ?, ? )",args);
			
			if(result == 1) {
				
				return true;
			}
			
		}catch (Exception e1) {
			
			e1.printStackTrace();
		}
		return false;
	}

	public List<Bookdtl> recentBook() {
		
		try {
			String n ="New";
			String active = "Active";
			
			Object [] args = {n,active};
			List<Bookdtl> booklist = (List<Bookdtl>) jdbcTemplate.query("select *from book_dts where bookCategory= ? and status= ?", new BookRowMapper(), args);
			System.out.println(booklist);
			return booklist;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	public List<Bookdtl> allBooks() {

		try {
			
			List<Bookdtl> booklist = (List<Bookdtl>) jdbcTemplate.query("SELECT * FROM book_dts", new BookRowMapper());
			System.out.println(booklist);
			return booklist;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	
	
}
