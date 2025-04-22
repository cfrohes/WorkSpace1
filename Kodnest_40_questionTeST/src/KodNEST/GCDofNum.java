package KodNEST;

import java.util.Scanner;

//GCD Calculation:
//
//    Write a program to find the Greatest Common Divisor (GCD) of two numbers using loops and conditionals.


public class GCDofNum {

	public static void main(String[] args) {
		Scanner a = new Scanner (System.in);
		System.out.println("Enter the number1:");
		int num1 = a.nextInt();
		System.out.println("Enter the number2:");
		int num2 = a.nextInt();
		if(num1  == 0) {
			System.out.println("GCD is " + num2);
		}else if(num2  == 0) {
			System.out.println("GCD is " + num1);
		}else {
		while ( num2 > 0) {
			int rem = num1 % num2;
			num1 =num2;
			num2 = rem;
		}
		System.out.println("GCD is " + num1);
		}
		a.close();


	}

}
