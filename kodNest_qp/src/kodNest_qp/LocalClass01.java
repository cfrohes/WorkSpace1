package kodNest_qp;

public class LocalClass01 {
	public static void main(String[] args) {
		Outer02 out = new Outer02();
		out.fun1();
	}

}

class Outer02 {
	void fun1() {
		System.out.println("Outer class Method.");
		class Inner02 {
			void fun2() {
				System.out.println("Inner Class Method.");
			}
		}
		Inner02 innerObj = new Inner02();
		innerObj.fun2();
	}
}