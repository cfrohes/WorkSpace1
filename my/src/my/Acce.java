package my;

import java.util.Scanner;

public class Acce {
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
     	int[] arr = new int[size];
     	
     	for(int i = 0; i < arr.length; i++) {
     		arr[i] = sc.nextInt();
     	}
//     	
//     	int sum = 0;
//     	for(int i = 0; i < arr.length; i++) {
//     		sum += arr[i];
//     	}
//     	
//     	int h = sum/60;
//     	
//     	System.out.println(h);
     	int count = 0;
     	int [] cf = new int[60];
     	
     	for(int i = 0; i < arr.length; i++) {
     	    for(int j = i + 1; j < arr.length; j++) {
     	        if((arr[i] + arr[j]) % 60 == 0) {
     	            count++;
     	            System.out.println(arr[i]+" , " +arr[j]);
     	        }
     	    }
     	}

     	if(count > 0) {
     		System.out.println(count);
     	} else {
     		System.out.println("NO HOURS");
     	}
	}

}
