package practiceQuestions;

public class Student implements Cloneable {

	private int roll;
	private String name;
	private float marks;
	private String dep;
	private String bg;
	private String dob;
    static String clg = "SSBT";
   
    private Address adr;

	public Student(int roll, String name, float marks, String dep, String bg, String dob, Address adr) {
	
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.dep = dep;
		this.bg = bg;
		this.dob = dob;
		this.adr = adr;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getBg() {
		return bg;
	}

	public void setBg(String bg) {
		this.bg = bg;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public static String getClg() {
		return clg;
	}

	public static void setClg(String clg) {
		Student.clg = clg;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "roll=" + roll + "  name=" + name + "  marks=" + marks + "  dep=" + dep + "  bg=" + bg
				+ "  dob=" + dob + "  adr=" + adr;
	}
    
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Student s = (Student) super.clone();
		    
		s.setAdr((Address)adr.clone());
		
		return s;
	}
	
	
}
