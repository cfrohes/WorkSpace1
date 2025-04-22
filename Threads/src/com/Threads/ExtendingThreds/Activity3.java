package com.Threads.ExtendingThreds;

public class Activity3 extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("MULTIPLICATION ACTIVITY STARTED");
			int a = 10;
			int b = 9;
			Thread.sleep(5000);
			int m = a*b;
			System.out.println(m);
			System.out.println("MULTIPLICATION ACTIVITY ENDED");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
