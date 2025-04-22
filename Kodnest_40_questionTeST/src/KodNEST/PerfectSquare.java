package KodNEST;
import java.util.Scanner;
// Use Scanner to take user input
//Check if the number is a perfect square
public class PerfectSquare {
	
	
	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number:");
	        int number = scanner.nextInt();

	        
	        int sqrt = (int)Math.sqrt(number);
	        if (sqrt * sqrt == number) {
	            System.out.println(number + " is a perfect square.");
	        } else
	        {
	            System.out.println(number + " is not a perfect square.");
	        }
	        scanner.close();
	        
	    }
}
