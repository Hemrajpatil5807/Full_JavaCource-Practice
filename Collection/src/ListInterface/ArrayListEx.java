package ListInterface;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add('A');
		al.add(10);
		al.add(23);
		al.add(9780097);
		al.add("Hemraj");
		al.add(null);
		al.add('A');
		al.add(10);
		al.add(23);
		al.add(9780097);
		al.add("Hemraj");
		al.add(null);
		
		
		System.out.println(al);
		
		al.remove(0);
		
		System.out.println(al);
		
		al.add(0,"a");
		
		System.out.println(al);
		
		ArrayList a = new ArrayList(5);
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		
		System.out.println(a);
		
		ArrayList b = new ArrayList(a);
		
		b.add(100);
		b.addAll(a);
		
		System.out.println(b);
	}
	
}
