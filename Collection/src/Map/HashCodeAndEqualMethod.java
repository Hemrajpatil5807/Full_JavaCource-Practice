package Map;

import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEqualMethod {
	
	public static void main(String[] args) {
	  HashMap<Person,String> map = new HashMap<>();
	  Person p1 = new Person("Alice", 1);
	  Person p2 = new Person("John", 2);
	  Person p3 = new Person("Alice", 1);
	                                                                                
	  map.put(p1, "Engineer");       //hashcode 1 ---> index 1                      If we create custom class then we have to override equals & hashcode 
	  map.put(p2, "Architecture");  //hashcode 2 ---> index 2                          method in it to use in map 
	  map.put(p3, "Manager");      //hashcode 1 ---> index 1 --> equals()--> replace 
	  
	  Map<String,Integer> map1 = new HashMap<>();
	  map1.put("Shubham", 98);   //hashcode  ---> index
	  map1.put("Alok", 75);      //hashcode  ---> index
	  map1.put("Shubham", 89);   //hashcode  ---> index

	  
	  System.out.println("HashMap Size: "+map.size());
	  System.out.println("Value of: "+map.get(p1));
	  System.out.println("Value of: "+map.get(p3));

	  
	  
	}

}
