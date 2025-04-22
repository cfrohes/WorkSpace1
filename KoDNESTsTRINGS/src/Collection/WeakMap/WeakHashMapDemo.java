package Collection.WeakMap;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) {
		Student s1 = new Student(23, "Harish", 18);
		Student s2 = new Student(27, "Mahesh", 19);
		Keys key1 = new Keys(100);
		Keys key2 = new Keys(200);
		WeakHashMap hm = new WeakHashMap();
		hm.put(key1, s1);
		hm.put(key2, s2);
		System.out.println(hm);
		key1 = null;
		key2 = null;
		System.gc();
		for(int i = 0; i <= 500; i++) {
			//System.out.println("");
			if(i == 500) {
				System.out.println();
				System.out.println("DONE...");
			}
		}
		System.out.println();
		System.out.println(hm);
	}

}
