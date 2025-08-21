package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSort {
	
	public static void main(String[] args) {
		
		Comparator <Integer> c = (I1,I2)->{return(I1.compareTo(I2));};
		
		ArrayList <Integer> a = new ArrayList <Integer> ();
		              a.add(23);
		              a.add(8);
		              a.add(23);
		              a.add(12);
		              a.add(80);
		              a.add(87);
		              
		       Collections.sort(a,c);
		       
		       System.out.println(a);
		
	}

}
