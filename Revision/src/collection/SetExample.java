package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetExample {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
				  al.add(10);
				  al.add(20);
				  al.add(30);
				  al.add(25);
				  al.add(15);
				  al.add(10);
				  
		System.out.println(al);
		
		HashSet h = new HashSet(al);
		
		System.out.println(h);
		
		LinkedHashSet lh = new LinkedHashSet(al);
		
		System.out.println(lh);
		
		
	}

}
