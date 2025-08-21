package practiceQuestions;

class B{
	int x = 10;
}


public class DeepCloneDemo implements Cloneable {
	
	int y;
	B b;
	
	public DeepCloneDemo(B b, int y) {
		this.y = y;
		this.b = b;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		B bx = new B();
		bx.x = this.b.x;
		                                                  // Overriding clone method to perform Deep Cloning by writing our logic
		DeepCloneDemo dx = new DeepCloneDemo(bx, this.y);
		return dx;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		B b = new B();
		
		DeepCloneDemo d = new DeepCloneDemo(b,20);
		DeepCloneDemo d1 = (DeepCloneDemo) d.clone();
		
		d.y = 30;
		d.b.x = 20;          // Shallow Cloning
		
		System.out.println(d.y);
		System.out.println(d.b.x+"\n");
		
		
		System.out.println(d1.y);
		System.out.println(d1.b.x);
	}

}
