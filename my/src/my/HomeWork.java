package my;

import java.util.Scanner;

public class HomeWork {
//	public static double circle(double r) {
//		return (2*3.14*r);
//	}

	public static void main(String[] args) {
		//1)Enter 3 numbers from the user & make a function to print their average.-------------------------------------------------------------------------------------------------
//		Scanner sc= new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int c=sc.nextInt();
//		int average=(a+b+c)/3;
//		System.out.println(average+" average");
//---------------------------------------------------------------------------------------------------------------------------------

		//2)Write a function to print the sum of all odd numbers from 1 to n.==========================================================-------------------------
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int sum=0;
//		for(int i=1;i<=n;i++) {
//			if(i%2 !=0) {
//				sum+=i;
//			}
//		}System.out.println(sum);
//	-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//3)Write a function which takes in 2 numbers and returns the greater of those two.========================================================================================
//		Scanner sc= new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		if(a>b) {
//			System.out.println (a);
//		}else {
//			System.out.println (b);
//		}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//4)Write a function that takes in the radius as input and returns the circumference of a circle.
//		Scanner sc= new Scanner(System.in);
//		double r=sc.nextDouble();
//		System.out.println("Circumference of circle is : "+circle(r));
//===========================================================================================================================================================================================
		//5)Write an infinite loop using do while condition.
//		do {
//			System.out.println("1");
//			Scanner sc= new Scanner(System.in);
//			char choice=sc.next().charAt(0);
//			if(choice!='y'&& choice !='y') {
//				break;
//			}
//		}while(true);
		//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.==========================================================
//		Scanner sc= new Scanner(System.in);
//		int x=sc.nextInt();
//		int n=sc.nextInt();
//		System.out.println((int)Math.pow(x, n));
//		
		//6)Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.---------------==================
//		Scanner sc= new Scanner(System.in);
//		int positiveCount=0;
//		int negativeCount=0;
//		int zeros=0;
//		String continueInput;
//		do {
//			System.out.println("Enter the number which you want");
//			int n=sc.nextInt();
//			if(n>0) {
//				positiveCount++;
//				
//                  
//			}else if(n<0) {
//				negativeCount++;
//			}else {
//				zeros++;
//			}
//			System.out.println("want to continue");
//			continueInput = sc.next();
//
//        } while (continueInput.equalsIgnoreCase("yes"));
//
//        System.out.println("Count of positive numbers: " + positiveCount);
//        System.out.println("Count of negative numbers: " + negativeCount);
//        System.out.println("Count of zeros: " + zeros);
//
//        sc.close();
//			
		//9)Write a function that calculates the Greatest Common Divisor of 2 numbers. '''''''''''''''''''''''''''''''';;;;;;;;;;;;;;;;;;;;;;;;;;;;;'''''''''''''''''''''';;;;;;;;;;;llllllllllllllllll'
//		Scanner sc= new Scanner(System.in);
//		int x=sc.nextInt();
//		int n=sc.nextInt();
//		int gcd=findgcd(x,n);
//		System.out.println(gcd);
//		}
//		public static int findgcd(int a,int b) {
//			
//			while(b!=0) {
//				int temp=b;
//			b=a%b;
//			a=temp;
//			}return a;
//	
		//10)Write a program to print Fibonacci series of n terms where n is input by user :
//		0 1 1 2 3 5 8 13 21 ..... 
//		In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.===========================================================================================================================

		int n=6;
		int n1=0;
		int n2=1;
		for(int i=1;i<=n;i++) {
			System.out.print(n1+" ");
			int nextterm=n1+n2;
			n1=n2;
			n2=nextterm;
		}
		
		
		
		
	}
	
		
		
	}


