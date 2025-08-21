package practiceQuestions;

public class Stud {

	public static void main(String[] args) throws CloneNotSupportedException {
		
    Address adr = new Address("Raver","Raver","Jalagon","Maharashtra",425001);
    
    Student s = new Student(1,"Sam",70.5f,"BCA","O+","08/10/2004",adr);
    
    Student s1 = (Student)s.clone();    //Clonning An Object
    
    s.getAdr().setCity("Kolode");
    
     System.out.println(s);
     System.out.println(s1);
          
		  
	}
	
}
