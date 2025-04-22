package com.Threads.SynchronizedVariables;

public class KuruKshetraApp {
	public static void main(String[] args) {
		
		Warrier w = new Warrier();
		
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		
		t1.setName("Arjuna");
		t2.setName("Karna");
		
		t1.start();
		t2.start();
	}
}
