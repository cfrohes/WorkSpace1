package kodNest_qp;

public class InterfaceMethods02 {

}

abstract class demo3 {
	int a = 10;
	static int x = 28;
	static void staticMethod() {
		System.out.println("static method");
	}
	static {
		System.out.println("static block");
	}
//	default void defaultMethod () {
//		//default methods are only allowed in d,cc interfaces
//	}
	public static void main(String[] args) {
		demo3.staticMethod();
		//int a =12;
		//System.out.println("a = " + a);
		//int x =12;
		System.out.println("x = " + x);
	}
}
