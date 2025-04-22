package com.FileHandling.System;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the integer Element");
		int a = sc.nextInt();
		System.err.println("The Element is "+ a);
		System.out.println("The Element is " + a);
		sc.close();
	}
}
