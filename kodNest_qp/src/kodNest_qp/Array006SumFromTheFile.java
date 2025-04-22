package kodNest_qp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array006SumFromTheFile {
	public static void main(String[] args) {
		int sum = 0;
	String filepath = "C://Documents//Test//test.java.txt";
	
	try {
		File file = new File(filepath);
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			if(sc.hasNextInt()) {
				sum += sc.nextInt();
			} else {
				sc.next();
			}
		}
		
		System.out.println("The sum of the numbers PRESENT in the test.java files are: " + sum);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("file not found");
		e.printStackTrace();
	}

}
}
