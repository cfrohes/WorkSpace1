package kodNest_qp;

public class Polymorphic {
		public static void main(String[] args) {
			STudet s1 = new STudet();
			STudet s2 = new STudet();
			STudet s3 = new STudet();
			accessSTudet(s1);
			accessSTudet(s2);
			accessSTudet(s3);
		}
		public static void accessSTudet(STudet s) {
			s.learn();
			s.enjoy();
			s.sleep();
			s.eat();
		}

	

}
class STudet {
	public void learn() {
		System.out.println("STudet learning tech.");
	}
	public void enjoy() {
		System.out.println("STudet enjoys.");
	}
	public void sleep() {
		System.out.println("STudet sleeps.");
	}
	public void eat() {
		System.out.println("STudet eats food.");
	}
}
