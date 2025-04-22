package kodNest_qp;

abstract class Greeter {
	abstract void greet();
	abstract void fun();
}
//interface Greeter {
//	void greet();
//  void fun();
//}
public class Anonymous_Class {
	public static void main(String[] args) {
		Greeter gre = (Greeter) new Greeter() {
			public void greet() {
				System.out.println("hello");
			}
			public void fun() {
				System.out.println("hi");
			}
		};
		gre.greet();
		gre.fun();
	}

}
