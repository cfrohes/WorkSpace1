package Algorithms;

public class LinearSearchAlgorithm {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int key = 5;
		
		for(int i = 0; i < arr.length; i++) {
			if(key == arr[i]) {
				System.out.println("Key found at index " + i);
				//System.exit(0);
				return;
			}
		}
		System.out.println("key not found ");
	}
}
