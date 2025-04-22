package com.Exception.Stacktrace;

public class DemoApp {
	public static void main(String[] args) {
		try {
		System.out.println("This is DemoApps Main");
		Demo2 d2 = new Demo2();
		d2.display();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
