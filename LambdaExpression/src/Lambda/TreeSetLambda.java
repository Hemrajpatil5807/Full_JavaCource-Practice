package Lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetLambda {
	
	public static void main(String[] args) {
		
		Comparator <Integer> c = (I1,I2)->{return(I1.compareTo(I2));};
		
		TreeSet <Integer> t = new TreeSet <Integer> (c);
		               t.add(10);
		               t.add(20);
		               t.add(4);
		               t.add(2);
		               t.add(8);
		
		System.out.println(t);
	}

}
