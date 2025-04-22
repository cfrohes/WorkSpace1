package KodNEST;

import java.util.Scanner;

//Armstrong Number:
//
//    Write a program to check if a given number is an Armstrong number (also known as a narcissistic number).


public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter a number: ");
		int number = sc. nextInt();
		int n = number;
		int lengthOfNum = String.valueOf(number).length();
		int tempNum = 0;
		while (number != 0) {
			int rem = number % 10;
			tempNum += (int)Math.pow(rem, lengthOfNum);
			number /= 10;
		}
		
		if (n == tempNum) {
			System.out.println(n+" Armstrong Number.");
		}
		else {
			System.out.println(n +" Not a Armstrong Number.");
		}
		sc.close();

	}

}
