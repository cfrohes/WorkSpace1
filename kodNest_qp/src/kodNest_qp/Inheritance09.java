package kodNest_qp;

public class Inheritance09 {
	public static void main(String[] args) {
		Child02 b = new Child02();
		b.sing();
		b.paint();
	}

}

interface Singer {
	public void sing();
}
interface Painter  {
	void paint();
}
class Child02 implements Painter,Singer {
	public void sing() {
		System.out.println("Singing");
	}
	
	public void paint() {
			System.out.println("Painting");
		}
	
}

