package Map;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		
		                  map.put(1, "om");
		                  map.put(15, "hem");
		                  map.put(2, "neha");
		                  map.put(3, "renu");
		                  
		                  
		           String s = map.get(2);
		           System.out.println(s);
		           
		       System.out.println(map.containsKey(2));    //return true  
		      System.out.println(map.containsValue("renu"));     //return true
		      
		      //if we want to iterate loop on map we used keySet() it returns Set
		      
//		     Set<Integer> keys= map.keySet();
//		     for(int i: keys) {
		      for(int i : map.keySet()) {   // we can also write like it
		    	 System.out.println(map.get(i));
		     }
		      
		      
		      // Another way to print key value in map using entrySet() 
		      
		      Set <Map.Entry<Integer,String>> entries = map.entrySet();
		      
		      for( Map.Entry<Integer,String> entry : entries) {
		    	  
		    	  System.out.println(entry.getKey()+" : "+entry.getValue());
		      }
		     
		      
		     
		     
	}

}
