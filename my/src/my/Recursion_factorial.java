package my;

public class Recursion_factorial {

	public static void main(String[] args) {
		System.out.println(fact(5));
		

	}
	public static int fact(int n) {
		if(n==0||n==1) {
			return 1;
		}
		int n1=fact(n-1);
		int n2 =n*n1;
		return n2;
		
		
	}

}
