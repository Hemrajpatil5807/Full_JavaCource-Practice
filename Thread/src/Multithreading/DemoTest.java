package Multithreading;

public class DemoTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		Demo d = new Demo();
		
		ThreadDemo t1 = new ThreadDemo(d,"Panku");
		ThreadDemo t2 = new ThreadDemo(d,"Souru");
		
			
		t1.start();
		//t1.join();
		//t1.sleep(2000);
		t2.start();
		
		}

	
}