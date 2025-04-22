package my;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=0;
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println("1.ADDITION");
		System.out.println("2.SUBSTRACTION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVISION");
		System.out.println("ENTER THE OPTION");
		int ch=s.nextInt();
		switch(ch) {
		case 1:res=n1+n2;break;
		case 2:res=n1-n2;break;
		case 3:res=n1*n2;break;
		case 4:res=n1/n2;break;
		default:
			System.out.println("INVALID OPTION");
		}
		System.out.println("Result"+res);
	}

}
