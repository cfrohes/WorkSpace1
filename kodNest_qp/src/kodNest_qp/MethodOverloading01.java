package kodNest_qp;

public class MethodOverloading01 {
	public static void main(String[] args) {
		Addtion a = new Addtion();
		a.add(1,1);
		a.add(6.7,7.8,4.0);
		a.add(9, 5.7,6);
	}
	
	
	

}

class Addtion {
	void add(int a, int b) {
		System.out.println("Sum= "+ (a+b));
	}
	void add(double a, double b) {
		System.out.println("Sum= "+ (a+b));
	}
	void add(int a, int b,double c) {
		System.out.println("Sum= "+ (a+b+c));
	}
	void add(double a, double b,double c) {
		System.out.println("Sum= "+ (a+b+c));
	}void add(double a, int b,int c) {
		System.out.println("Sum= "+ (a+b+c));
	}
}