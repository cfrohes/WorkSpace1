package KodNEST;

import java.util.Scanner;

//Factorial Calculation:
//    Write a program to calculate the factorial of a given number using a loop.



public class FactorialCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		int fact = 1;
		
		for (int i = number; i >= 1; i--) {
			fact *= i;
		}
		System.out.println("Factorial of number " + number + " is: " + fact);
		sc.close();
	}

}
