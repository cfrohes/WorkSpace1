package Collections;

import java.util.ArrayList;

public class AllMethodsINArrayListCollection {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(900);
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		System.out.print("al --- > " + al + " ");
		System.out.println();
		System.out.println("----------------------------------------------------------------------");
		ArrayList al2 = new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		al2.add(50);
		System.out.print("al2 --- > " + al2 + " ");
		System.out.println();
		System.out.println("----------------------------------------------------------------------");
		
		//add(index, elementToAdd)
		al2.add(2, 567);
		
		//addAll(arrayToAdd)
		al2.addAll(al);
		
		//addAll(index, collection)
		al2.addAll(2, al);
		
		
		//contains(collection)
		System.out.println(al2.contains(100));
		
		//containsAll(collection)
		System.out.println(al2.containsAll(al));
		
		//isEmpty()
		System.out.println(al.isEmpty());
		
		//removeFirst()--firstelement will be removed
		//removeLast();
		//remove(index)
		al.remove(2);
		al.removeFirst();
		al.removeLast();
		
		//removeAll()
		al2.removeAll(al);
		
		
		//set(index, changing element)
		al2.set(1,345);
		//al.clear()
		
		//lastIndexOf(element)
		System.out.println(al.lastIndexOf(100));
		
		System.out.println(al+ " ");
		
		System.out.print("al2 --- > " + al2 + " ");
	}

}
