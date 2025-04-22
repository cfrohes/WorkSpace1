package my;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
//		for(int i = 1;i<=5;i++) {
//			for(int j =1;j<=i;j++) {
//				if(i==5 || i==1 || j==i|| j==1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}System.out.println();
//		}
		for(int i=1;i<=5;i++) {
			for(int j =1;j<=6-i-1;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<= 2*(i+1);j++) {
				
				if(j==1 || j==2*i ||  i==6-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
	}}
//		
	
//		
//		 
//		        Scanner scanner = new Scanner(System.in);
//		        int N = scanner.nextInt();
//		        int M = scanner.nextInt();
//		        // write your code here
//		        int factN = 1;
//		        int factM = 1;
//		        int Num = N;
//		        int Mun = M;
//
//		        do {
//		            factN *= N;
//		            N--;
//		        }while(N>1);
//		        System.out.println("Factorial of " + Num + " is " + factN);
//		        do {
//		            factM *= M;
//		            M--;
//		        }while(M>1);
//		       
//		        System.out.println("Factorial of " + Mun + " is " + factM);
		    
		
		// TODO Auto-generated method stub
		//type[] array name=new type[size]=====>Syntax of array declaration
//		int[] arr=new int[3];
//		arr[0]=12;
//		arr[2]=10;
//		//arr[5]=30;
//		arr[1]=3;
		//System.out.println(arr[5]);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		Scanner sc = new Scanner(System.in);=========================================================================================================================================
//		int size=sc.nextInt();
//		int[] arr=new int[size];
//		//input
//		for(int i=0;i<size;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int x=sc.nextInt();
//		//output
//		for(int i=0;i<size;i++) {
//			if(arr[i] == x) {
//			System.out.println("x is found : "+i);
//		}}============================================================================================================================================================================
	
//		Scanner sc = new Scanner(System.in);
//		int size=sc.nextInt();
//		int[] arr=new int[size];
//		//input
//		for(int i=0;i<size;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int max=Integer.MAX_VALUE;
//		int min=Integer.MIN_VALUE;
//		for(int i=0;i<size;i++) {
//		if(min>arr[i]) {
//			min=arr[i];
//		}else if( max<arr[i]) {
//			max=arr[i];
//		}
//	}System.out.println("max"+max+"min is"+min);
//
//	}
//
//	public static void sort(String[] arr) {
		// TODO Auto-generated method stub
		
//	}}
