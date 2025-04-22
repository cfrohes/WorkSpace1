package Algorithms;

import java.util.Scanner;

public class InsertionSortAlgo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arr:");
		int arr[] = new int[sc.nextInt()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Sorted array:");
		
		for(int i = 1; i < arr.length; i++) {
			int item = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > item) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = item;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
