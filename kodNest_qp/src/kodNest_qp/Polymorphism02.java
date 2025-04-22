package kodNest_qp;

public class Polymorphism02 {
	public static void main(String[] args) {
		Hello_Student s1 = new Hello_Student();
		accessHello_Student(s1);
		Hello_Student s2 = new Hello_Student();
		Hello_Student s3 = new Hello_Student();
		
//		accessHello_Student(s2);
//		accessHello_Student(s3);
	}
	public static void accessHello_Student(Hello_Student s) {
		s.learn();
		s.enjoy();
		s.sleep();
		s.eat();
	}

}

class Hello_Student {
	public void learn() {
		System.out.println("Hello_Hello_Student learning tech.");
	}
	public void enjoy() {
		System.out.println("Hello_Student enjoys.");
	}
	public void sleep() {
		System.out.println("Hello_Student sleeps.");
	}
	public void eat() {
		System.out.println("Hello_Student eats food.");
	}
}

