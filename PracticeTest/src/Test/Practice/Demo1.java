package Test.Practice;

public class Demo1 {
    public static void main(String[] args) {
	
    	Test1 t = new Test1();
    	      t.call();
    	      t.viCall();
    	      
    	      System.out.println("\nInterface Reference\n");
    	SimCard s = new Test1();  
    	        s.call();
    	        s.viCall();
  }
}
