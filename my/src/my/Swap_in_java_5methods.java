package my;

import java.util.Scanner;

public class Swap_in_java_5methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		//---------------------------------------------------------------------------------------1st method
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
		//-------------------------------------------------------------------------------------2nd method
//		a=a+b;
//		b=a-b;
//		a=a-b;
		//-----------------------------------------------------------------------------------3rd method
//		a=a*b;
//		b=a/b;
//		a=a/b;
		//-------------------------------------------------------------------------------4rth method
//		a=a^b;
//		b=a^b;
//		a=a^b;
		//----------------------------------------------------------------------------5th method
//		b=a+b-(a=b);
//		System.out.println("a value is "+a);
//		System.out.println("b value is "+b);
String[] strings = {"hari", "mari"};
        
        // Print initial strings
        System.out.printf("Before Swap: strings[0] = %s, strings[1] = %s%n", strings[0], strings[1]);
        
        // Swap the strings
        String temp = strings[0];
        strings[0] = strings[1];
        strings[1] = temp;
        
        // Print swapped strings
        System.out.printf("After Swap: strings[0] = %s, strings[1] = %s%n", strings[0], strings[1]);
        
	}

}
