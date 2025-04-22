package KodNEST;

public class OOPs1 {

	public static void main(String[] args) {
		Intern i = new Intern();
		i.name = "Deep";
		i.natives = "BTM";
		i.age = 44;
		System.out.println("name is " + i.name);
		System.out.println("native is " + i.natives);
		System.out.println("age is " + i.age);
		
		i.study();
		i.giveInterview();
		

	}
	
}
class Intern {
	String name;
	String natives;
	int age;
	
	void study() {
		System.out.println("Study JAVA.");
	}
	void giveInterview() {
		System.out.println("Give Interview.");
	}
}