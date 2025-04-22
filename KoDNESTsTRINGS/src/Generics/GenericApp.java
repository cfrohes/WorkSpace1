package Generics;

import Algorithms.Employee;

public class GenericApp {
	public static void main(String[] args) {
		DemoBox<String> dd = new DemoBox<String>();
		dd.setItem("Hello");
		dd.display();
		
		
		DemoBox<Integer> dd1 = new DemoBox<Integer>();
		dd1.setItem(24);
		dd1.display();
		
		DemoBox<Employee> emp = new DemoBox<Employee>();
		emp.setItem(new Employee("Arjun", 24));
		emp.display();
	}
	
	
}
