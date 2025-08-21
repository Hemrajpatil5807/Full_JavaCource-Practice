package practiceQuestions;

public class Demo {

	
  public static void main (String[] args) {

	       Demo d = new Demo();
	       
	       Class c = d.getClass();
	       
	       System.out.println(c.getSuperclass());
	       System.out.println(c.getSimpleName());
	       System.out.println(c.getTypeName());
	       System.out.println(c.getName());
	       System.out.println(c.getCanonicalName());
	       System.out.println(c.getModifiers());
	       
    }
}
