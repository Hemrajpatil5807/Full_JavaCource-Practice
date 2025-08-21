package Test.Practice;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList <Employee> al = new ArrayList <Employee>();
        al.add(new Employee(101,"sam",1090));
        al.add(new Employee(102,"kiran",2090));
        al.add(new Employee(103,"shyam",3090));
        al.add(new Employee(104,"ram",4090));
           
        Test.display(al);
	}

	private static void display(ArrayList<Employee> al) {
		
		 for(Employee e: al) {
			   System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		   }
		
	}

}
