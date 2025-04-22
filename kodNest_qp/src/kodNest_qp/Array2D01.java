package kodNest_qp;

import java.util.Scanner;

public class Array2D01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Size of the array");
		int row = sc.nextInt();
		
		System.out.println("Enter the column Size of the array.");
		int column = sc.nextInt();
		
		int[][] arr = new int[row][column];
		//usre input
		System.out.println("Please Enter Array Elements:   ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the value for " + i + "th Row and " + j + "th Column");
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		//print the array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
