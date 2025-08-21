package practiceQuestions;

public class Child extends Parent{
	
	  public void display() {
		  
		  System.out.println("Roll\tName\tCollege\t City");
		  System.out.println(roll+"\t"+name+"\t"+Parent.cName+"\t "+Parent.city);
	  }

	  public static void main(String[] args) {
		
		  Child c = new Child();
		    
		  c.setName("Hemraj");
		  c.setRoll(57);
		  
		  c.display();
		 
	}
	
}
