package com.nt;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import com.nt.entity.Bookdtl;
import com.nt.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	
	@RequestMapping("/newBook")
	public String newBook(Model model) {
		
		List<Bookdtl> booklist = bookService.newBook();
		System.out.println(booklist);
		model.addAttribute("booklist",booklist);
		return "newBook";
	}
	
	@RequestMapping("/recentBook")
	public String recentBook(Model model) {
		
		List<Bookdtl> booklist = bookService.recentBook();
		System.out.println(booklist);
		model.addAttribute("booklist",booklist);
		return "recentBook";
	}
	
	@RequestMapping("/adminHome")
	public String adminHome() {
		
		return "admin/adminHome";	
	}
	
	@RequestMapping("/addBookPage")
	public String addBookPage() {
		
		return "admin/addBook";	
	}
	
	
//	@RequestMapping("addBook")
//	public String addBook(@RequestParam String bookName, @RequestParam String author, @RequestParam float price,
//			 @RequestParam String bookCategory, @RequestParam String status, @RequestParam String photo, 
//			 @RequestParam String email ,Model model) {
	//	Bookdtl book= new Bookdtl(bookName, author, price, bookCategory, status, photo, email);
		
	@RequestMapping("addBook")
	public String addBook(@ModelAttribute Bookdtl book, HttpServletRequest request, Model model) {

		MultipartFile file = book.getFile();

        if (file == null || file.isEmpty()) {
            model.addAttribute("errmsg", "Please upload a file");
            return "admin/addBook";
        }

        // Get filename
        String fileName = file.getOriginalFilename();
        book.setFileName(fileName); // set in model

        // Store file in /resources/books folder
        String path = request.getServletContext().getRealPath("")+"books";
        System.out.println(path);
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        File serverFile = new File(dir.getAbsolutePath() + File.separator + fileName);
        try {
			file.transferTo(serverFile);
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	    boolean isAdded = bookService.addBook(book);
	    model.addAttribute(isAdded ? "msg" : "errmsg", isAdded ? "Book Added Successfully" : "Book Not Added");
	    return "admin/addBook";
	}

	//All_BOOK_PAGE
	
	@RequestMapping("/allBookPage")
	public String allBookPage() {
		
		return "admin/allBooks";	
	}
	
	@RequestMapping("/allBooks")
	public String allBooks(Model model) {
		
		List<Bookdtl> booklist = bookService.allBooks();
		System.out.println(booklist);
		model.addAttribute("booklist",booklist);
		return "admin/allBooks";
	}
	
	
	
	@RequestMapping("/orderPage")
	public String orderPage() {
		
		return "admin/orders";	
	}
	
}
