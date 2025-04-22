package kodNest_qp;

import java.util.Scanner;

//Enhanced for loop 
//for-each loop
public class Array03 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int size = sc.nextInt();
		
		String [] tech = new String[size];
		sc.nextLine();
		for(int i = 0; i < tech.length; i++) {
			System.out.println("Enter the " + i +"th Array Element: ");
			
			tech[i]  = sc.nextLine();
			
		}
		System.out.println();
		System.out.println("The Array Elements are :");
		for(String s : tech) {
			System.out.println(s);
		}
	}
}
