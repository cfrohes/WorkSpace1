package JAVA;
import java.util.Scanner;

public class WithoutRepeatingCharCountMax {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // TODO: Ask user for input string
	        String input = scanner.nextLine();
	        String newString = "";
	        // TODO: Find length of longest substring without repeating characters
	        for(char c : input.toCharArray()){
	            if (newString.contains(String.valueOf(c))){
	                continue;
	            }else {
	                newString += c;
	                System.out.println(newString);
	            }
	        }
	        
	        System.out.println("The length of the longest substring without repeating characters is: " + newString.length());
	        scanner.close();
	    }
	}

