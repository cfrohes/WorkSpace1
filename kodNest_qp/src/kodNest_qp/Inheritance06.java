package kodNest_qp;

public class Inheritance06 {
	public static void main(String[] args) {
		Parent01 p = new Child01();
		p.fun1(); // accessing inherited method
		p.fun2();// accessing overridden method
		//p.fun3(); //can't accessing child specific  method
		// to access this we have to perform the " down casting "
		//((Child01)(p)).fun3(); //down casting 
		Child01 c = (Child01)p;   //down casting 
		c.fun3();
	}
}
class Parent01 {
	void fun1() {
		System.out.println("Parent fun1");
	}
	void fun2() {
		System.out.println("Parent fun2");
	}
}
class Child01 extends Parent01 {
	void fun3() {
		System.out.println("Child fun3");
	}
	void fun2() {
		System.out.println("Child fun2");
	}
	void fun1() {
		System.out.println("Child fun1");
	}
	
}
