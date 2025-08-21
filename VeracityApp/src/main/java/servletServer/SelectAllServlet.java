package servletServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import empDao.EmployeeDao;
import entity.ConnectionFactory;
import entity.Employee;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SelectAllServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
             List<Employee> Emplist = EmployeeDao.selectAllEmployee();
		  
             req.setAttribute("empList", Emplist);
             RequestDispatcher rd = req.getRequestDispatcher("displayAll.jsp");
             rd.forward(req, resp);
             
		
	}
	
	

}
