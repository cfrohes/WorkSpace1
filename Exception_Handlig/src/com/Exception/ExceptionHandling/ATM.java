package com.Exception.ExceptionHandling;
//Exception Handle, Rethow, Duck
import java.util.Scanner;

public class ATM {
	void authentication() throws Exception {
		try {
			System.out.println("----Connection To Database Established..");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Two Numbers each with max 2 digits that is USERID & PASSWORD  \n for Division Aunthantication");
			int userId = sc.nextInt();
			int pwd = sc.nextInt();
			int res = userId / pwd;
			System.out.println("Authentication Division result is: " + res);
		}// catch (Exception e) {
//			System.out.println("Exception Generated in ATM and Resolved in ATM");
//			throw e;
//		}
		finally {
		System.out.println("----connection to Database Get terminated..");
		}
	}
}
