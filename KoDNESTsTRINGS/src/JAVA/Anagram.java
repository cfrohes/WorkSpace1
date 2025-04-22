package JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		if(isAnagram(str1, str2)) {
			System.out.println("The given Strings are Anagram..");
		}
		else {
			System.out.println("The given Strings are Not an Anagram..");
		}
		
	}
	
	public static boolean isAnagram(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if(s1.length() != s2.length()) {
			return false;
		}
		char str1[] = s1.toCharArray();
		char str2[] = s2.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
//		for(int i = 0; i < str1.length; i++) {
//			if(str1[i] != str2[i]) {
//				return  false;
//			}
//		}
//		return true;
		return Arrays.equals(str1, str2);
	}
}
