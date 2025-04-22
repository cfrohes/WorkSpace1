package kodNest_qp;

//interface Greeter01 {
//	void greet();
//}
//public class Anonymous_Class02 {
//	public static void main(String[] args) {
//		//Using LAMDA EXPRESSION  (parameter)-> {method}
//		Greeter01 g = () ->System.out.println("hello");
//		g.greet();
//		
//		//ananymous class
//		Greeter01 ga = new Greeter01() {
//			public void greet() {
//				System.out.println("hi");
//			}
//		};
//		ga.greet();
//	}
//
//}

//with parameter inside the method
//this two methods are for only functional interface means -> the interface or abstract class have only one method

interface Greeter01 {
	String greet(String name);
}
public class Anonymous_Class02 {
	public static void main(String[] args) {
		//Using LAMDA EXPRESSION  (parameter)-> {method}
		Greeter01 g = (name) ->  "hello " + name;
		System.out.println(g.greet("chandan"));
		
		//ananymous class
		Greeter01 ga = new Greeter01() {
			public String greet(String name) {
				return("hi " + name);
			}
		};
		System.out.println(ga.greet("chandan"));
	}

}