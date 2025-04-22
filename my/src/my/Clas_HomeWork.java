package my;

import java.util.Scanner;

public class Clas_HomeWork {

	public static void main(String[] args) {
		add();
		subtract(100,80);
		System.out.println("Product = "+multiply(2,4));
		System.out.println("Division = "+divide());
		

	}
	public static void add() {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER NUM1");
		int num1=sc.nextInt();
		System.out.println("ENTER NUM2");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("Sum = "+sum);
	}
	public static void subtract(int num1,int num2) {
		int diff=num1-num2;
		System.out.println("Difference = "+diff);
	}
	public static int multiply(int num1,int num2) {
		int prod=num1*num2;
		return prod;
	}
	public static double divide() {
		Scanner s =new Scanner(System.in);
		System.out.println("ENTER NUM1");
		int num_1=s.nextInt();
		System.out.println("ENTER NUM2");
		int num_2=s.nextInt();
		double div=num_1/num_2;
		return div;
		
	}

}
