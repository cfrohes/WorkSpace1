package com.exception.threads.Synchronized;

public class BathroomApp {
	public static void main(String[] args) {
		try {
			Bathroom bathroom = new Bathroom();
			
			Thread t1 = new Thread(bathroom);
			Thread t2 = new Thread(bathroom);
			Thread t3 = new Thread(bathroom);
			
			t1.setName("PRASAD");
			t2.setName("LAXMAN");
			t3.setName("DONO");
			
			t1.start();
			t2.start();
			t3.start();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
