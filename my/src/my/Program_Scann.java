package my;

import java.util.Scanner;

public class Program_Scann {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter user_id ");
		byte user_id=sc.nextByte();
		System.out.println("Enter age ");
		short age=sc.nextShort();
		System.out.println("Enter phone_No ");
		int phone_No=sc.nextInt();
		System.out.println(" Enter national_id ");
		long national_id=sc.nextLong();
		System.out.println("Enter height ");
		float height=sc.nextFloat();
		System.out.println("Enter weight ");
		double weight=sc.nextDouble();
		System.out.println(" Enter is_married  true/ false");
		boolean is_married=sc.nextBoolean();
		System.out.println("Enter name ");
		String name =sc.next();
		System.out.println("Enter  full name ");
		String full_name =sc.nextLine();
		System.out.println("Enter char grade ");
		char grade=sc.next().charAt(0);
		System.out.println("full_name : "+full_name);
		System.out.println("user_id : "+user_id);
		System.out.println("age "+age);
		System.out.println("phone_No : "+phone_No);
		System.out.println("national_id : "+national_id);
		System.out.println("grade : "+ grade);
		System.out.println("weight : "+weight);
		System.out.println("is_married : "+is_married);
		System.out.println("name : "+name);
	}

}
