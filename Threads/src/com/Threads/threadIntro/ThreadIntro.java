package com.Threads.threadIntro;

public class ThreadIntro {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);//Thread[#1,main,5,main]=[,T.name,t.priority,t.method]
		t.setName("Code");
		t.setPriority(3);//1 - 10 | higher to lower
		System.out.println(t);
	}

}
