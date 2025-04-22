package Collections;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Employee("Harish", 67));
		al.add(new Employee("Mahesh", 57));
		al.add(new Employee("Suresh", 47));
		System.out.println(al);
	}
}
