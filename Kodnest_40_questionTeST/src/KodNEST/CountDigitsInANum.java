package KodNEST;

import java.util.Scanner;

//Count Digits in a Number:
//
//    Write a program to count the number of digits in a given integer.


public class CountDigitsInANum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		int digit = 0;
		while (number != 0) {
			int rem = number % 10;
			digit ++;
			number /= 10;
			
		}
		System.out.println(digit);
		sc.close();
	}

}
