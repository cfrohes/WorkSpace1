package kodNest_qp;

import java.util.Scanner;

public class SumofSingleDigits {
	    public static void main(String[] args) {
	        // Use Scanner to take user input
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int result = number;
	        
	        // Calculate the sum of digits until it becomes a single-digit number
	        while (result >= 10) {
	            result = sumOfDigits(result);
	        }

	        // Print the single-digit result
	        System.out.println("The single-digit sum of digits of " + number + " is " + result + ".");

	        scanner.close();
	    }

	    // Method to calculate the sum of digits of a number
	    public static int sumOfDigits(int num) {
	        int sum = 0;
	        while (num != 0) {
	            sum += num % 10;
	            num /= 10;
	        }
	        return sum;
	    }
	

}
