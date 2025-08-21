package servletServer;

import java.io.IOException;
import java.io.PrintWriter;

import empDao.EmployeeDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		boolean isDelete = EmployeeDao.deleteEmployee(id);
		
//		resp.setContentType("text/html");
//		PrintWriter pw = resp.getWriter();
		
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		 if(isDelete) {
//			   pw.write("<h1 style= color:green> Delete Record Successfully </h1>");
//			   pw.close();
			 req.setAttribute("sucssesMsg", "Delete Record Succesfully");

		   }else {
//			   pw.write("<h1 style= color:red> Record Not Deleted </h1>");
//			   pw.close();
				 req.setAttribute("errorMsg", "Record Not Deleted");
	}
		 rd.forward(req, resp);
	
  }

}
