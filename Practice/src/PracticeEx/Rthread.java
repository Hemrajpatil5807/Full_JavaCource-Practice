package PracticeEx;

public class Rthread {
	
	public static void main(String[] args) throws InterruptedException {
		Runnable r1 =()->{
			for(int i = 1; i<10; i++)
			System.out.println("Thread 1");
		};
		Runnable r2 =()->{
			for(int i = 1; i<10; i++)
			System.out.println("Thread 2");
		};
		
		Thread t1 = new Thread(r1);
		       t1.start();
		       t1.join();
		Thread t2  = new Thread(r2);
		       t2.start();
	}

}
