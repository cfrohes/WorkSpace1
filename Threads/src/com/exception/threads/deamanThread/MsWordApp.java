package com.exception.threads.deamanThread;

public class MsWordApp {
	public static void main(String[] args) {
		
		MsWord msWord = new MsWord();
		
		Thread t1 = new Thread(msWord);
		Thread t2 = new Thread(msWord);
		Thread t3 = new Thread(msWord);
		
		t1.setName("type");
		t2.setName("spell");
		t3.setName("auto");
		
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t2.setPriority(7);
		t3.setPriority(8);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
