package com.ExceptionHandling.intro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
System.out.println("@CONNECTION ESTABLISHED!!");
		
		Scanner sc = new Scanner(System.in);
//		int a = 10; //for this i/p Exception in thread "main" java.lang.ArithmeticException: / by zero
//		int b = 0;
		try {
			System.out.println("ENTER TWO ELEMENT FOR DIVISION");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int questient = a / b;
		System.out.println("Division ans is " + questient);
		
		System.out.println("Enter the array Element: ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the Element & Position to insert an element");
		int element = sc.nextInt();
		int pos = sc.nextInt();
		arr[pos] = element;
		System.out.println("element at " + pos + " Positcddion is ->" + arr[pos] );
		
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("ArithmeticException occured at line no. 18 --> divide by zero ");
		}catch (NegativeArraySizeException e) {
			System.out.println("NegativeArraySizeException Occured at line no. 21 --> Give Positive input");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException Occured at line no. 24 --> Give the no. less than the array Size");
		}catch (InputMismatchException e) {
			System.out.println("InputMismatchException Occured -->Give integer +ve value");
		}catch(Exception e) {
			System.out.println("Some Issue Occured But your resourse are safe...->PLEASE TRY AGAIN!!");
		}
		System.out.println("@CONNECTION TERMINATED!!");
	}
	}

