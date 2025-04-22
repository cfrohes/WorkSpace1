package com.Threads.ExtendingThreds;

public class Demo {
	public static void main(String[] args) {
		Activity1 t1 = new Activity1();
		Activity2 t2 = new Activity2();
		Activity3 t3 = new Activity3();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
