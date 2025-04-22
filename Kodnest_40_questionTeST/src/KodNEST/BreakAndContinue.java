package KodNEST;
//Break and Continue:
//
//    Write a program that iterates through numbers from 1 to 20.
//    Use a loop and conditionals to skip printing the number 13 (use continue) and stop the loop if the number is 18 (use break).


public class BreakAndContinue {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if (i == 13) {
				continue;
			} if (i == 18) {
				break;
			} 
			System.out.println(i);
			
		}
		

	}

}
