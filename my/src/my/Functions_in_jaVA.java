package my;

import java.util.Scanner;

public class Functions_in_jaVA {
//	public static void here_is(String name) {
//		System.out.println(name);
//		return;
//	}
	public static int sum(int a,int b) {
		return a+b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static int factorial(int n) {
		if(n<0){
			System.out.println("invalid");
	        return 0;
		}
		int fact=1;
		for(int i =n;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//String name=s.nextLine();
		//here_is(name);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(sum(a,b));
		System.out.println(mul(a,b));
		int n=s.nextInt();
		System.out.println(factorial(n));
		
			
		}
	}
