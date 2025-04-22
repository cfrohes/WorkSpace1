package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarysearchAlgo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int arr[] = {23,45,67,89,44};
//		int key = 45;
		System.out.println("Enter the size of the array:");
		int arr[] = new int[sc.nextInt()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int  key = sc. nextInt();
		
//		int low = 0;
//		int high = arr.length-1;
//		
//		while(low <= high) {
//			int mid = (low + high) / 2;
//			if(key == arr[mid]) {
//				System.out.println("Key Found at index " + mid);
//				return;
//			}
//			else if(key > arr[mid]) {
//				low = mid + 1;
//				high = high;
//			}
//			else {
//				high = mid - 1;
//				low = low;
//			}
//		}
//		System.out.println("Key Not Found ");
		Arrays.sort(arr);
		int index = findKey(arr, key);
		if(index >= 0) {
			System.out.println("The Key is Found at index " + index);
		}
		else {
			System.out.println("Key Not Found ");
		}
		
	}
	
	public static int findKey(int arr[], int key) {
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			if(key == arr[mid]) {
				
				return mid;
			}
			else if(key > arr[mid]) {
				low = mid + 1;
				high = high;
			}
			else {
				high = mid - 1;
				low = low;
			}
		}
		return -1;
	}
}
