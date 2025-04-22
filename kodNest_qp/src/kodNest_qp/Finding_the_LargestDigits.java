package kodNest_qp;

import java.util.Scanner;

public class Finding_the_LargestDigits {
	    public static void main(String[] args) {
	        // Use Scanner to take user input
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the Number: "); 
	        int number = scanner.nextInt();//91453267
	        int originalNum = number;
//	        small(number);
//	        large(number);
	        System.out.println((int)Math.sqrt(25)+" " + Math.floor(5));
	        
	 
	    }
	    // Find and print the smallest digit in the number
	    public static void small (int number) {
	    	int count = 0;
	    	int smallest = 9;
	    	int countSmallPosition = 0;
	    	 while (number > 0) {//91453267 > 0
		            int lastNum = number % 10;   // 91453267 % 10 = 7
		            count ++; // count = 1;
		            if (lastNum < smallest) { // 7 < 9
		            	smallest = lastNum;   // smallest = 7;
		            	countSmallPosition = count;
		            }
		            number /= 10;
		            

		        } System.out.println("Smallest digit is : " + smallest + " present at position " + countSmallPosition + " from right.");
		
        }
	    // Find and print the Largest digit in the number
	    public static void large (int number) {
	    	int count = 0;
	    	int largest = 0;
	    	int countLargePosition = 0;
	    	 while (number > 0) {
		            int lastNum = number % 10;
		            count++;
		            if (lastNum > largest) {
		            	largest = lastNum;
		            	countLargePosition = count;
		            }
		            number /= 10;
		            

		        } System.out.println("Largest digit is : " + largest + " present at position " +countLargePosition + " from right.");
		
        }
	}