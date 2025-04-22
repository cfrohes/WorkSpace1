package kodNest_qp;

public class Abstraction05 {
	public static void main(String[] args) {
		Cricketer b = new Cricketer();
		b.batting();
		b.keeping();
	}
}
interface Batsman {
	void batting();
}
interface Keeper extends Batsman {
	void keeping();
}

class Cricketer implements Keeper {
	public void batting() {
		System.out.println("batting .");
	}
	public void keeping() {
		System.out.println("Keeping and batting");
	}
}