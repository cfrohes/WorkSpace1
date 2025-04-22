package com.ExceptionHandling.intro;

import java.util.Scanner;

public class ExceptionIntro {
	public static void main(String[] args) {
		System.out.println("@CONNECTION ESTABLISHED!!");
		
		Scanner sc = new Scanner(System.in);
//		int a = 10; //for this i/p Exception in thread "main" java.lang.ArithmeticException: / by zero
//		int b = 0;
		try {
			System.out.println("ENTER TWO ELEMENT FOR DIVISION");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int questient = a / b;
		System.out.println("Division ans is " + questient);
		}catch(Exception e) {
			System.out.println("ARITHMATIC EXCEPTION OCCURED ->Divide by zero ....PLEASE TRY AGAIN!!");
		}
		System.out.println("@CONNECTION TERMINATED!!");
	}
}
