package com.nt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DateAndTimeServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		Date d = new Date();
		PrintWriter pw = resp.getWriter();//Pen
		pw.write("<h1 style= color:red >Current Date And Time:- <br>"+ d+ "</h1>");
		pw.close();
	}
	
	  
}
