package Algorithms;

import java.util.Scanner;

public class Queue {
	private int q[];
	private int size;
	private int r = -1;
	private int f = -1;
	
	public Queue (int size) {
		this.size = size;
		q = new int[size];
		System.out.println("QUEUE OF SIZE " + size + " CREATED");
	}
	
	public void insert(int element) {
		if(r == size - 1) {
			System.out.println("QUEUE IS FULL ELEMENT CANNOT BE INSERTED");
		}
		else {
			++r;
			q[r] = element;
			System.out.println("ELEMENT " + element + " INSERTED INTO THE QUEUE..");
		}
	}
	
	public void delete() {
		if((f == -1 && r == -1) || f == size - 1) {
			System.out.println("QUEUE IS EMPTY AND ELEMENT CANNOT BE DELETED.");
		}else {
			f++;
			System.out.println("ELEMENT DELETED IS " + q[f]);
			q[f] = 0;
		}
	}
	
	public void display()
	{
		if((f == -1 && r == -1) || f == size - 1) {
			System.out.println("QUEUE IS EMPTY AND DISPLAY NOT POSSIBLE");
			
		}else {
			for(int i = f+1; i <= r; i++) {
				System.out.println(q[i]+ " ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER QUEUE SIZE");
		int size = sc.nextInt();
		Queue queues = new Queue(size);
		while(true) {
			System.out.println("PRESS-1 TO INSERT()");
			System.out.println("PRESS-2 TO DELETE()");
			System.out.println("PRESS-3 TO DISPLAY()");
			System.out.println ("ANY OTHER NUMBER TO STOP");
			System.out.println("CHOOSE AN OPTION");
			int choice=sc.nextInt();
			switch(choice){
			
			case 1:System.out.println("ENTER ELEMENT TO INSERT");
			int element=sc.nextInt();
			queues.insert(element);
			break;
			
			case 2:queues.delete();
			break;
			
			case 3: queues.display();
			break;
			
			default:System.out.println("BYE BYE.....");
			return;
			}
	}

}
}
