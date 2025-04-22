package com.Git;

import java.util.TreeSet;

public class Fib {
	public static void main(String[] args) {
//		int n1 = 0;
//		int n2 = 1;
//		int n = 20;
//		System.out.println(n1);
//		while(n2 <= 20) {
//			System.out.println(n2);
//			
//			int a = n1 + n2;
//			n1 = n2;
//			n2 = a;
//			
//		}
	
	
	
//	reverse String
		
//	StringBuilder sb  =new StringBuilder("Hello");
//	//String name=  "Hello";
//	System.out.println(sb.reverse());
//	System.out.println("==================");
//	String name =  "Hello";
//	for(int i = name.length()-1; i >= 0; i--) {
//		System.out.print(name.charAt(i));
//	}
//	
	
	
//	Find the Second Largest Element in an Array
	
	int arr[] = {12, 35, 1, 10, 34, 1};
	TreeSet tr = new TreeSet();
	for(int i = 0; i < arr.length; i++) {
		tr.add(arr[i]);
	}
	System.out.println(tr.size() - 2);
	System.out.println(tr.lower(tr.last()));
	
	
	}

}


