package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {
	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<Integer>();
		
		//Insertion 
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		
		System.out.println(al);
		al.add(600);
		al.remove(5);
		
		//traditional for loop
		//TO FIND THE LENGTH OF THE LIST ----->"size()"
		System.out.println();
		System.out.println("OUTPUT OF traditional for loop");
		for(int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		
		//enhanced for loop
		System.out.println("OUTPUT OF enhanced for loop");
		for(Object n : al) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println();
		
		//Using iterator
		System.out.println("OUTPUT OF ITERATOR");
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext() == true) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
	}
}
