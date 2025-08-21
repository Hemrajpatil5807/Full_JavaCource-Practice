package PracticeEx;

public class Employee implements Cloneable{
    private int id;
    private String name;
    private Address adr;

 public Employee(int id, String name, Address adr) {
     this.id = id;
     this.name = name;
     this.adr = adr;
 }

 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public Address getAdr() {
     return adr;
 }

 public void setAdr(Address adr) {
     this.adr = adr;
 }

 @Override
 public String toString() {
     return "Employee{" +
             "id=" + id +
             ", name='" + name + '\'' +
             ", adr=" + adr +
             '}';
 }
 
 
 
 

 @Override
protected Object clone() throws CloneNotSupportedException{
	 //here we create a inner object and set it value from invoking outer object
	Address adr = new Address();
	        adr.setPincode(this.getAdr().getPincode());
	        adr.setCity(this.getAdr().getCity());
       //here we pass the outer object to clone ,setting inner object
	Employee e = new Employee(this.id,this.name,adr);
	return e;
}

public static void main(String[] args) throws CloneNotSupportedException{

	 Address adr = new Address(425507,"jalgaon");
	 
     Employee e = new Employee(101,"sam",adr);

     Employee e1 = (Employee) e.clone();

     System.out.println(e);
     System.out.println(e1);
 }

	
	
}















