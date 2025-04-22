package p34;

import java.lang.reflect.Array;

//Find the maximum elememnt in the array
public class Array03 {
	public static void main(String[] args) {
		int arr[] = {4, 17, -5, -97, 434};
		System.out.println("maxmimum number in the array: " + maxEle(arr));
		System.out.println("minimum number in the array: " + minEle(arr));
		
	}
	
	public static int minEle(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]  < min) {
				min = arr[i];
			}
		}
		return min;
		
		}
			
	public static int maxEle(int[] arr) {
		int max = arr[0];

		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];	
			}
		}
		return max;
	}
}
