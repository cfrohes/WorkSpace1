package com.Exception.ExceptionHandling;

public class Bank {
	void initiateAtm() {
		System.out.println("----Connection To Bank established..");
		ATM atm = new ATM();
		try {
		atm.authentication();
		}catch (Exception e) {
			System.out.println("Issue Reached bank and ReSolved in Bank.");
		}
		System.out.println("----Connection To Bank Get Terminated..");
	}
}
