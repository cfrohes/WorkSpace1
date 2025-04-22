package com.FileHandling.FileClass;

import java.io.File;

public class Demo {
	public static void main(String[] args) {
		try {
		String path = "C:\\Users\\chand\\Downloads\\INPUTOutpuT/input.txt";
		File file = new File(path);
		
		System.out.println("Path: " + file.getPath());
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("conanical Path: " + file.getCanonicalPath());
		System.out.println( "Does File Has Read Permission ?  "+ file.canRead());
		System.out.println( "Does File Has Write Permission ?  "+ file.canWrite());
		System.out.println( "Does File Has Execute Permission ?  "+ file.canExecute());
		System.out.println( "Does File Exist ?  "+ file.exists());
		System.out.println("IsFile?  "+file.isFile());
		System.out.println("isDirectory?  " +file.isDirectory());
		
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	}

}
