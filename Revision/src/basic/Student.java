package basic;

public class Student {
  //Variables with Access Specifiers.
	private int roll;
	private String name;
	private float marks;
	
	//Parameterized constructor
	public Student (int roll, String name, float marks) {
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	
	public void Display() {
		System.out.println("Roll No : "+roll);
		System.out.println("Name : "+name);
		System.out.println("Marks : "+marks);
	}
	
	
	public static void main(String[] args) {
		Student s = new Student(10,"Raj",87.80f);
		
		s.Display();
		
	}
	
	
}
