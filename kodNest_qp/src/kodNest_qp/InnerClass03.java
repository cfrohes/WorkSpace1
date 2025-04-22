package kodNest_qp;

//Using static
public class InnerClass03 {
	public static void main(String[] args) {
		Outer01.Inner01 inObj = new Outer01.Inner01();
		inObj.fun();
		Outer01.Inner01.fun();	
	}
}

class Outer01 {
	static int x = 100;
	int y = 190;
	
	public static void fun1() {
		System.out.println("Outer static method.");
	}
	
	public void fun2() {
		System.out.println("Outer Non - static method.");
	}
	
	static class Inner01 {
		public static void fun() {
			//accessing static componets directly
			System.out.println("Outer static x : " + x);
			fun1();
			
			//accessing non - static  components(through Object)
			Outer01 obj = new Outer01();
			System.out.println("Outer Non - static y : " + obj.y);
			obj.fun2();
		}
	}
}


