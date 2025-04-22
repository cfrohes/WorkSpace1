package kodNest_qp;

public class Perfect_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 49;
		for (int i = 1; i<= n;i++) {
			
				if(i * i == n) {
					System.out.println(n + " is a perfect square.");
					return; //system.exit(0);
				}
			}
		System.out.println(n + " is not a perfect square.");
		

	}

}
