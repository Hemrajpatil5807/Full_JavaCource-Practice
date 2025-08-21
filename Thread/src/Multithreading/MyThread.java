package Multithreading;

public class MyThread extends Thread {
	  
	int total = 0;
	
	@Override
	public void run() {
		
		synchronized (this) {
			System.out.println("new thread started calculation");
			for (int i = 0; i < 100; i++) {
			total = total + i;
			}
			System.out.println("new thread done with calculation");
			this.notify();
		
//		for(int i = 0; i<10; i++) {
//			
//			System.out.println("Hello");
//		}
//		
//	//	notify();
//		
//		System.out.println("Finish");
//		System.out.println("currentThread name "+Thread.currentThread().getName());

      	}
	
	}
}
