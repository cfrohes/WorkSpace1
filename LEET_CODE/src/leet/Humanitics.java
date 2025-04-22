package leet;

import java.util.Scanner;

public class Humanitics {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		num = Math.abs(num);
		int evenSum = 0;
		int oddSum = 0;
		while ( num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				evenSum += rem;
			}else {
				oddSum += rem;
			}
			num /= 10;
		}
		System.out.println(evenSum - oddSum);
	}

}
