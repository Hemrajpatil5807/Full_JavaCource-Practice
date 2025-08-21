package SetInterface;
import java.util.Comparator;

public class Student implements Comparator <Student> {
	
	int roll;
	String name;
	float marks;
	
	public Student(int roll, String name, float marks){
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
    public Student(){
		//default constuctor
	}

   public int compare(Student s1, Student s2) {
	   
	   if(s1.marks>s2.marks) {
		   return -1;
	   }else if(s1.marks<s2.marks){
		   return 1;
	   }else {
		   return 0;
	   }
	   
   }
    
}
