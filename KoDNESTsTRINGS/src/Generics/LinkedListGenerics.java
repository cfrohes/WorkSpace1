package Generics;

import java.util.LinkedList;
import java.util.List;

public class LinkedListGenerics {
	public static void main(String[] args) {
		List<String> ll = new LinkedList();
//		LinkedList<String> ll = new LinkedList();
		ll.add("hello");
		ll.add("Move");
		ll.add("Tea");
		ll.addLast("Ted");
		ll.add("hey");
		ll.addFirst("Professor");
		System.out.println(ll);
	}

}
