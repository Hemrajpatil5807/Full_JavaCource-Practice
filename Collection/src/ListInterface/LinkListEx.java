package ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListEx {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.remove(1);
		System.out.println(ll);
		
		System.out.println("----------------------------------------------------------");
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(30);
		al.add(20);
		LinkedList l2 = new LinkedList(al);
		System.out.println(l2);
	}
}
