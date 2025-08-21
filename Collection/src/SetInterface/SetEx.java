package SetInterface;
import java.util.*;



public class SetEx {
	

	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		      al.add(10);
		      al.add(40);
		      al.add(30);
		      al.add(20);
		      al.add(40);
		      al.add(10);
		      
		      System.out.println(al);
		      
		 HashSet h = new HashSet(al);
		 
		     System.out.println(h);
		     
		 LinkedHashSet h1 = new LinkedHashSet(al);
		    
		     System.out.println(h1);
		
		  
	}
	
//	public class Ex {
//		
//		public int a;
//		public int b;
//		
//	   public Ex(int a, int b){
//			this.a = a;
//			this.b = b;
//		}
//		
//		
//		public void show() {
//			
//			System.out.println("a = "+a+" "+"b = "+b);
//		}
//		
//	}

}
