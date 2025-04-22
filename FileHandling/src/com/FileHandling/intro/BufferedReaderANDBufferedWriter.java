package com.FileHandling.intro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderANDBufferedWriter {
	public static void main(String[] args) {
		try {
			String path1 = "C:\\Users\\chand\\Downloads\\INPUTOutpuT/input.txt";
			String path2 = "C:\\Users\\chand\\Downloads\\INPUTOutpuT/output.txt";
			
			FileReader input = new FileReader(path1);
			FileWriter output = new FileWriter(path2);
			BufferedReader br = new BufferedReader(input);
			BufferedWriter bw = new BufferedWriter(output);
			
			
			String x;
			while ((x = br.readLine()) != null) {
				bw.write(x);
				bw.newLine();
			}
			bw.flush();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
