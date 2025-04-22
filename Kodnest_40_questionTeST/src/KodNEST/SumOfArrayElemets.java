package KodNEST;

import java.util.Scanner;

//Sum of Array Elements:
//
//    Write a program to calculate the sum of all elements in an array using a loop.


public class SumOfArrayElemets {

	public static void main(String[] args) {
		int[] a = {1,3,4,5,2};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			
		}
		System.out.println("SumOfArrayElemets are : " + sum);
		

	}

}
