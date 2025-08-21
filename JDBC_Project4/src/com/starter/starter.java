package com.starter;
import java.util.*;

import com.controller.EmployeeDelete;
import com.controller.EmployeeRegister;
import com.controller.EmployeeSelect;
import com.controller.EmployeeSelectAll;
import com.controller.EmployeeUpdate;
import com.dao.EmployeeDao;

public class starter {
	
	public static void main(String[] args) {
		  
		Scanner sc = new Scanner(System.in);
		
		 int choice = 0;
		 
		System.out.println("Enter Your Choice : ");
		
		System.out.println("Press 1 : Employee Registration ");
		      
	    System.out.println("Press 2 : Update Employee Details ");
		     
		System.out.println("Press 3 : Delete Employee ");
		      
		System.out.println("Press 4 : Select Employee ");
		
		System.out.println("Press 5 : Select All Employee ");
		     choice = sc.nextInt();		     
		     
		     
		 switch(choice) {
		 
		     case 1: EmployeeRegister er = new EmployeeRegister();
		                     er.register();
		          break;
		     case 2: EmployeeUpdate eu = new EmployeeUpdate();
		                      eu.updateEmployee();
	          break;
		     case 3: EmployeeDelete ed = new EmployeeDelete();
		                      ed.deleteEmployee();
	          break;
      	     case 4: EmployeeSelect es = new EmployeeSelect();
      	                      es.selectEmployee();
	          break;
      	     case 5: EmployeeDao ea = new EmployeeDao();
      	                      ea.selectAllEmployee();
      	    	 break;
	         default: System.out.println("Please Enter Valid Choice");
	          break;
		 }
	}

}
