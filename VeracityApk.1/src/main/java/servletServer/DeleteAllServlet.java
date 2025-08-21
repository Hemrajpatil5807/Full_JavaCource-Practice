package servletServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import empDao.EmployeeDao;
import entity.ConnectionFactory;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteAllServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		boolean result = EmployeeDao.deleteAllEmployee();
		
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		
		 if(result) {
			   req.setAttribute("successMsg", "Delete All Record Successfully");
		   }else {
			   req.setAttribute("errorMsg", "ALL Record Not Deleted");

		   }
          rd.forward(req, resp);
	}
	
	
}
