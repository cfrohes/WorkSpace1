package Algorithms;
import java.util.Scanner;
public class Stack {
	private int s[];
	private int size;
	private int top = -1;
	public Stack(int size) {
		if(size > 0) {
			this.size = size;
			s = new int[size];
			System.out.println("STACK OF SIZE " + size + " CREATED");
		}else {
			System.out.println("GIVE VALID SIZE FOR STACK..");
		
		}
	}
	
	public void push(int element) {
		if(top < size -1) {
			top++;
			s[top] = element;
			System.out.println("ELEMENT " + element + " IS PUSHED ON TO THE STACK");
		}
		else {
			System.out.println("PUSH NOT POSSIBLE AS STACK IS FULL.");
		}
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("POP NOT POSSIBLE AS STACK IS EMPTY..");
		}
		else {
			System.out.println("ELEMENT DELETED IS " +s[top]);
			s[top] = 0;
			top--;
		}
	}
	
	public void display() {
		if(top == -1) {
			System.out.println("DISPLAY NOT POSSIBLE AS STACK IS EMPTY");
		}
		else {
			for(int i = top; i >= 0; i--) {
				System.out.println(s[i]);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Stack Size");
		int size=scan.nextInt();
		Stack stacks=new Stack(size);
		while(true) {
		System.out.println("PRESS-1 TO PUSH()");
		System.out.println("PRESS-2 TO POP()");
		System.out.println("PRESS-3 TO DISPLAY()");
		System.out.println ("ANY OTHER NUMBER TO STOP");
		System.out.println("CHOOSE AN OPTION");
		int choice=scan.nextInt();
		switch(choice){
		
		case 1:System.out.println("ENTER ELEMENT TO PUSH");
		int element=scan.nextInt();
		stacks.push(element);
		break;
		
		case 2:stacks.pop();
		break;
		
		case 3: stacks.display();
		break;
		
		default:System.out.println("BYE BYE.....");
		return;
		}
}
	}
	}
