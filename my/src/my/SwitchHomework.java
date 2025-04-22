package my;

import java.util.Scanner;

public class SwitchHomework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Grade : A");
			break;
		case 2:
			System.out.println("Grade : A");
			break;
		case 3:
			System.out.println("Grade : A");
			break;
		case 4:
			System.out.println("Grade : B");
			break;
		case 5:
			System.out.println("Grade : B");
			break;
		case 6:
			System.out.println("Grade : C");
			break;
		case 7:
			System.out.println("Grade : D");
			break;
		default:
			System.out.println("Invalid");
		
		}

	}

}
