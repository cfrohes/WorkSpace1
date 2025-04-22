package Collections;

import java.util.LinkedList;

public class AllMethodsINLinkedListCollection {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(11);
		ll.add(22);
		ll.add(33);
		ll.add(44);
		ll.add(55);
		System.out.println(ll.contains(33));
		LinkedList ll2 = new LinkedList();
		ll2.add(111);
		ll2.add(222);
		ll2.add(333);
		ll2.addAll(ll2);
		ll2.add(55);
		//ll2.retainAll(ll) --take the comman element and store it in ll2
		ll2.retainAll(ll);
		System.out.println(ll2);
		ll2.add(111);
		ll2.add(222);
		ll2.add(333);
		ll2.addAll(ll2);
		ll2.add(55);
		//ll.addAll(index, collection c);
		System.out.println("ll -----  >  " + ll);
		//peek() ---> displays top
		System.out.println(ll.peek());
		//peekFirst
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.poll());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		ll.push(108);
		ll.push(208);
		ll.remove();
		ll.removeAll(ll2);
		ll.removeFirst();
		ll.removeLast();
	
		
		ll.pop();
		System.out.println("ll -----  >  " + ll);
	}

}
