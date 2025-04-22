package JAVA;

import java.util.Scanner;

public class ReversingTheStringWithoutChangingTheSpacePosition {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String input = sc.nextLine();
		char arr1[] = input.toCharArray();
		char arr2[] = new char[arr1.length];
		
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] == ' ') {
				arr2[i] = arr1[i];
			}
		}
		int j = arr2.length-1;
		for(int i = 0; i < arr2.length; i++) {
			if(arr1[i] != ' ') {
				if(arr2[j] == ' ') {
					j--;
				}
					arr2[j] = arr1[i];
					j--;
				
			}
		}
		String reverse = new String(arr2);
		System.out.println(input);
		System.out.println(reverse);
	}
}
