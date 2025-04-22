package my;

import java.util.Scanner;

//find larger no.in the given three numbers
public class Big_nu8mber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n1,n2,n3;
		n1=s.nextInt();
		n2=s.nextInt();
		n3=s.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.print("n1 is greater");
			
		}else
			if(n2>n1 && n2>n3) {
				System.out.print("n2 is greater");
			}else {
				System.out.print("n3 is greater");
			}
	}
	

}
