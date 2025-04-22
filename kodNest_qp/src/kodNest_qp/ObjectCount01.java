package kodNest_qp;

public class ObjectCount01 {
	public static void main(String[] args) {
		//Principal p1 = new Principal();
		Principal p2 = Principal.getInstance();
		Principal p3 = Principal.getInstance();
		p3.print();
		
	}

}

class Principal {
	private static Principal p ;
	
	private Principal() {
		System.out.println("Principal appointed.");
	}
	
	public static Principal getInstance() {
		if(p == null) {
			p = new Principal();
		}
		return p;
	}
	public void print() {
		System.out.println("hello");
	}
}
