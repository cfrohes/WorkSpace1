package Algorithms;

import java.util.Scanner;

public class BubbleSortAlgo {
	public static void main(String[] args) {
//		int arr[] = {86, 42, 23, 18, 25};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Size: ");
		int arr[] = new int[sc.nextInt()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		BubbleSortAlgo b = new BubbleSortAlgo();
		System.out.println("The Sorted array is: ");
		b.bubbleSort(arr);
	}
	
	public  void bubbleSort(int arr[]) {
		
		for(int i = 0; i <= arr.length - 2; i++) {
			for(int j = 0; j <= arr.length- 2 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
