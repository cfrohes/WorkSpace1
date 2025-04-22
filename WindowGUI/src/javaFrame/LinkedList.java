package javaFrame;

public class LinkedList {
    class Node {
        Node pl; // previous link
        int data;
        Node nl; // next link
    }

    Node first = null;
	private int size;
	private int currentSize;

    public LinkedList(int size) {
        this.size = size; // Set the maximum size
        this.currentSize = 0; // Initialize current size
        System.out.println("Linked List of maximum size " + size + " created.");
    }

	// Insert at the beginning
    public void insertFirst(int elm) {
        Node nn = new Node();
        nn.pl = null; // The previous node of the new node is null because it is the first node
        nn.data = elm;
        nn.nl = first; // The next node of the new node should point to the current first node

        if (first != null) {
            first.pl = nn; // If the list is not empty, update the previous pointer of the current first node
        }

        first = nn; // Update the first node to the new node
    }

    // Insert at the end
    public void insertLast(int elm) {
        Node nn = new Node();
        nn.pl = null;
        nn.data = elm;
        nn.nl = null;

        if (first == null) {
            first = nn;
        } else if (first.nl == null) {
            first.nl = nn;
            nn.pl = first;
        } else {
            Node temp = first;
            while (temp.nl != null) {
                temp = temp.nl;
            }
            temp.nl = nn;
            nn.pl = temp;
        }
    }

    // Delete from the beginning
    public void deleteFirst() {
        if (first == null) {
            System.out.println("DELETE NOT POSSIBLE");
        } else if (first.nl == null) {
            System.out.println("ELEMENT DELETED IS " + first.data);
            first = null;
        } else {
            System.out.println("ELEMENT DELETED IS " + first.data);
            first = first.nl;
            first.pl = null;
        }
    }

    // Delete from the end
    public void deleteLast() {
        if (first == null) {
            System.out.println("DELETE NOT POSSIBLE");
        } else if (first.nl == null) {
            System.out.println("ELEMENT DELETED IS " + first.data);
            first = null;
        } else {
            Node temp = first;
            while (temp.nl.nl != null) {
                temp = temp.nl;
            }
            temp.nl = null;
        }
    }

    // Display elements in forward direction
    public String displayForward() {
        StringBuilder sb = new StringBuilder();
        if (first == null) {
            sb.append("DISPLAY NOT POSSIBLE");
        } else {
            Node temp = first;
            while (temp != null) {
                sb.append(temp.data).append(" ");
                temp = temp.nl;
            }
        }
        return sb.toString();
    }
}
