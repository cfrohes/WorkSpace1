package com.Exception.ExceptionHandling;

public class BankApp {
	
	public static void main(String[] args) {
		System.out.println("----Main Connection Established..----");
		Bank bank = new Bank();
		bank.initiateAtm();
		System.out.println("----Main Connection Get terminated..----");
		
	}

}
