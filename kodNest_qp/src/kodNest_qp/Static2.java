package kodNest_qp;

import java.util.Scanner;

public class Static2 {

	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		int co1 =sc.nextInt();
		Circle c1 = new Circle();
		c1.radius = 10;
		c1.findArea();
		Circle c2 = new Circle();
		c2.radius = 100;
		c2.findArea();
		Circle c3 = new Circle();
		c3.radius = 1000;
		c3.findArea();
		

	}

}
class Circle {
	double radius;
	double pi = 3.14;
	public void findArea() {
		System.out.println("Area = " + (pi *radius *radius));
	}
}
