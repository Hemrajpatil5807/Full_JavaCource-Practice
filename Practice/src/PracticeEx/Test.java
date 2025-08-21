package PracticeEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
//		Product p1 = new Product(101,"Laptop","Good",5,"5/4/2025","7/6/2037",500000f); 
//		String str = "Hello";
//	    StringBuilder rev = new StringBuilder();
//	    rev.append(str);
//		for(int i=0;i<str.length();i++) {
//			rev.append(str.charAt(i));
//			
//		}
//		System.out.println(rev.rev  erse());
		

		
		List <Integer> list = new ArrayList<Integer>();
		               list.add(10);
		               list.add(20);
		               list.add(30);
		               list.add(40);
		               list.add(20);
		               
		     List<Integer> al=Arrays.asList(1,2,3,5,6,7);
		     
		     for(Integer i:list) {
		    	 System.out.println(i);
		     }
		     
		     System.out.println(al);
		     
		     al.set(1, 20);   //here we can replace value in Arrays.asList()    
		     
		     System.out.println(al);

		    
		     String[] array= {"nd","fkj",";nkf","lfj"};
		     
		     List l=Arrays.asList(array); 
		          
		     System.out.println(l);

//		     List<Integer> il=List.of(1, 2,3,4,5);
		     
		     
		    
	}
	
}
