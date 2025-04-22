package com.Threads.ExtendingThreds;

public class Activity2 extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("PRINTING ACTIVITY STARTED..");
			for(int i = 0; i < 5; i++) {
				System.out.println("CHANDAN.");
				Thread.sleep(5000);	
			}
			System.out.println("PRINTING ACTIVITY ENDED..");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
