package kodNest_qp;

import java.util.Scanner;

public class Array003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter the  " + (i+1) + " Element :");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array: [");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
		
		System.out.println("The sum of the Array is : " + findSum(arr));
		
		sc.close();
	}
	public static int findSum(int arr[]) {
		int sum = arr[0];
		for(int i = 1; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
