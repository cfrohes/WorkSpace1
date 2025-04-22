package my;

import java.util.Scanner;

public class Hello {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int day = scanner.nextInt();
	        // write your code here
	        if (day == 1 && day == 2 && day == 3 && day == 4 && day == 5 && day == 6) {
	            System.out.println("Weekday");
	        } else if(day == 7){
	            System.out.println("Weekend");
	        }
	    }
	}


