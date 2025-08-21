package Multithreading;

import java.util.concurrent.Callable;

public class DemoCollable implements Callable <Integer>{
   
	@Override
	public Integer call() throws Exception {
		int a = 0;
		for(int i = 0; i < 10; i++) {
//			a = a+i;
			System.out.println("File Upload");
			Thread.sleep(1000);
		}
		return a;
		
	}

}
