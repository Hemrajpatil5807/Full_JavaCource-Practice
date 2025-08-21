package servletServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.ConnectionFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteAllServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		   PreparedStatement ps = null;
			 
			try {
			    ps = ConnectionFactory.getCon().prepareStatement("TRUNCATE TABLE employee;");
				
				int result = ps.executeUpdate();
				
				resp.setContentType("text/html");
				PrintWriter pw = resp.getWriter();
				
				 if(result!=1) {
					   pw.write("<h1 style= color:green> Delete All Record Successfully </h1>");
					   pw.close();
				   }else {
					   pw.write("<h1 style= color:red> ALL Record Not Deleted </h1>");
					   pw.close();
				   }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					ConnectionFactory.getCon().close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
 
	}
	
	

}
