package com.Threads.SynchronizedVariables;

public class Warrier implements Runnable {
	String astra1 = "Sarpastra";
	String astra2 = "Brahmastra";
	String astra3 = "Pashupatastra";
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("Arjuna")) {
			arjunaAquairedAstra();
		}
		else {
			karnaAquairedAstra();
		}
		
	}
	
	public void arjunaAquairedAstra() {
		try {
			Thread.sleep(5000);
			
			synchronized (astra1) {
				System.out.println(Thread.currentThread().getName() + " HAS AQUAIRED RESOURCE-1: " + astra1);
				Thread.sleep(5000);
				
				synchronized (astra2) {
					System.out.println(Thread.currentThread().getName() + " HAS AQUAIRED RESOURCE-2: " + astra2);
					Thread.sleep(5000);
					
					synchronized (astra3) {
						System.out.println(Thread.currentThread().getName() + " HAS AQUAIRED RESOURCE-3: " + astra3);
						Thread.sleep(5000);
						System.out.println(Thread.currentThread().getName() + " HAS RELEASE THE RESOURCE-3: " + astra3);
						Thread.sleep(5000);
						
					}
					System.out.println(Thread.currentThread().getName() + " HAS RELEASE THE RESOURCE-2: " + astra2);
					Thread.sleep(5000);
				}
				System.out.println(Thread.currentThread().getName() + " HAS RELEASE THE RESOURCE-1: " + astra1);
				Thread.sleep(5000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void karnaAquairedAstra() {
		try {
			Thread.sleep(5000);
			//ULTA 
			synchronized (astra3) {
				System.out.println(Thread.currentThread().getName() + " HAS AQUAIRED RESOURCE-3: " + astra3);
				Thread.sleep(5000);
				
				synchronized (astra2) {
					System.out.println(Thread.currentThread().getName() + " HAS AQUAIRED RESOURCE-2: " + astra2);
					Thread.sleep(5000);
					synchronized (astra1) {
						System.out.println(Thread.currentThread().getName() + " HAS AQUAIRED RESOURCE-1: " + astra1);
						Thread.sleep(5000);
						System.out.println(Thread.currentThread().getName() + " HAS RELEASE THE RESOURCE-3: " + astra3);
						Thread.sleep(5000);
						
					}
					System.out.println(Thread.currentThread().getName() + " HAS RELEASE THE RESOURCE-2: " + astra2);
					Thread.sleep(5000);
				}
				System.out.println(Thread.currentThread().getName() + " HAS RELEASE THE RESOURCE-1: " + astra1);
				Thread.sleep(5000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
