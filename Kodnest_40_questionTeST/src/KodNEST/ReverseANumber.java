package KodNEST;
//Reverse a Number:
//
//    Write a program to reverse a given integer.
//    Use a loop to extract digits and form the reversed number.

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int originalnum = n;
		int digit = 0;
		int reverseNum = 0;
//		while (n > 0) {
//			n=n / 10;
//			digit++;
//		}
//		for (int i = 1; i <= digit;i++) {
		while (n > 0) {
			int rem = n % 10;
			reverseNum = reverseNum * 10 + rem;
			n /= 10;
		}
		System.out.println("Reverse Number is " + reverseNum);
		sc.close();
	}

}
