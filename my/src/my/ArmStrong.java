package my;
import java.util.Scanner;
public class ArmStrong {
	

	
	
	    public static void main(String[] args) {
	        // Use Scanner to take user input
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check if the number is an Armstrong number
	        int sum = 0;
	        int temp = number;
	        int numlength = String.valueOf(number).length();
	        
	        // Calculate the sum of digits raised to the power of numlength
	        for (int i = 1;i <= number; i++) {
	        while (number > 0) {
	            int r = number % 10;
	            sum += (int) Math.pow(r, numlength);
	            number = number / 10;
	        }

	        // Output result
	        if (temp == sum) {
	            System.out.println(sum + " ");
	        }
	        }

	        scanner.close();
	    }
	}


