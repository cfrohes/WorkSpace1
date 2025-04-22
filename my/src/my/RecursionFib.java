package my;

public class RecursionFib {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n=7;
		System.out.println(n1);
		System.out.println(n2);
		recFib(n1,n2,n-2 );
		
//		for(int i=2;i<7;i++) {
//			int n=n1+n2;
//			System.out.println(n);
//			n1=n2;
//			n2 =n;
			
	//	}
	}
	public static void recFib(int n1,int n2,int n) {
		if(n == 0) {
			return;
		}
		
		int next=n1+n2;
		System.out.println(next);
		n1=n2;
		recFib(n2,next,n-1);
	}

}
