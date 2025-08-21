package Cursors;
import java.util.Enumeration;
import java.util.Vector;


public class EnumerationEx {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(10);     
		v.add(20);
		v.addElement(30);
		v.add(15);
		
		Enumeration e = v.elements();   // it is an Interface to read data from lagacy Classes like Vector
		                                // it only read data. Vectors elements method can read all elements in vector
		while(e.hasMoreElements()) {
			int a = (int) e.nextElement();
			System.out.println(a);
		}
	}

}
