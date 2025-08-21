package servletServer;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogOutServlet extends HttpServlet{
//              Cookie Ex
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	          
////		          Cookie ck = new Cookie("user",null);
////                resp.addCookie(ck);		
//		          
//		        req.setAttribute("successMsg", "LogOut  Successfully");
//				RequestDispatcher rd = req.getRequestDispatcher("landing.jsp");
//				rd.forward(req, resp);
//		
//	}
	
//                 Session Ex	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	         	
		          HttpSession session = req.getSession();
		          session.invalidate();
		          
		        req.setAttribute("successMsg", "LogOut  Successfully");
				RequestDispatcher rd = req.getRequestDispatcher("landing.jsp");
				rd.forward(req, resp);
		
		}

}
