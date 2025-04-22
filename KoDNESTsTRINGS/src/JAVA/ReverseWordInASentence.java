package JAVA;

import java.util.Scanner;
//input = hello world tu
//output = olleh dlrow ut
public class ReverseWordInASentence {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the input:");
		String input = sc.nextLine();
		String wordsArray[] = input.split(" ");
		String reverseString = "";
		for(int i = 0; i < wordsArray.length; i++) {
			String word = "";
			String revWord = "";
			word = wordsArray[i];
			for(int j = word.length()-1; j >= 0; j--) {
				revWord = revWord + word.charAt(j);
			}
			reverseString = reverseString + revWord + " ";
		}
		
		System.out.println("Original string is: " + input);
		System.out.println("reversed string:" + reverseString);
		
	}

}
