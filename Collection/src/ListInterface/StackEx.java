package ListInterface;

import java.util.Stack;

public class StackEx {
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.add(40);
		
		System.out.println("----------------------------------------------------------");
		
		Stack s1 = (Stack)s.clone();
		System.out.println(s1);
		System.out.println(s);
		System.out.println(s.search(10));
		System.out.println(s.pop());
		System.out.println(s.peek());   // used to see what is at the top
		System.out.println(s.capacity());
		System.out.println(s.size());
		System.out.println(s.isEmpty());
	}

}
