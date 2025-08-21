package practiceQuestions;

public class ReturnEx {
	

	public static void main(String[] args) {
		
		//Addition
		Addition a = new Addition();
		
		System.out.println("----Addition----");
		
		int x = a.add(10,20);
		System.out.println("Sum = "+x);
		
		float f = a.add(10.5f,20.5f,30);
		System.out.println("Sum = "+f);
		
		double k = a.add(400d,5009d,87958d,75800d);
		System.out.println("Sum = "+k);
		
		long l = a.add(695287l,705980l,7480l,70803l,80803l);
		System.out.println("Sum = "+l);
		
		int y = a.add(856, 45, 77, 34, 50, 20);
		System.out.println("Sum = "+y);
		
		//Subtraction
		Subtract s = new Subtract();
		
		System.out.println("\n----Subtraction----");
		
		int q = s.sub(10,20);
		System.out.println("Sub = "+q);
		
		float r = s.sub(10.5f,20.5f,30);
		System.out.println("Sub = "+r);
		
		double t = s.sub(400d,5009d,87958d,75800d);
		System.out.println("Sub = "+t);
		
		long o = s.sub(695287l,705980l,7480l,70803l,80803l);
		System.out.println("Sub = "+o);
		
		int n = s.sub(856, 45, 77, 34, 50, 20);
		System.out.println("Sub = "+n);
		
		//Multiplication
		Multiply m = new Multiply();
		
		System.out.println("\n----Multiplication----");
		
		int e = m.mul(10,20);
		System.out.println("Mul = "+e);
		
		float c = m.mul(10.5f,20.5f,30);
		System.out.println("Mul = "+c);
		
		double p = m.mul(400d,5009d,87958d,75800d);
		System.out.println("Mul = "+p);
		
		long z = m.mul(695287l,705980l,7480l,70803l,80803l);
		System.out.println("Mul = "+z);
		
		int v = m.mul(856, 45, 77, 34, 50, 20);
		System.out.println("Mul = "+v);
		
		//Division
		Division d = new Division();
		
		System.out.println("\n----Division----");
		
		int i = d.div(10,20);
		System.out.println("Div = "+i);
		
		float j = d.div(10.5f,20.5f,30);
		System.out.println("Div = "+j);
		
		double h = d.div(400d,5009d,87958d,75800d);
		System.out.println("Div = "+h);
		
		long b = d.div(695287l,705980l,7480l,70803l,80803l);
		System.out.println("Div = "+b);
		
		int u = d.div(856, 45, 77, 34, 50, 20);
		System.out.println("Div = "+u);
	}
	
}
