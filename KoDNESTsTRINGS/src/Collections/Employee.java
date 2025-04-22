package Collections;

public class Employee {
	String name;
	int age;
	
public Employee(String name, int age) {
		this.age = age;
		this.name = name;
	}
//if we dont use this then we just got reference of the object not the data.......

	public String toString() {
		return "NAME: " + name + " & Age: " + age;
	}

}
