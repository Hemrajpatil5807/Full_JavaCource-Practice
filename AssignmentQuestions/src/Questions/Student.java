package Questions;

//Child class
public class Student extends Person {
	 private int studentId;
	    private String department;

	    // Constructor
	    public Student(String name, int age, int studentId, String department) {
	        // Call superclass constructor using super()
	        super(name, age);
	        this.studentId = studentId;
	        this.department = department;
	    }

	    // Getter methods
	    public int getEmployeeId() {
	        return studentId;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    // Overriding the displayInfo() method
	    @Override
	    public void displayInfo() {
	        super.displayInfo(); // Call parent class method
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Department: " + department);
	    }

}
