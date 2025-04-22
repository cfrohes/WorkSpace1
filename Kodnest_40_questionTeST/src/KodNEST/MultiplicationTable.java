package KodNEST;
//Multiplication Table:
//
//    Write a program to print the multiplication table for a given number up to 10.
//    Use nested loops to generate the table.

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(n + " x " + i + " = " + n*i);
//		}
//		sc.close();
		for (int i = 1; i <= n; i++) {
            System.out.println("Multiplication table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println(); // Print a blank line between tables for readability
        }
	}

}
