package Algorithms;

import java.util.Scanner;

public class EmployeeLinearSearchAlgo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size for the employee array: ");
		Employee emparr[] = new Employee[sc.nextInt()];
		for(int i = 0; i < emparr.length; i++) {
			System.out.println("Enter the Employee Name and Age of Employee " +(i+1));
			String name = sc.next();
			int age = sc.nextInt();
			emparr[i] = new Employee(name, age);
			
		}
		System.out.println("Enter the name to be searched:");
		String name = sc.next();
		
		for(int i = 0; i < emparr.length; i++) {
			if(name.equalsIgnoreCase(emparr[i].name)) {
				System.out.println("The name found at index " + i);
				return;
			}
		}
		System.out.println("name doesn't found");
		
	}
}
