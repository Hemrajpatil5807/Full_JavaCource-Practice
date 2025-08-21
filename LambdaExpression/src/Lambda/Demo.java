package Lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {
	
//	public boolean checkAge(int a) {
//		if(a>18)
//			return true;
//		
//		return false;
//	}
//	
	
	
	
	public static void main(String[] args) {
		
//		Runnable r = ()->{
//			for(int i =0; i<10; i++)
//				System.out.println(i);
//		};
//		
//		Thread t = new Thread (r);
//		   t.start();
		
//		Demo d = new Demo();
//		  
//		  System.out.println(d.checkAge(19));
		
		
//		Types Of Functional Interface 
		
		Predicate <Integer> p = (t)->{if(t>18) return true; return false;}; //Predicate is Functional interface it takes single arguments and return boolean value
		
		System.out.println(p.test(8)); //test() method of Predicate Interface
		
		Predicate <String> p1 = s->{if(s.length()==5) return true; return false;};
		
		System.out.println(p1.test("Hemraj"));
		
		Function <String , Integer> f = (s)->s.length(); //Function interface take single arguments and return value.,Here String is input Type and Integer is return value type 
		
		System.out.println(f.apply("Hemraj")); //apply() method of Function Interface
		
		Function <String, String> f1 = t-> t;  //here input and return type is same
		
		System.out.println(f1.apply("Patil"));
		
		Consumer <Integer> c = i->System.out.println(i); //Consumer Interface can take single argument but does not return anything only process that value
		
		    c.accept(10); //accept() method of Consumer Interface
		    
		Consumer <String> c1 = s->System.out.println(s);     
		    c1.accept("Consumer");
		    
		Supplier <Double> s = ()->Math.random();  //Supplier Interface does not take any argument but return single output
		
		  System.out.println(s.get()); //get() Method of Supplier Interface

		Supplier <String> str = ()-> "string Supplier";
		
		System.out.println("\n-------BiPredicate   BiFunction   BiConsumer-----------\n");
		
		// BiPredicate     BiFunction    BiConsumer   
				BiPredicate <Integer, Integer> bp = (fn,sn)->{if(fn > sn) return true; return false;};
				
				System.out.println(bp.test(10, 20));
				
				 // BiFunction to add 2 numbers
		        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b; // here first & Second Integer for arguments and third Integer for return value

		        System.out.println("Sum = " + add.apply(2, 3)); // Implement add using apply()
		        
		        BiConsumer <Integer, Integer> bc = (a,b)->System.out.println(a+"+"+b+"="+(a+b) ); //BiConsumer take two Arguments and process on that value
		         
		        bc.accept(10, 20);
		
		
		
	}

}
