package kodNest_qp;

interface Teacher {
	void teach();
}
abstract class Electronics {
	public abstract void charge();
}

//interface Robot {
//	void run();
//}
public class Anonymous_Class01 {
	public static void main(String[] args) {
	Teacher t = new Teacher() {
		public void teach() {
			System.out.println("teaching...................");
		}
	};
	t.teach();
	
	Electronics e = new Electronics() {
		
		@Override
		public void charge() {
			System.out.println("Charging...................");
			
		}
	};
	
	e.charge();
	
	
	
	}
}
