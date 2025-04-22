package kodNest_qp;

public class InnerClass02 {
	public static void main(String[] args) {
	Outer outObj = new Outer();
	Outer.Inner inObj = outObj.new Inner();
	}
}

class Outer {
	int x = 100;
	void fun1() {
		System.out.println("This is Outer class.");
	}
	
	class Inner {
		void fun2() {
			System.out.println("Inner Class Method.");
			System.out.println("Outer class x: " + x);
			fun1();
		}
	}
}