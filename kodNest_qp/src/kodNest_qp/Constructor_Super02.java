package kodNest_qp;

public class Constructor_Super02 {
	public static void main(String[] args) {
		new SmartPhone01();
		new SmartPhone01("oppo");
	}
}

class Phone01 {//extends Object
	Phone01() {//super()
		System.out.println("Phone 0 - Parameter Constructor");
	}
	
	Phone01(String s) {//super()
		System.out.println("Phone 1-parameter Constructor");
	}
}

class SmartPhone01 extends Phone01 {
	 SmartPhone01() {//super()
		 super("JAVA");
		System.out.println("Smartphone 0 - Parameter Constructor");
	}
	 
	 SmartPhone01(String s) {//super()
			System.out.println("Smartphone 1 - Parameter Constructor");
		}
}