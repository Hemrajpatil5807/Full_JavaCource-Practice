package SetInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Sam",70.0f);
		Student s2 = new Student(2,"Ram",80.70f);
		Student s3 = new Student(3,"Shyam",75.0f);
		
		List<Student> sl = new ArrayList<Student>();
               sl.add(s1);
               sl.add(s2);
               sl.add(s3);
               
        Collections.sort(sl,new Student()); 
        
        for(Student s : sl) {
        	System.out.println(s.name);
        }
		
	}

}
