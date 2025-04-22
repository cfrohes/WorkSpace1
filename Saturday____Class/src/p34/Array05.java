package p34;

import java.util.ArrayList;
import java.util.Arrays;

//Move all 0 to the end of the array
public class Array05 {

	public static void main(String[] args) {
		int input[] = {3, 0, 1, 12, 0, 5};

        // Calling the method and printing the result
        int[] result = movrEnd0(input);
        System.out.println("Array after moving 0s to the end: " + Arrays.toString(result));
   
	}
	public static int[] movrEnd0(int arr[]) {
		int[] a = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				a[count] = arr[i];
				count++;
			} 
		}
//		for (int i = 1; i <= count; i++) {
//			a[i] = 0;
//		}
		

        return a;
		
	}
}
