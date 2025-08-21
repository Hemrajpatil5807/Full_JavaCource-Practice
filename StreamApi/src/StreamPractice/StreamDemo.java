package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	
	 public static void main(String[] args) {
		 // feature introduce in Java 8
	     // process collections of data in  a fuctional and declarative manner
	     // Simplify Data Processing
	     // Embrace Functional Programming
		 // Improve Readability and Maintainability
		 // Enable easy parallelism
		 
		 // What is Stream ?
		 // a sequence of elements supporting functional and declarative programming
		 
		 // How to Use Streams ? 
		 // Source, intermediate operations and terminal operation
		 
		 List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
		 
		// Stream <Integer> stream = numbers.stream();
		// Long l =numbers.stream().filter(x -> x % 2 == 0).count();
		 System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());
 	}

}
