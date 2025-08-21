package ListInterface;

import java.util.ArrayList;
import java.util.Vector;

public class VectorEx {
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();   //initial capacity 10 it increase by double of its current capacity if more elements added
		
		v.add(10);
		v.addElement(20);
		v.add(30);
		v.add(15);
		v.add(10);
		v.addElement(20);
		v.add(30);
		v.add(15);
		v.add(10);
		v.addElement(20);
        v.add(11);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v);
		
		System.out.println("----------------------------------------------------------");
		
		Vector v1 = new Vector(5,3);
		
		v1.add(30);
		v1.add(15);
		v1.add(10);
		v1.add(19);
		v1.add(20);
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.add(78);
		System.out.println(v1);
		System.out.println(v1.capacity());
		System.out.println(v1.size());

		
		System.out.println("----------------------------------------------------------");

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		Vector v2 = new Vector(al);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		System.out.println(v2);
	}

}
