package Multithreading;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		MyThread t = new MyThread();
		t.start();
		synchronized (t){
		System.out.println("main thread called wait method");
		t.wait();
		System.out.println("main thread got notification");
		System.out.println("total "+t.total);
		}
		
//		MyThread t1 = new MyThread();
//		
//		
//		  t1.setName("t1");
//		  t1.start();
//		  t1.join();
//		  System.out.println("main thread name: "+Thread.currentThread().getName());
//		  
////	   DemoRunnable d = new DemoRunnable();
////	    Thread t = new Thread(d);
////	     
////	    t.start();
////		  System.out.println("main thread name: "+Thread.currentThread().getName());
// 
//	      
//		  for(int i =0; i<10; i++) {
//			  System.out.println("Main");
//		  }
	}

}
     