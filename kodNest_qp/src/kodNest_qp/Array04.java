package kodNest_qp;

import java.util.Arrays;

public class Array04 {
	public static void main(String[] args) {
		int[] arr = new int[5]; Arrays.fill(arr, 10);
		  // Fill the array with the value 10
		for(int el : arr) {
			System.out.println(el);
		}
	}
}
