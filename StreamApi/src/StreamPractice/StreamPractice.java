package StreamPractice;

import java.util.Arrays;
import java.util.List;

public class StreamPractice {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		  System.out.println(list);
		  
	  
		  list.stream().filter(n->{if(n%2==0)return true; return false;}).forEach(n->System.out.println(n)); 
		 
	}

}
