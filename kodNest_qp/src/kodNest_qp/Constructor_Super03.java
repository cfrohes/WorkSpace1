package kodNest_qp;

public class Constructor_Super03 {
		public static void main(String[] args) {
			new SmartPhone02();
			//new SmartPhone01("oppo");
		}
	}

	class Phone02 {//extends Object
		Phone02() {
			this("JAVA");
			System.out.println("Phone 0 - Parameter Constructor");
		}
		
		Phone02(String s) {//super()
			System.out.println("Phone 1-parameter Constructor");
		}
	}

	class SmartPhone02 extends Phone02 {
		 SmartPhone02() {
			 this("JAVA");
			System.out.println("Smartphone 0 - Parameter Constructor");
		}
		 
		 SmartPhone02(String s) {//super()
				System.out.println("Smartphone 1 - Parameter Constructor");
			}
	}