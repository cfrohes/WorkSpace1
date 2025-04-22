package kodNest_qp;

import java.util.Scanner;

public class Print_nPrimeNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
		int count = 0;
		int number = 2;
		while (count < n) {
		if (isPrime(number)) {
			System.out.println(number);
			count ++;
		}
		number++;
	}
}
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(num);i++) {
		if(num % i == 0) {
			return false;
		}
		}
		return true;
	}
}
