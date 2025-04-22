package kodNest_qp;

public class Constructor_Super04 {
	public static void main(String[] args) {
		Child04 c = new Child04();
		c.display();
	}

}
class Parent04 {
	int x = 4;
	void fun(){
		System.out.println("Parent Fun");
	}
}

class Child04 extends Parent04 {
	int x = 20;
	void fun() {
		System.out.println("Child fun");
		
	}
	void display() {
		//Acceesing child componets
		System.out.println("Child x = " + x);
		fun();
		
		//Accessing Parent Components----using ---SUPER keyword
		System.out.println("Parentx = " + super.x);
		super.fun();
	}
	
}
