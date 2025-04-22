package KodNEST;

//Pattern Printing:
//
//    Write a program to print the following pattern for a given number n:
//
//     *
//    **
//    ***
//    ****
//    *****


public class PatternMatching {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}

}
