package my;

import java.util.Scanner;

public class Main {
		    public static void orderCoffee(){
		        System.out.println("Ordered a default coffee.");
		    }
		    public static void orderCoffee(String type){
		        System.out.println("Ordered a "+type+" coffee");
		    }
		    public static String orderCookie(){
		       return "Ordered a default cookie";

		    }
		    public static String orderCookie(String type){
		        return "Ordered a "+type+" cookie.";
		    }
		    public static void main(String args[]){
		    	Scanner sc =new Scanner(System.in);
		    	System.out.println("Enter name ");
				String name=sc.next();
				System.out.println("name "+name);
		        orderCoffee();
		        orderCoffee("Espresso");
		        String cookieOrder1=orderCookie();
		        System.out.println(cookieOrder1);
		        String cookieOrder2=orderCookie("Chocolate chip");
		        System.out.println(cookieOrder2);
		    }
		
	}


