package com.Annotation.Intro;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("serial")
public class Demo  implements Serializable{
	void hellobrumh() {
		System.out.println("Hello...");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a;
		System.out.println("Hello User...");
		
		
		@SuppressWarnings("rawtypes")
		List arr = new ArrayList();
		
	}
}


@SuppressWarnings("serial")
class Demo1 extends Demo {
	@Override
	void hellobrumh() {
		System.out.println("WelCome...");
	}
	

}
