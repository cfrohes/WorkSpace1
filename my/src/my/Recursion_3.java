package my;

public class Recursion_3 {

	public static void main(String[] args) {
		int x = 5;
		int n = 2;
		int ans = xPowerN(x,n);
		System.out.println(ans);
		

	}
	public static int xPowerN(int x,int n){
		if(x == 0) {
			return 0;
		}
		if(n == 0) {
			return 1;
		}

		int x1 = xPowerN(x,n-1);
		int xN = x * x1;
		return xN;
	}

}
