package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(104, "shyam");
		Employee e2 = new Employee(101, "sam");
		Employee e3 = new Employee(103, "ram");
		Employee e4 = new Employee(102, "ganesh");
		
		
		ArrayList <Employee> a = new ArrayList <Employee>();
		         a.add(e1);
		         a.add(e2);
		         a.add(e3);
		         a.add(e4);
		         
//		         Comparator<Employee> c = (ex,ey)->{
//		         Integer I1 = ex.id;
//		         Integer I2 = ey.id;
//		         return(I1.compareTo(I2));
//		         };
		         
		         
		Comparator <Employee> c = (ex,ey)->(ex.id<ey.id)?-1:(ex.id>ey.id)?1:0;    
		
		   Collections.sort(a,c);     
		   
		   for(int i =0; i<a.size(); i++)
			   	System.out.println(a.get(i).id+"  "+a.get(i).name);   
		   
	}

}
