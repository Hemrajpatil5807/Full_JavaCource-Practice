package Multithreading;

public class ThreadDemo extends Thread{
	
	Demo d ;
	String name;
	
	public ThreadDemo(Demo d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		//d.wish(name);
	}

	
}
