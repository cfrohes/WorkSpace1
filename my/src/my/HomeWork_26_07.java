package my;

import java.util.Scanner;

public class HomeWork_26_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int p =sc.nextInt();
		sc.close();
		if(s.charAt(0) =='M' || s.charAt(0) =='m') {
			if(p >= 80) {
				System.out.println("Excelent");
			}else if(p >= 60) {
				System.out.println("Good");
			}else if(p >= 35) {
				System.out.println("Poor");
			}else {
				System.out.println("Fail");
			}
		}else if(s.charAt(0) =='F' || s.charAt(0) =='f') {
			if(p >= 70) {
				System.out.println("Excelent");
			}else if(p >= 50) {
				System.out.println("Good");
			}else if(p >= 35) {
				System.out.println("Okay");
			}else {
				System.out.println("Do better next time");
			}
		
	}

	}
}
