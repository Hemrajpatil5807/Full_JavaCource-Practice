package Test.Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;



public class SortListUsingComparator {
	public static void main(String[] args) {
		
		ArrayList <Employee> al = new ArrayList <Employee>();
		              al.add(new Employee(101,"sam",1090));
		              al.add(new Employee(102,"kiran",2090));
		              al.add(new Employee(103,"shyam",3090));
		              al.add(new Employee(104,"ram",4090));

//		   Comparator com =(e1, e2)->{ 
//			       Employee emp1 = (Employee)e1;
//			       Employee emp2 = (Employee)e2;
//			       if(emp1.getSalary()==emp2.getSalary()) {
//			    	   return 0;
//			       }else if(emp1.getSalary()<emp2.getSalary()) { 
//			    	   return 1;
//			       }else {
//			    	   return -1;
//			       }
//			       
//		   };   
		   
//		   Collections.sort(al,com);
		              
		   //we can to that 
//		   al.sort((a,b) -> (int)(b.getSalary() - a.getSalary())); //if a-b = for ascending order b-a for descendomg order
		   
		   Comparator <Employee> com =Comparator.comparing(Employee::getSalary).reversed();
		                         //we can sort list using compring() method of Comparator and reference java8 
		   al.sort(com);
		   
		   for(Employee e: al) {
			   System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		   }
	}

}
