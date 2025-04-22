package my;

public class PatternMatchig6Aug {
//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * * 
//***********
//***********
//***     ***
//***     ***
//***     ***


	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j =1;j<=6-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= i;j++) {
//				System.out.print("* ");
//				
//				}
//			System.out.println();
//			
//			
//	}
//		for(int i=1;i<=5;i++) {
//			for(int j =1;j<=11;j++) {
//				if(i==1||i==2||j==1||j==2||j==3||j==9||j==10||j==11) {
//				System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			
//			System.out.println();
//}
		
//		
//	      * 
//	     * * 
//	    *   * 
//	   *     * 
//	  * * * * * 
		for(int i=1;i<=4;i++) {
			for (int j = 1;j<= 6-i;j++) {
				System.out.print(" ");
			}
			for (int j = 1;j<= i;j++) {
				if (j==1||j==i){
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		for(int i=1;i<=10;i++) {
			
			System.out.print("*");
		}
		
		}
}

