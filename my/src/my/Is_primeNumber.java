package my;

import java.util.Scanner;

public class Is_primeNumber {
	public static boolean isPrime(int number) {
		if(number<=1) {
			return false;
		}
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				return false;
			}
				
			}return true;
		}
		
	

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int number=s.nextInt();
		System.out.println(isPrime(number));
		
	}

}
