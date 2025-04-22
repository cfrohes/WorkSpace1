package com.ExceptionHandling.intro;
import java.util.*;

public class RunTimeError {
	public static void main(String[] args) {
		int x = 10;
		display(x);
		ArrayList<int[]> list = new ArrayList<>();
        while (true) {
            list.add(new int[1000000]); // Causes OutOfMemoryError
        }
    
		
		 
	}

	public static void display(int a) {
		try {
			a++;
			System.out.println(a);
			display(a);
		
		}catch (Error e){
			System.out.println("STACK IS OVERFLOW...");
		}
	}
}
