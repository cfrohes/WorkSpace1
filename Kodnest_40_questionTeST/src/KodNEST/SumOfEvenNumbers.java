package KodNEST;
//Sum of Even Numbers:
//
//    Write a program to find the sum of all even numbers between 1 and 50.
//    Use loops and conditionals to identify and sum the even numbers.


public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 50; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum of even Numbers from 1 to 50 is "+sum);
	}

}
