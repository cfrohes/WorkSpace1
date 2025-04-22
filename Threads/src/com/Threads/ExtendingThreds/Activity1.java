package com.Threads.ExtendingThreds;

import java.util.Scanner;

public class Activity1 extends Thread{
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("LOGIN TO WEBSITE ACTIVITY STARTED.");
		System.out.println("Enter un & pwd");
		String un = sc.next();
		String pwd = sc.next();
		System.out.println("WELLCOME .......YOU ARE LOGGED IN...");
		System.out.println("LOGIN TO WEBSITE ACTIVITY ENDED.");
	}

}
