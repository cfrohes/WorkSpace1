package kodNest_qp;

import java.util.Scanner;

public class FresherApp {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		Fresher f = new Fresher();
		System.out.println("Enter your ID: ");
		f.id = sc. nextInt();
		System.out.println("Enter your Name: ");
		f.name = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter your Branch: ");
		f.branch = sc.nextLine();
		System.out.println("Enter your YOP: ");
		f.yop = sc.nextInt();
		f.giveIntro();
	}

}
class Fresher {
	int id;
	String name;
	String branch;
	int yop;
	
	public void giveIntro() {
		System.out.println("my id is " + id);
		System.out.println("my name is " + name);
		System.out.println("my branch is " + branch);
		System.out.println("my yop is " + yop);
	}
}
