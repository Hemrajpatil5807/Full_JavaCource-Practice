package jdbcConnect;

import java.util.List;

public class Demo {
	
	public static void show(List<Employee> al) {
		
		for(Employee e: al) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}
		
	}

}
