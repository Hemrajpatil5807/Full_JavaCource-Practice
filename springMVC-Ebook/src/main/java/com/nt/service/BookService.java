package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.BookDao;
import com.nt.entity.Bookdtl;

@Service
public class BookService {

	@Autowired
	BookDao bookDao;
	
	public List<Bookdtl> newBook() {
      
		return bookDao.newBook();
		
	}

	public boolean addBook(Bookdtl book) {
		
		return bookDao.addbook(book);
		
	}

	public List<Bookdtl> recentBook() {
		return bookDao.recentBook();
	}

	public List<Bookdtl> allBooks() {
		return bookDao.allBooks();
	}
	
	

}
