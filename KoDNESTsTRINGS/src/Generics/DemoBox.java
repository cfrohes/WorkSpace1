package Generics;

public class DemoBox<T> {
	T item;
	public void setItem(T item) {
		this.item = item;
	}
	
	void display() {
		System.out.println("ITEM iS " + item);
	}
}

