package my;

public class Inverted_Rotated_Halfpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++) {
			//THIS LOOP FOR -----> TO PRINT SPACE
			for(int j=1;j<=n-i;j++) {
				 System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				 System.out.print("*");
		}
			System.out.println();
	}

}
}
