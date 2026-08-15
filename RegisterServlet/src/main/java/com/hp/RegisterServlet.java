package com.hp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		 response.setContentType("text/html");
	     PrintWriter out = response.getWriter();
		
		try {
			
			
			 
			Connection con = ConnectionFactory.getConnection();
			
			String sql = "INSERT INTO user(name, email, password) VALUES (?,?,?)";
			
			PreparedStatement pl = con.prepareStatement(sql);
			
			pl.setString(1, name);
			pl.setString(2, email);
			pl.setString(3, password);
			
			int inrow = pl.executeUpdate();
			
			if(inrow>0) {
				out.println("<h3>Registration Successfully</h3>");
			}else {
				out.println("<h3>Registration Failed!</h3>");
			}
			
			pl.close();
			con.close();
			
		}catch(Exception e) {
			out.println("<h3>Error: " + e.getMessage() + "</h3>");
		}
		
	}
	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		
//		int id = Integer.parseInt(req.getParameter("id"));
//		
//		 res.setContentType("text/html");
//		 PrintWriter out = res.getWriter();
//	     try {
//	    	 
//	    	 Connection con = ConnectionFactory.getConnection();
//	    	 
//	    	 String sql = "SELECT FROM user WHERE id = ?";
//	    	 
//	    	 PreparedStatement pl = con.prepareStatement(sql);
//	    	 pl.setInt(1, id);
//	    	 
//	    	 ResultSet rs = pl.executeQuery();
//	    	 
//	    	 while(rs.next()) {
//	    		 String name = rs.getString("name");
//	    		 String email = rs.getString("email");
//	    		 
//	    		 out.println("<h3>"+ name + "</h3>");
//	    		 out.println("<h3>"+ email + "</h3>");
//	    	 }
//	    	 
//			
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//		
//		
//	}

}
