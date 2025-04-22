package p34;
//Find the product of 2nd max & 2nd min in a given array
public class Array04 {
	// Find the product of the second largest and second smallest values in the array
	    public static void main(String[] args) {
	        int arr[] = {1,2,3,4,5,6};
	        System.out.println("Product : " + findProduct(arr));	
	    }

	    public static int findProduct(int arr[]) {
	        // Initialize values for largest, second largest, smallest, and second smallest
	        int largest = arr[0], secondLargest = arr[0];
	        int smallest = arr[0], secondSmallest = arr[0];

	        // Loop through the array using a normal for loop to find the largest, second largest, smallest, and second smallest
	        for (int i = 0; i < arr.length; i++) {
	            int num = arr[i];

	            // Find largest and second largest
	            if (arr[i] > largest) {
	                secondLargest = largest;
	                largest = arr[i];
	            } else if (arr[i] > secondLargest && arr[i] != largest) {
	                secondLargest = num;
	            }

	            // Find smallest and second smallest
	            if (arr[i] < smallest) {
	                secondSmallest = smallest;
	                smallest = arr[i];
	            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
	                secondSmallest = arr[i];
	            }
	        }

	        // Return the product of second largest and second smallest
	        return secondLargest * secondSmallest;
	    }
	}

