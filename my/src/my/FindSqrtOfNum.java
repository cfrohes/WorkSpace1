package my;

import java.util.Scanner;

public class FindSqrtOfNum {

	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		secondNum(n);
		//System.out.println((int)Math.sqrt(196));
		for (int i = 1; i <= n;i++) {
			for (int j = 1; j <= n;j++){
			if(j* j == n) {
				System.out.println(n);
				return;
			}
			}
				n--;
			}
		
		sc.close();
				
			
		}

	
//2nd method
public static void secondNum(int n) {
	while(n > 0) {
		int sqrt = (int) Math.sqrt(n);
		if(sqrt * sqrt == n) {
			System.out.println("sqrt is : "+n);
			return;
	}n--;
}
}
}

