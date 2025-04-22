package my;

public class Recursion_problems {

	public static void main(String[] args) {
		printNumber(1,5,1);
//		System.out.println();
//		int sum = 0;
//		for(int i=1;i<=7;i++) {
//			sum+=i;
//			
//		}
//		System.out.println(sum);
		

	}
	public static void printNumber(int i,int n,int fact) {
		//Base case
		if(i==n) {
			fact*=i;
			System.out.println("fact: "+fact);
			return;
		}
		fact*=i;
		printNumber(i+1,n,fact);

}
}
//	if(n == 6) {
//		return;
//	}
//	System.out.print(n+" ");
//	printNumber(n+1);
//}