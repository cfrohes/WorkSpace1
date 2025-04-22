package my;

class Parent{
	String name;
	int age;
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
		
	}
	//NON PARAMETERIZED CONSTRUCTOR---------------------------------------------
//	Parent(){
//		System.out.println("hey i am the one");
//	}
	// PARAMETERIZED CONSTRUCTOR---------------------------------------
//	Parent(String name,int age){
//		this.age = age;
//		this.name = name;
//	}
	Parent(){
		
	}
	Parent(Parent h2) {
		this.age = h2.age;
		this.name = h2.name;
	}
	
}

public class OOPS_Constructors {

	public static void main(String[] args) {
		//NON PARAMETERIZED CONSTRUCTOR---------------------------------------
//		Parent h1 = new Parent();
//		h1.name = "Chandan";
//		h1.age = 24;
//		h1.printInfo();
		//PARAMETERIZED CONSTRUCTOR---------------------------------------
//		Parent h1 = new Parent("Hello",24);
//		h1.printInfo();
		
		Parent h1 = new Parent();
		h1.name = "Chandan";
		h1.age = 24;
		Parent h2 = new Parent(h1);
		h2.printInfo();
		

	}

}

