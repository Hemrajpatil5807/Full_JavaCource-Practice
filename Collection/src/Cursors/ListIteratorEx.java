package Cursors;
import java.util.ListIterator;
import java.util.ArrayList;

public class ListIteratorEx {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al);
		
		ListIterator i = al.listIterator();
		
		while(i.hasNext()) {
			int a = (int) i.next();
			if(a == 20) {
				i.add(25);
			}
			if(a == 30) {
				i.remove();
			}
			
		}
		
		System.out.println(al);

	}

}
