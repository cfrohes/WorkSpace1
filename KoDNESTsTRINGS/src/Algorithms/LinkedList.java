package Algorithms;

import java.util.Scanner;

public class LinkedList {
		class Node {
			Node pl;
			int data;
			Node nl;
		}
		Node first = null;
		
		
		void inserFirst(int elm) {
		    Node nn = new Node();
		    nn.pl = null;       // The previous node of the new node is null because it is the first node
		    nn.data = elm;
		    nn.nl = first;      // The next node of the new node should point to the current first node
		    
		    if (first != null) {
		        first.pl = nn;  // If the list is not empty, update the previous pointer of the current first node
		    }
		    
		    first = nn;         // Update the first node to the new node
		}
	
	void insertLast(int elm) {
		Node nn = new Node();
		nn.pl = null;
		nn.data = elm;
		nn.nl = null;
		
		if(first == null) {
			first = nn;
			
		}else if(first.nl == null) {
			first.nl = nn;
			nn.pl = first;
			
		}
		else {
			Node temp = first;
			while(temp.nl != null) {
				temp = temp.nl;
			}
			temp.nl = nn;
			nn.pl = temp;
		}
	}
	
	void deleteFirst() {
		if(first == null) {
			System.out.println("DELETE NOT POSSIBLE");
		}else if(first.nl == null) {
			System.out.println("ELEMENT DELETED IS " + first.data);
			first = null;
		}else {
			System.out.println("ELEMENT DELETED IS " + first.data);
			first = first.nl;
			first.pl = null;
		}
	}
	
	void deleteLast() {
		if(first == null) {
			System.out.println("DELETE NOT POSSIBLE");
		}else if(first.nl == null) {
			System.out.println("ELEMENT DELETED IS " + first.data);
			first = null;
		}else {
			Node temp = first;
			while(temp.nl.nl != null) {
				temp = temp.nl;
			}
			temp.nl = null;
		}
	}
	
	void displayForword() {
		if(first == null) {
			System.out.println("DISPLAY NOT POSSIBLE");
		}else if(first.nl == null) {
			System.out.println(first.data);
		}else {
			Node temp = first;
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.nl;
			}
		}
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        
        // Sample operations to test the linked list
        boolean exit = false;
        while (!exit) {
            System.out.println("Choose an operation:");
            System.out.println("1. Insert First");
            System.out.println("2. Insert Last");
            System.out.println("3. Delete First");
            System.out.println("4. Delete Last");
            System.out.println("5. Display Forward");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to insert at the beginning:");
                    int firstElem = sc.nextInt();
                    list.inserFirst(firstElem);
                    break;
                case 2:
                    System.out.println("Enter the element to insert at the end:");
                    int lastElem = sc.nextInt();
                    list.insertLast(lastElem);
                    break;
                case 3:
                    list.deleteFirst();
                    break;
                case 4:
                    list.deleteLast();
                    break;
                case 5:
                    list.displayForword();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}
