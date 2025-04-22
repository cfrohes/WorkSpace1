package KodNEST;

import java.util.Scanner;

//Leap Year Checker:
//
//    Write a program to check if a given year is a leap year or not using conditionals.
//A year is a leap year if it is divisible by 400.
//If it is not divisible by 400, it is a leap year if it is divisible by 4 but not divisible by 100.



public class LeafYearCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the year :");
		int year = sc.nextInt();
		if ((year % 400 == 0 ) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + " is a leap year.");
		}else {
				System.out.println(year + " is not a leap year.");
			}
		
		sc.close();

	}

}
