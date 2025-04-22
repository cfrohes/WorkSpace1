package my;
import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		if(n>0) {
			System.out.println("n is a Positive Number");
			
		}else
			if(n<0) {
			System.out.println("n is a Negative Number");
		}else {
			System.out.println("n is ZER0");
		}
		

	}

}
