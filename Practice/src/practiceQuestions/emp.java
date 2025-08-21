package practiceQuestions;

public class emp {
	
	int id;
	String name;
	float salary;
	static String cname = "vspl";
	
	public void display(emp e) {
		
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);
		System.out.println(emp.cname);
	}

	public static void main(String[]args) {
		
		emp e = new emp();
		
		e.id = 101;
		e.name = "sourav";
		e.salary = 5000f;
		
		e.display(e);
		
		
	}
	

}
