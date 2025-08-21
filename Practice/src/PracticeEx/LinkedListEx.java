package PracticeEx;

import java.util.LinkedList;

public final class LinkedListEx {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		                    list.add(10);
		                    list.add(20);
		                    list.add(65);
		                    list.add(30);
		                    list.add(40);
		                    
		                    
		                 System.out.println(list.get(0)); 
		                 list.addFirst(0);
		                 list.addLast(50);
		                 
		                 list.sort((a,b)->b-a);
		                    
//		                  list.removeIf(x->x%2==0);
		                  
		                  System.out.println(list);         
		
		
	}

}
