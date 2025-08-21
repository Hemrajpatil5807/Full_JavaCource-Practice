package servletServer;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class InboxServlet extends HttpServlet {
	
	//           Cookie Ex
//	@Override      
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////		Cookie[] ck = req.getCookies();
//		
//		String userName = null;
//			
//		if(ck != null) {
//////			for (Cookie cookie : ck) {
//////				if(cookie.getName().equals("user")) {
//////					userName = cookie.getValue();
//////				}
//////			}
//		}
//		if (userName.equals(null) || userName.equals("")) {
//			req.setAttribute("errorMsg", "Invalid user .....");
//			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
//			rd.forward(req, resp);
//		}else {
//			req.setAttribute("loggdinUser", userName);
//			RequestDispatcher rd = req.getRequestDispatcher("inbox.jsp");
//			rd.forward(req, resp);
//			
//		}
//	}

//                  Session Ex
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		String userName = null;
		
		
		
		if(session != null) {
		    userName = (String) session.getAttribute("user");;
		}
		if (userName.equals(null) || userName.equals("")) {
			req.setAttribute("errorMsg", "Invalid user .....");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, resp);
		}else {
			req.setAttribute("loggdinUser", userName);
			RequestDispatcher rd = req.getRequestDispatcher("inbox.jsp");
			rd.forward(req, resp);
			
		}
	}
	
		
	
}
