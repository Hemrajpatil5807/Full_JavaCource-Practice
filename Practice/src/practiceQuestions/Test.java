package practiceQuestions;

public class Test {

	private int a;

	public Test(int a) {
		
		this.a = a;
	}

	@Override
	public boolean equals(Object obj) {

		Test other = (Test) obj;
		if(this.a==other.a)
			return true;
		else
			return false;
	}

//	public boolean equals(int a) {
//		
//		return true;
//		
//	}
	
	@Override
	public String toString() {
		return this.a+"pankaj";
	}

	public static void main(String[] args) {
		
//		Test t = new Test(10);
//		Test t1 = new Test(10);
		
		employee e =new employee(101,"sam",1000);
		employee e1 =new employee(101,"sam",1000);
		
		Integer i = new Integer(101);
		  i.hashCode();
		
		  String s = new String("Pankaj");
		  s.hashCode();
//		System.out.println(t.toString());
//		System.out.println(t.equals(t1));
//		System.out.println(t1.equals(t));
		
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
//		System.out.println(e.toString());

	}
	
	 
}
