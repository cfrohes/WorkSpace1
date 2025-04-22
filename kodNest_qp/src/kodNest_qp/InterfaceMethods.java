package kodNest_qp;

public class InterfaceMethods {
	public static void main(String[] args) {
		Demo d = new Demo2();
		d.abstractMethod();
		d.defaultMethod();
		Demo.staticMethod();
	}

}
interface Demo {
	//abstract method
	public abstract void abstractMethod();
	//static method
	public static void staticMethod() {
		System.out.println("staticMethod");
	}
	
	//default method
	default void defaultMethod() {
		System.out.println("defaultMethod");
	}
}
class Demo2 implements Demo {
	public void abstractMethod() {
		System.out.println("abstractMethod");
	}
}
