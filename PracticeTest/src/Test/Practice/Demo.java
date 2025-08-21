package Test.Practice;

public class Demo {
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"sam",1000);
		Employee e2 = new Employee(102,"ram",15000);
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));

	}

}
