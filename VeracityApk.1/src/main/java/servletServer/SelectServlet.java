package servletServer;

import java.io.IOException;
import java.io.PrintWriter;

import empDao.EmployeeDao;
import entity.Employee;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SelectServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		Employee e =  EmployeeDao.selectEmployee(id);
		
		// HERE we print employee information on broweser using pwintwriter 
//		resp.setContentType("text/html");
//		PrintWriter pw = resp.getWriter();
//		pw.write("<h3 style= color:black >Employee Info  :- <br>"+ e+ "</h3>");
//		pw.close();
		
		
		req.setAttribute("emp", e);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, resp);
		
		
		
	}
	
	

}
