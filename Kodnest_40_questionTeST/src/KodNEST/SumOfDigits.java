package KodNEST;

import java.util.Scanner;

//Sum of Digits:
//
//    Write a program to calculate the sum of digits of a given integer.


public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		int n = number;
		int digit = 0;
		while (number > 0) {
			int rem = number % 10;
			digit += rem;
			number /= 10;
		}
		System.out.println("the Sum of the digit of the number " + n + " is : " +digit);
		sc.close();
	}

}
