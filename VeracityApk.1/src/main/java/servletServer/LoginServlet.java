package servletServer;


import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	
//                        Cookie Ex
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
//		      
//		       String userName = req.getParameter("username");
//		       String passWord = req.getParameter("password");
//		       
//		   	if(userName.equals(passWord)) {
//				//valid
//			       
////			       Cookie c = new Cookie("user", userName);
////				   Cookie c1 = new Cookie("Role", "HR");
////					resp.addCookie(c);
////					resp.addCookie(c1);
//			       
//				req.setAttribute("successMsg", "Login sucessfully");
//				RequestDispatcher rd = req.getRequestDispatcher("dashboard.jsp");
//				rd.forward(req, resp);
//			}else {
//				req.setAttribute("errorMsg", "Invalid user .....");
//				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
//				rd.forward(req, resp);
//			}
//		
//	}

//                           Session Ex
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		      
		       String userName = req.getParameter("username");
		       String passWord = req.getParameter("password");
		       
		   	if(userName.equals(passWord)) {
				//valid
			       //We can set Session cookies now
			       HttpSession session = req.getSession();
			       session.setAttribute("user", userName);
			       
				req.setAttribute("successMsg", "Login sucessfully");
				RequestDispatcher rd = req.getRequestDispatcher("dashboard.jsp");
				rd.forward(req, resp);
			}else {
				req.setAttribute("errorMsg", "Invalid user .....");
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.forward(req, resp);
			}
		
	}
	
	
}
