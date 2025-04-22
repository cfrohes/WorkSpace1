package com.FileHandling.intro;
import java.io.FileReader;
import java.io.FileWriter;

public class ReaderANDWriter {
	
	public static void main(String[] args) {
			try {
				String path1 = "C:\\Users\\chand\\Downloads\\INPUTOutpuT/input.txt";
				String path2 = "C:\\Users\\chand\\Downloads\\INPUTOutpuT/output.txt";
				
				FileReader input = new FileReader(path1);
				FileWriter output = new FileWriter(path2);
				
				int x;
				while ((x = input.read()) != -1) {
					output.write(x);
				}
				output.flush();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
}
