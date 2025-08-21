package Multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Demo {
	
//	public synchronized void wish(String name) {  //only one Thread can access the resource at any given time 
//		for(int i =0; i<10; i++) {
//			System.out.println("Hello "+name);
//		}
//	}
	
//	public  void wish(String name) {  //only one Thread can access the resource at any given time 
//		
//		synchronized(this) {
//		for(int i =0; i<10; i++) {
//			System.out.println("Hello "+name);
//		 }
//	  
//		}
//	}
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException{
		
		
		//For Runnable Interface
		
		ExecutorService service = Executors.newFixedThreadPool(3);//it reused the number of threads to perform  
//          for(DemoRunnable drThread : m ) {
//			   service.submit(drThread);
//		   }
//		   service.shutdown();
//		ExecutorService service = Executors.newCachedThreadPool();
//		    service.submit(new DemoRunnable());
//		    service.submit(new DemoRunnable());
//		    service.submit(new DemoRunnable());
//		    service.submit(new DemoRunnable());
//		    service.submit(new DemoRunnable());

		//For Callable Interface
		
//		ExecutorService service = Executors.newCachedThreadPool(); //if we dont know the number of task
//		Future <Integer> f = service.submit(new DemoCollable());
//		Future <Integer> f1 = service.submit(new DemoCollable());
////		System.out.println(f.get(5,TimeUnit.MICROSECONDS));
//		
//		try {
//			System.out.println(f.get(5,TimeUnit.SECONDS));
//		} catch (Exception e) {
//		System.out.println("Taking long Time please try again");
//		f.cancel(true); // here we stop the Thread Execution		
//	}
  }
}
