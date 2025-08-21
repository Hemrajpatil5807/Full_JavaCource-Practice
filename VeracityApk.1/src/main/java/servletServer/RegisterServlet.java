package servletServer;

import java.io.IOException;

import empDao.EmployeeDao;
import entity.Employee;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//here read form data
		String fname = req.getParameter("fname");
		String midname = req.getParameter("midname");
		String lname = req.getParameter("lname");

		String mobile = req.getParameter("mobile");
		String email = req.getParameter("email");

		String bdate = req.getParameter("Birthdate");
		String gender = req.getParameter("Gender");
 
		String adr = req.getParameter("Address");       
       
      
//        LoginDao.register(fname, midname, lname, mobile, email, bdate, gender, adr);
		
		Employee e = new Employee(fname, midname, lname, mobile, email, bdate, gender, adr);
		boolean isAdded = EmployeeDao.register(e);
        
//		resp.setContentType("text/html");
//		PrintWriter pw = resp.getWriter();
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		 if(isAdded) {
//			   pw.write("<h1 style= color:green> Register Succesfully </h1>");
//			   pw.close();
			 req.setAttribute("successMsg", "Register Succesfully");
             

		   }else {
//			   pw.write("<h1 style= color:red> Not Register, Please try again.. </h1>");
//			   pw.close();	
			 req.setAttribute("errorMsg", "Not Register, Please try again..");
			   
	    System.out.println(fname+" "+midname+" "+lname+" "+mobile+" "+email+" "+bdate+" "+gender+" "+adr);   
     }
	   rd.forward(req, resp);
		
		
	}
	
	

}
