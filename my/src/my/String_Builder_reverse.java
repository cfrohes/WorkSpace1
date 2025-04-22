package my;

public class String_Builder_reverse {

	public static void main(String[] args) {
//		StringBuilder sb=new StringBuilder("HelloWold");
//		System.out.println(sb);
//		for(int i=0;i<sb.length()/2;i++) {
//			int front=i;
//			int back=sb.length()-1-i;
//			
//			char frontChar=sb.charAt(front);
//			char backChar=sb.charAt(back);
//			
//			sb.setCharAt(front,backChar);
//			sb.setCharAt(back,frontChar);
//			
//		}System.out.println(sb);
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=2*(5-i);j++) {
				System.out.print(" ");
			}for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=2*(5-i);j++) {
				System.out.print(" ");
			}for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		}

}
