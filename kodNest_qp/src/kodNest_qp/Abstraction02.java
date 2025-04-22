package kodNest_qp;

import java.util.Scanner;

public class Abstraction02 {
	public static void main(String[] args) {
		MyCalculator m = new MyCalculator();
		accessCalculator(m);
		
	}
	public static void accessCalculator(Caluculator01 n) {
		n.add();
		n.sub();
		n.mul();
		n.div();
	}
	

}
abstract class Caluculator01 {
	public abstract void add();
	public abstract void sub();
	public abstract void mul();
	public abstract void div();
	
}

class MyCalculator extends Caluculator01 {
	Scanner sc = new Scanner(System.in);
	//System.out.println("enter the value of a: ");
	int a = sc.nextInt();
	//System.out.println("enter the value of b: ");
	int b = sc.nextInt();
	
	public void add() {
		System.out.println("addition : " + (a+b));
	}
	
	public void sub() {
		System.out.println("substraction : " + (a-b));
	}
	
	public void mul() {
		System.out.println("multiplication : " + (a*b));
	}
	
	public void div() {
		System.out.println("division : " + (a/b));
	}

	
}