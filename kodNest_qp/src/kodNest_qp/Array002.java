package kodNest_qp;

import java.util.Scanner;

public class Array002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		float[] arr = new float[sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter the player " + i + " height :");
			arr[i] = sc.nextFloat();
			
		}
		
		System.out.println("The Player Heights are :" );
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		
//	}
		//Enghanced for loop /for each loop
		System.out.print("[");
		for(float xx : arr) {
			System.out.print(xx + " ");
		}
		System.out.println("]");
}
}
 