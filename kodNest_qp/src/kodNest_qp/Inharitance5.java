package kodNest_qp;

public class Inharitance5 {
	public static void main(String[] args) {
		Child c = new Child();
		c.fun(); // Child.fun();
		
		Parent c2= new Child(); //up-casting:Parent reference --> child obj
		c2.fun(); // Parent.fun();
		
	}

}
class Parent {
	public static void fun() {
		System.out.println("Parent-Fun");
	}
}
class Child extends Parent {
	public static void fun() {
		System.out.println("Child-Fun");
	}
}
