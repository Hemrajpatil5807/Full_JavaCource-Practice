package practiceQuestions;

public class ShallowCloneTest implements Cloneable{
	
	int a = 10;
	
	public ShallowCloneTest(int a) {
	     this.a = a;	
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ShallowCloneTest t = new ShallowCloneTest(10);
		ShallowCloneTest t1 = (ShallowCloneTest) t.clone();    //Shallow Cloning of Primitive type values
		
		System.out.println(t.a);
		System.out.println(t1.a);
		
	}
	
}