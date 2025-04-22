package kodNest_qp;

interface Addition01 {
	void add(int a, int b);
}
interface Subtraction01 {
	void sub(int a, int b);
}
interface Multiplication01 {
	int mul();
}
interface Division01 {
	int div(int a, int b);
}

public class Anonymous_Class03 {
	public static void main(String[] args) {
	Addition01 add = (int a, int b) -> System.out.println("addtion = " + (a + b));
	add.add(2, 5);
	
	Subtraction01 sub = (int a, int b) -> System.out.println("sub = " + (a-b));
	sub.sub(6, 2);
	
	Multiplication01 m = () -> (2 * 3);
	System.out.println( m.mul());
	
	Division01 d = (a,b) -> (a/b);
	System.out.println(d.div(4, 2));
	
	}
}
