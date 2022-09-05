package com.tagamage.threads;

public class Application {
	
	public static void main (String [] args) throws InterruptedException {
		
		Printer p= new Printer();
		//p.setDaemon(true);
		
		//Thread t1=new Thread();	
		//Thread t2=new Thread("Thread-name");
		//Thread t3=new Thread(p,"Thread-name");
	
		//System.out.println("Main Before: "+Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(11);
		//Thread.currentThread().setPriority(1);
		//thread.setPriority(1);
		Thread printThread =new Thread(p);
		
		//thread.setPriority(10);
		
		//System.out.println("Main "+Thread.currentThread().getPriority());
		//System.out.println("Child "+thread.getPriority());
			
		printThread.start();
		printThread.interrupt();
		
		//thread.join(5000);
		
		//p.run();
		
		//System.out.println ("This is from main thread");
		for (int h=0;h<50;h++) {
			
			System.out.println("main "+ Thread.currentThread().getName() + " " +h);
			
		}
		System.out.println("=========================================================");
		//thread.interrupt();
	}

}
