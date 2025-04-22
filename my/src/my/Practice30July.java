package my;

import java.util.Scanner;

public class Practice30July {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println((int) Math.sqrt(10));
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++) {
			 for(int j = 1;j <= n;j++) {
				 if (j * j == n) {
					 System.out.println(n);
					 return;
				 }
			 }n--;
		}

	}

}
