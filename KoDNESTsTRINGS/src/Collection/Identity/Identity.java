package Collection.Identity;

import java.util.concurrent.CopyOnWriteArrayList;

import java.util.*;

public class Identity {
	public static void main(String[] args) {
//		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
//		al.add(23);
//		al.add(45);
//		al.add(90);
//		al.add(67);
//		
//		Iterator itr = al.iterator(); 
//			while(itr.hasNext()) {
//				System.out.println(itr.next());
//				al.add(109);
//			}
//			
//			System.out.println(al);
		
//		linkedList null insertion --yes  & duplicates -- yes --> descendingIterator -- yes
//		ArrayDeque null insertion --No  & duplicates -- yes
//		PriorityQueue null insertion --No  & duplicates -- yes
//		TreeSet  null insertion --No  & duplicates -- No  -->descendingIterator -- yes
//		HashSet  null insertion --Yes  & duplicates -- No ->duplicates will be last duplicate will be displayed  for
//				ex [90, null, 100, 90] list it will displayed like  [null, 100, 90]
//		 LinkedHashSet null insertion -- Yes  & duplicates -- No ->duplicates will be first duplicate  will be displayed for
//				ex [90, null, 100, 90] list it will displayed like  [90, null, 100]
		
		
		ArrayDeque ll = new ArrayDeque();
		ll.add(90);
		//ll.add(null);
		ll.add(100);
		ll.add(90);
		System.out.println(ll);
		
		Iterator itr = ll.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
	}

}
