package my;
import java.util.Scanner;
public class month07Aug {
	
	    public static void main(String[] args) {
	        // Create a Scanner object to take user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the maximum number
	        System.out.print("Enter the maximum number: ");
	        int maxNumber = scanner.nextInt();

	        // Close the scanner to prevent resource leaks
	        scanner.close();

	        // Print the Fibonacci series up to the given number
	        System.out.print("Fibonacci series up to " + maxNumber + ": ");

	        // Start with the first two Fibonacci numbers
	        int first = 0, second = 1;

	        // Check if the user entered 0
	        if (maxNumber >= 0) {
	            System.out.print(first); // Print the first number (0)
	        }

	        // Generate and print the Fibonacci numbers until the maxNumber is reached or exceeded
	        while (second <= maxNumber) {
	            System.out.print(" " + second);

	            // Calculate the next number in the series
	            int next = first + second;

	            // Update the previous two numbers for the next iteration
	            first = second;
	            second = next;
	        }
	    }
	}



