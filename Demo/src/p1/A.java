package p1;

public class A {
	private void fun1() {
		System.out.println("Private method");
	}
	 void fun2() {
		System.out.println("Default method");
	}
	 protected void fun3() {
		 System.out.println("Protected method");
	 }
	 public void fun4() {
		 System.out.println("Public method");
	 }
	 public static void main(String[] args) {
		A obj = new A();
		obj.fun1();
		obj.fun2();
		obj.fun3();
		obj.fun4();
	}
}
