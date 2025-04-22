package kodNest_qp;

public class Print_PrimeNum {

	public static void main(String[] args) {
		int n =26;
		for(int i = 2; i <= n; i++) {
			int count = 0;
			for (int j = 1;j <= n;j++) {
				if(i % j == 0) {
				count++;
			}
		}
			if (count == 2) {  // prime number -- it is only divisible by 1 and itself.
				//thats why  used count ==2 if count is >2 than it is not a prime 
				
				System.out.print(i+" ");
			}

	}
	}
}
