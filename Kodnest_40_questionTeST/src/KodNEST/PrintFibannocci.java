package KodNEST;

//Fibonacci Series:
//
//    Write a program to print the Fibonacci series up to n terms.

import java.util.Scanner;
public class PrintFibannocci {
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number:");
	        int n = sc.nextInt();
	        
	      
	        int fibNum = findFibanocci(n);
	        System.out.println("The " + n +"th Fibonacci number is " +fibNum);
	        sc.close();
	    }
	    public static int findFibanocci(int number){
	        if (number == 0){
	            return 0;
	        }
	        if (number == 1) {
	            return 1;
	        }
	        int prev1 = 0;
	        int prev2 = 1;
	        int current = 0;
	        for (int i = 2; i <= number; i++) {
	            current = prev1 + prev2;
	            prev1 = prev2;
	            prev2 = current;
	        }
	        return current;
	    }
	}
