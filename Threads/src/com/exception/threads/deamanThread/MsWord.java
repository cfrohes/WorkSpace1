package com.exception.threads.deamanThread;

public class MsWord implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("type")) {
			type();
		}
		
		else if(name.equals("spell")) {
			spellCheck();
		}
		else {
			autosave();
		}
		
	}
	
	
	public void type() {
		try {
//			for(int i = 0; i < 5; i++) {
			for(; ;) {
				System.out.println("TYPING.....");
				Thread.sleep(5000);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void spellCheck() {
		try {
//			for(int i = 0; i < 5; i++) {
			for(; ;) {
				System.out.println("SPLELL CHECKING.....");
				Thread.sleep(5000);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void autosave() {
		try {
//			for(int i = 0; i < 5; i++) {
			for(; ;) {
				System.out.println("AUTO-SAVING.....");
				Thread.sleep(5000);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
