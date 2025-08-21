package Test.Practice;

public class Employee implements Cloneable{
	
	private  int id;        //Always variables shoud be private
	   private  String name;       
       private  float salary;
		public Employee(int id, String name, float salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
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
		
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "id=" + id + " name=" + name + " salary=" + salary;
		}
         
		
		   @Override
			protected Object clone() throws CloneNotSupportedException {
				// TODO Auto-generated method stub
				return super.clone();
			}

		
		public static void main(String[] args) throws CloneNotSupportedException {
			Employee e1 = new Employee(101,"sam",1000);
			Employee e2 = (Employee) e1.clone();
			
			System.out.println(e2);
		}
}
