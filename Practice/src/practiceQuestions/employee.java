package practiceQuestions;

import java.util.Objects;

public class employee {
      int id;
      String name;
      float salary;
      static String companyName="Veracity";
      static private int a = 10;
      
      public employee(int eID , String eName, float eSalary) {
    	  
    	  this.id = eID;
    	  this.name = eName;
    	  this.salary = eSalary;
    	  
    	  
      }
      
      

	@Override
	public String toString() {
		return this.id+" ";
	}



	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}


	

////	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		employee other = (employee) obj;
//		return id == other.id && Objects.equals(name, other.name)
//				&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
//	}
       
      
//      public static void main(String args[]) {
//    	  
//    	  Show s = new Show();
//    	  
//    	  employee e = new employee();
//    	  
//    	     e.id= 101;
//    	     e.name="Hemraj";
//    	     e.salary=50000f;
//    	  
//    	     s.display(e);
//    	     
//    	     employee e1 = new employee();
//       	  
//    	     e1.id= 102;
//    	     e1.name="Sourav";
//    	     e1.salary=51000f;
//    	  
//    	     s.display(e1);
//    	     
//    	     employee e2 = new employee();
//       	  
//    	     e2.id= 103;
//    	     e2.name="Pankaj";
//    	     e2.salary=45000f;
//    	  
//    	     s.display(e2);
//    	     
//    	     employee e3 = new employee();
//       	  
//    	     e3.id= 104;
//    	     e3.name="Gaurav";
//    	     e3.salary=54000f;
//    	  
//    	     s.display(e3);
//    	     
//    	     employee e4 = new employee();
//       	  
//    	     e4.id= 105;
//    	     e4.name="Lokesh";
//    	     e4.salary=57000f;
//    	  
//    	     s.display(e4);
//    	  
//    	  
//      }
//      
   
}
