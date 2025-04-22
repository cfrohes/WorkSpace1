package kodNest_qp;

public class IsPrime_or_Not {

	public static void main(String[] args) {
	 int n = 1;
	 System.out.println(isPrime(n));
	
	}
	 public static boolean isPrime (int num) {
		 if(num <=  0) {
			 return false;
			}
		 for(int i = 2;i<= Math.sqrt(num);i++) {
			 if(num % i == 0) {
				 return false;
			 }
			 
		 }
		 return true;
		 
	 }

}
