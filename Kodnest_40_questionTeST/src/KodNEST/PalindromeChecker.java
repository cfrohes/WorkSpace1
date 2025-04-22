package KodNEST;
//Palindrome Checker:
//
//    Write a program to check if a given string is a palindrome.
//    Use loops and conditionals to compare characters from both ends of the string.

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = s.next();
		str =str.toLowerCase();
		boolean isPalindrome = true;
		for (int i = 0; i <= str.length()/2;i++) {
			if (str.charAt(i) != str.charAt(str.length()-1-i)) {
				isPalindrome = false;
				break;
			}
				
		}
		if(isPalindrome) {
		System.out.println("is Palindrome");
		
	}else {
		System.out.println("is Not A Palindrome");
		
	}
		s.close();
		
	}

}
