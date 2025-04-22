package KodNEST;
//Sum of Odd Numbers:
//
//    Write a program to find the sum of all odd numbers between 1 and 50.


public class SumOfOddNumbers {

	public static void main(String[] args) {
		int oddSum = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				oddSum += i;
			}
		}
		System.out.println(oddSum);		

	}

}
