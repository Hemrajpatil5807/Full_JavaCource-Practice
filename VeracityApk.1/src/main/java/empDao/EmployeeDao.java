package empDao;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entity.ConnectionFactory;
import entity.Employee;

public class EmployeeDao {
	
	private static PreparedStatement ps = null;

//    static int id = 3;
	
	//register dao
	public static boolean register(Employee e) {
		boolean b = false;
		
	try {
		   ps = ConnectionFactory.getCon().prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
		   
		   // Set date in Date Format
//		   SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
//		   Date date = sdf.parse(e.getBdate());
//		   long ms = date.getTime(); 
//		   java.sql.Date date1 = new java.sql.Date(ms);
		   
		   //Convert String to Sql Date object
		   Date date = Date.valueOf(e.getBdate());  // It is a java.sql.Date ojbect  not util.
		   
		   ps.setInt(1, 0);
		   ps.setString(2, e.getFname()+" "+e.getMidname()+" "+e.getLname());
		   ps.setString(3, e.getMobile());
		   ps.setString(4, e.getEmail());
		   ps.setDate(5, date);
		   ps.setString(6, e.getGender());
		   ps.setString(7, e.getAdr());
		   
		   int result = ps.executeUpdate();
		   
		   if(result==1) {
			   b = true;
		   }
		   
		}catch(Exception o) {
			o.printStackTrace();
		}
//	finally {
//			try {
//				ConnectionFactory.getCon().close();
//			} catch (SQLException se) {
//				// TODO Auto-generated catch block
//				se.printStackTrace();
//			}
//      }
	return b;
  }
	
	
	//update dao
public static boolean updateEmployee(int id, String mobile) {
	    boolean b = false;	
	
		try {
			
		    ps = ConnectionFactory.getCon().prepareStatement("update employee set mobile = ? where id = ?");
			
			ps.setString(1,mobile);
			ps.setInt(2, id);
			
			 int result = ps.executeUpdate();
			
			
			 if(result==1) {
				  b = true;
			   }
			
			
		} catch (Exception o) {
			// TODO Auto-generated catch block
			o.printStackTrace();
		}
//		finally {
//	
//			try {
//				ConnectionFactory.getCon().close();
//			} catch (SQLException se) {
//				// TODO Auto-generated catch block
//				se.printStackTrace();
//			}
//		
//		}
		
		 return b;
	}


//Delete method logic

public static boolean deleteEmployee(int id){
	 
	boolean b = false;
	
	try {
	    ps = ConnectionFactory.getCon().prepareStatement("delete from employee where id = ?");
		ps.setInt(1, id);
		
		int result = ps.executeUpdate();
		
		 if(result==1) {
			 b = true;
		   }
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	finally {
//		try {
//			ConnectionFactory.getCon().close();
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//	}

	return b;
   }


//Select logic here

public static Employee selectEmployee(int id) {
	     Employee e = null;
	     try {
		    ps = ConnectionFactory.getCon().prepareStatement("Select * from employee where id=?");
			ps.setInt(1, id);
			
			ResultSet result = ps.executeQuery();
			
			while(result.next()) {
				//fetch the query 
				int id1 = result.getInt("id");
				String name = result.getString("name");
				String mobile = result.getString("mobile");
				String email = result.getString("email");
				String gender = result.getString("gender");
				Date sdate = result.getDate("birthdate");
				String adr = result.getString("address");
				
				// converts java.sql.Date object to java.util.Date
				java.util.Date udate = (java.util.Date)sdate;
				
				//convert java.util.Date object to String 
				SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
				
				String bdate = sdf.format(udate);
				
			     e = new Employee(id1,name, mobile, email, gender, bdate, adr);
				
			}
		} catch (Exception o) {
			o.printStackTrace();
		}
//	     finally {
//	    	 try {
//	    		 ConnectionFactory.getCon().close();
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//	     }
	     
		return e;
		
	}

// select All Employee

  public static List<Employee> selectAllEmployee(){
	  
	   PreparedStatement ps = null;

		try {
		    ps =ConnectionFactory.getCon().prepareStatement("select * from employee");
			
			ResultSet result = ps.executeQuery();
			
			List <Employee> al = new ArrayList<Employee>();
			  
			while(result.next()) {  

				
				 Employee e = new Employee(result.getInt("id"),result.getString("name"),result.getString("mobile"),
						 result.getString("email"),result.getString("birthdate"),result.getString("gender"),
						 result.getString("address"));	
				 
				 al.add(e);
				 
			}
			
			return al;
			
//			resp.setContentType("text/html");
//			PrintWriter pw = resp.getWriter();
//			
//			for(Employee e: al) {
////				System.out.println(e.getName()+"  "+e.getMobile()+"  "+e.getEmail()+"  "+" "+e.getBdate()+"  "+e.getGender()+" "+e.getAdr());
//				pw.write("<h3 style= color:black >Employee Info  : <br>"+ e+ "</h3>");
//			}
//			pw.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		finally {
//			try {
//				ConnectionFactory.getCon().close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	   return null;
	  
  }

// Delete All User
  
  public static boolean deleteAllEmployee() {
	  PreparedStatement ps = null;
		 
		try {
		    ps = ConnectionFactory.getCon().prepareStatement("TRUNCATE TABLE employee;");
			
			int result = ps.executeUpdate();
			
			if(result!=1) 
			     return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return false;
  }
  
  
 
  //end of Dao
}
