package com.tagamage.threads;


public class Printer implements Runnable{
	
	
	@Override	
	public void run() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("I'm up.........");
		}
		
		for (int i=0;i<50;i++) {
			
		
			System.out.println("child "+ " "+i);
	
		}

	}
	
	/*@Override	
	public void run() {
		
		for (int i=0;i<50;i++) {
			
			//Thread.yield();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("child "+ " "+i);
	
		}

	}*/
	
	
}

/*public class Printer extends Thread{
	
	@Override
	public void start() {
		
		super.start();
		System.out.println("This is start");
	}
	
	
	/*@Override
	public void run() {
		
		for (int i=0;i<100;i++) {
			
			System.out.println("child "+ currentThread().getName()+ " "+i);
			
		}
	}
	*/
	/*//overloading run()
	public void run(int x) {
		
		for (int i=0;i<10;i++) {
			
			System.out.println("child "+ currentThread().getName()+ " "+i);
			
		}
	}
	*/
	
	/*@Override
	public void run() {
		
		System.out.println("This is from child thread");
		
	}

}*/



/*public class Printer implements Runnable{
	
	@Override	
	public void run() {
		
		for (int i=0;i<50;i++) {
			
			System.out.println("child "+ " "+i);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	}

}
*/

