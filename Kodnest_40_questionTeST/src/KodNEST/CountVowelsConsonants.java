package KodNEST;
//Count Vowels and Consonants:
//
//    Write a program to count the number of vowels and consonants in a given string.
//    Use loops and conditionals to check each character.

import java.util.Scanner;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.next();
		str = str.toLowerCase();
		int vowels = 0;
		int consonants = 0;
		
		for (int i = 0; i <= str.length()-1; i++) {
			char ch = str.charAt(i);
			if ("aeiou".indexOf(ch) !=-1) {
				vowels++;
				
			}else if (ch>= 'a' && ch <= 'z') {
				consonants++;
			}
		}
		System.out.println("The string contains the number vowels are " + vowels + " and consonants are " + consonants);
		sc.close();
		

	}

}
