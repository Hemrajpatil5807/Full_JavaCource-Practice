package SetInterface;
import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetEx {
	
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new MyComparator());
		     
		       t.add(10);
		       t.add(20);
		       t.add(30);
		       t.add(40);
		       t.add(10);  // duplicate not allowed
		       t.add(30);  //duplicate not inserted
		       t.add(50);
		       t.add(70);
		       t.add(80);
		       t.add(90);
		       
		       System.out.println(t);
		
	}

}
