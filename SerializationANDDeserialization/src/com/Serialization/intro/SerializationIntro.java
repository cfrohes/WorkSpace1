package com.Serialization.intro;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializationIntro {
	public static void main(String[] args) {
		try {
			String serialpath = "C:\\Users\\chand\\Downloads\\INPUTOutpuT/text.txt";
			FileInputStream fis = new FileInputStream(serialpath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee ref = (Employee)ois.readObject();
			System.out.println("TADAA.....OBJECT CONSTRUCTED .....DETAILS ARE.....");
			System.out.println(ref.getId() + "  " + ref.getName());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
