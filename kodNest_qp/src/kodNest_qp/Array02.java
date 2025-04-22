package kodNest_qp;

import java.util.Scanner;

public class Array02 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int size = sc.nextInt();
		
		int [] marks = new int[size];
		
		for(int i = 0; i < marks.length; i++) {
			System.out.println("Enter the " + i +"th Array Element: ");
			marks[i]  = sc.nextInt();
		}
		System.out.println();
		
		for(int i = 0; i < marks.length; i++) {
			System.out.println("marks[" + i + "] : " + marks[i] );
		}
	}
}
