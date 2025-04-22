package KodNEST;
//Prime Numbers:
//    Write a program to print all prime numbers between 1 and 100.
//    Use a loop to iterate through the numbers and conditionals to check for prime numbers.



public class PrimeNumber {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 100; i++) {
			int count = 0;
			for (int j = 1; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					count++;
				}
				
				
			}
			if (count == 2) {
				System.out.println(i);			}
		}
		
	}

}
