package my;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value for a : ");
//		int a=sc.nextInt();
//		System.out.println("Enter the value for b : ");
//		int b=sc.nextInt();
//		System.out.println("AreaTriangle : "+findAreaTriangle(a,b));
//		System.out.println("AreaSquare : "+findAreaSquare(a));
//		System.out.println("AreaRectangle : "+findAreaRectangle(a,b));
//		System.out.println("AreaCircle : "+findAreaCircle(b));
		findAreaTriangle();
		findAreaSquare();
		findAreaCircle();
		findAreaRectangle();
		
}
//	public static double findAreaTriangle(int b,int h) {
//		double area=0.5*b*h;
//		return area;
//	}
//	public static int findAreaSquare(int a) {
//		int area=a*a;
//		return area;
//	}public static int findAreaRectangle(int b,int h) {
//		int area=b*h;
//		return area;
//	}
//	public static double findAreaCircle(int r) {
//		double area=3.14*r*r;
//		return area;
//	}
	  
		
		public static void findAreaTriangle() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value for b : ");
			int b=sc.nextInt();
			System.out.println("Enter the value for h : ");
			int h=sc.nextInt();
			double area=0.5*b*h;
			System.out.println("AreaTriangle :  "+area);
		}
		public static void findAreaSquare() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value for a : ");
			int a=sc.nextInt();
			int area=a*a;
			System.out.println("AreaSqare: "+area);
		}
		public static void findAreaRectangle() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value for b : ");
			int b=sc.nextInt();
			System.out.println("Enter the value for h : ");
			int h=sc.nextInt();
			int area=b*h;
			System.out.println("AreaRectangle : "+area);
		}
		public static void findAreaCircle() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value for r : ");
			int r=sc.nextInt();
			double area=3.14*r*r;
			System.out.println("AreaCircle : "+area);
	}

}

