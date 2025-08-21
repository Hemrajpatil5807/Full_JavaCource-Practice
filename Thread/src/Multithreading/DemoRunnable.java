package Multithreading;

public class DemoRunnable implements Runnable{
        
	String name;
	
	public DemoRunnable(String name) {
		this.name = name;
	}
	public DemoRunnable() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		System.out.println("Hello "+name);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Bye "+name);
		
//		for(int i = 0 ; i<1;i++) {
//			System.out.println("Thread using Runnable Interface");
//		}
		
		
		
	}

}
