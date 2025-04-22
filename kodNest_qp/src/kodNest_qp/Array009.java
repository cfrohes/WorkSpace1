package kodNest_qp;

import java.util.Scanner;

public class Array009 {
	public static void main(String[] args) {
		Array008 [] arr = new Array008[4];
		
//		Array008 e1 = new Array008();
//		e1.name = "Omkar";
//		e1.ssn = 100;
//		e1.gender = "Male";
//		e1.salary = 20000;
//		
//		arr[0] = e1;
//		
//		Array008 e2 = new Array008();
//		e2.name = "Hari";
//		e2.ssn = 200;
//		e2.gender = "Male";
//		e2.salary = 30000;
//		
//		arr[1] = e2;
//		
//		
//		Array008 e3 = new Array008();
//		e3.name = "Prasad";
//		e3.ssn = 600;
//		e3.gender = "Male";
//		e3.salary = 50000;
//		
//		arr[2] = e3;
//		
//		
//		Array008 e4 = new Array008();
//		e4.name = "Laxman";
//		e4.ssn = 500;
//		e4.gender = "Male";
//		e4.salary = 60000;
//		
//		arr[3] = e4;
		
		//Without using the constructor
		
		
		
		
		
		
		
		
		
//		USING CONSTRUCTOR
		
		Scanner sc  = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Array008(sc.next(), sc.nextInt(), sc.next(), sc.nextDouble());
		}
		
//		
//		arr[0] = new Array008("Omkar", 100, "Male", 20000);
//		arr[1]  = new Array008("Prasad", 200, "Male", 30000);
//		arr[2] = new Array008("Prabhas", 300, "Male", 40000);
//		arr[3] = new Array008("Laxman", 400, "Male", 50000);
		
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name + " " + arr[i].ssn + " " + arr[i].gender + " " + arr[i].salary );
			if(i <= arr.length-1) {
				System.out.print("||");
			}
			System.out.println();
		}
		System.out.println("]");
	}
	
}
