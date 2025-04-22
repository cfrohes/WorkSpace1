package KodNEST;

//Find the Largest and Smallest Element in an Array:
//
//    Write a program to find the largest and smallest elements in an array using loops.


public class FindLargestAndSmallestNumInTheArray {

	public static void main(String[] args) {
		int[] a = {1,67,89,45,35,76};
		int largest = Integer.MIN_VALUE;
		int smallest =Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}
			if (a[i] < smallest) {
				smallest = a[i];
			}
		}
		System.out.println(largest + " is the largest Number in the array.");
		System.out.println(smallest + " is the smallest Number in the array.");
		
	}

}
