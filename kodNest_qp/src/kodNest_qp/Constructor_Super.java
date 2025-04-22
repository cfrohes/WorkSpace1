package kodNest_qp;

public class Constructor_Super {
	public static void main(String[] args) {
		new Child03();
		}
}

class Parent03 {
	Parent03() {
		System.out.println("Parent Constructor");
	}
}

class Child03 extends Parent03 {
	
}