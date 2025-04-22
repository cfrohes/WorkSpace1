package com.FileHandling.intro;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo {
	public static void main(String[] args) {
		try {
			String path1 = "C:\\Users\\chand\\Downloads\\INPUTOutpuT/input.txt";
			String path2 = "C:\\Users\\chand\\Downloads\\INPUTOutpuT/output.txt";
			
			FileInputStream input = new FileInputStream(path1);
			FileOutputStream output = new FileOutputStream(path2);
			
			int x;
			while ((x = input.read()) != -1) {
				output.write(x);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
