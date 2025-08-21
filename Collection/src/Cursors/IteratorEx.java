package Cursors;
import java.util.Iterator;
import java.util.ArrayList;

public class IteratorEx {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		
		Iterator i = al.iterator();
		
		while(i.hasNext()) {
			int a = (int) i.next();
			if(a==20) {
				i.remove();
			}
		}
		
		System.out.println(al);

	}

}
