package examples;

import java.util.ArrayList;

public class RunnableTest implements Runnable{
	int seq;
	
	public RunnableTest(int seq) {
		this.seq = seq;
	}
	
	public void run() {
		System.out.println(this.seq+"thread start.");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		System.out.println(this.seq+ "thread end.");
	}

	public static void main(String[] args) {
		ArrayList<Thread> threads = new ArrayList<Thread>();
		for(int i=0; i<10; i++) {
			Runnable r = new RunnableTest(i);
			Thread t = new Thread(r);
			t.start();
			threads.add(t);
		}
		
		for (int i=0; i<threads.size(); i++) {
			Thread t = threads.get(i);
			try {
				t.join();
			}catch(Exception e) {
				
			}
		}
		System.out.println("main end.");
	}

}
