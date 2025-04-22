//You need to develop a simple Java application to find the n-th term of the series 1, 3, 6, 10, 15, 21...
package kodNest_qp;
import java.util.Scanner;

public class Finding_Nth_termOfTheSeries {
	    public static void main(String[] args) {
	        // Use Scanner to take user input
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        
	        // Find and print the n-th term of the series
//	        int sum = 0;
//	        for (int i = 1; i <= n; i++) {
//	            sum += i;
//	        }
	        //or
	        int nthTerm = n * (n + 1) / 2;
	        System.out.println("The " + n +"th term of the series is " + nthTerm + ".");
	    }
	}