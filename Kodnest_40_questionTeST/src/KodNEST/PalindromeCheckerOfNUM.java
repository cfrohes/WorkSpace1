package KodNEST;

import java.util.Scanner;

//Palindrome Number Checker:
//
//    Write a program to check if a given number is a palindrome.


public class PalindromeCheckerOfNUM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		if(isPalindrom(number)) {
			System.out.println(number +" is a palindrome.");
		}else {
			System.out.println(number +" is not a palindrome.");
		}
		
		sc.close();
		
	}
	public static boolean isPalindrom(int n) {
		int originalNum = n;
		int reversedNum = 0;
		while (n > 0) {
			int rem = n % 10;
			reversedNum =reversedNum * 10 +rem;
			n /= 10;
		}
		return originalNum == reversedNum;
	}

}
