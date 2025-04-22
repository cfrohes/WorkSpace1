package com.exception.threads.Synchronized;

public class Bathroom implements Runnable {

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		try {
			String name  = Thread.currentThread().getName();
			System.out.println(name + " IS ENTERING THE BATH-ROOM");
			Thread.sleep(5000);
			System.out.println(name + " IS USING THE BATH-ROOM");
			Thread.sleep(5000);
			System.out.println(name + " IS EXITING THE BATH-ROOM");
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
