package my;

public class Solid_RmbosePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			// for Spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			//for to print 5 star
			for(int j=n;j>=1;j--) {
				System.out.print("*");
			}System.out.println();
		}

	}

}
