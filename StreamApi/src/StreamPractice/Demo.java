package StreamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
	 public static void main(String[] args) {
		
		 List <Employee> list = Arrays.asList( new Employee(101,"sam",12000f),
				                               new Employee(102,"ram",20000f),
				                               new Employee(103,"sham",50000),
				                               new Employee(104,"pankaj",70000),
				                               new Employee(105,"sourav",863790)
				                              );
		 
		 List <Integer> id = new ArrayList<Integer>();
		    
		 id = list.stream().map(e->e.getId()).collect(Collectors.toList());
		 
		 System.out.println(id);
		 
		 List <String> name = new ArrayList<String>();
		 
		 name = list.stream().map(e->e.getName()).collect(Collectors.toList());
		 
		 System.out.println(name);
		 
		 List <Float> salary = new ArrayList<Float>();
		 
		 salary = list.stream().map(e->e.getSalary()).collect(Collectors.toList());
		 
		 System.out.println(salary);
				 
	 }

}
