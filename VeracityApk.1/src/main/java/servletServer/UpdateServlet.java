package servletServer;

import java.io.IOException;
import java.io.PrintWriter;

import empDao.EmployeeDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet{
	
	protected void service(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException{
		
		int id = Integer.parseInt(req.getParameter("id"));
		String mobile = req.getParameter("mobile");
		
		boolean isUpdate = EmployeeDao.updateEmployee(id, mobile);
		
//		resp.setContentType("text/html");
//		PrintWriter pw = resp.getWriter();
		
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		
		 if(isUpdate) {
//			   pw.write("<h1 style= color:green> Mobile Update Succesfully </h1>");
//			   pw.close();
			 req.setAttribute("successMsg", "Mobile Update Succesfully");

		   }else {
//			   pw.write("<h1 style= color:red> Mobile Not Updated </h1>");
//			   pw.close();		
			 req.setAttribute("errorMsg", "Mobile Not Updated");
        }
         rd.forward(req, resp);
	}

}
