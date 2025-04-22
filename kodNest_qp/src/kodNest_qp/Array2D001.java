package kodNest_qp;

import java.util.Scanner;

public class Array2D001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of company:");
		int row = sc.nextInt();
		System.out.println("Enter the no. of company Employees:");
		int column = sc.nextInt();
		
		String [][] arr = new String[row][column];
		
		System.out.println("Please Enter Array Elements:   ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the value for " + i + "th Row and " + j + "th Column");
				arr[i][j] = sc.next();
			}
		}
		
		System.out.println("the company and its employer details : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
			System.out.print(arr[i][j] + " ");
			if (j == 0) {
				System.out.print("-> ");
			}
			}
			System.out.println();
			}

	}
}


































