package my;

class Stack {
	private int maxSize;
	private int[] stackArray;
	private int top;

	
Stack(int size){
	maxSize = size;
	stackArray = new int[maxSize];
	top = -1;
	
	
}
public void push(int value) {
	if(isFull()) {
		System.out.println("Stack is full");
		return;
		}stackArray[++top] = value;
}
public int pop() {
	if(isEmpty()) {
		System.out.println("Stack is Empty");
		return -1;
	}
	return stackArray[top--];
}
public int peek() {
	if (isEmpty()) {
        System.out.println("Stack is empty");
        return -1;
    }
    return stackArray[top];
}
public boolean isEmpty() {
	return (top == -1);
}
public boolean isFull() {
	return (top == maxSize-1);
}
}
public class Stack_implimkentation_throughArray {
	public static void main(String[] args) {
		Stack s = new Stack(3);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		// Peeking the top element (should be 30)
        System.out.println("Peek: " + s.peek()); // Output: 30

        // Popping elements from the stack
        System.out.println("Pop: " + s.pop()); // Output: 30
        System.out.println("Pop: " + s.pop()); // Output: 20
        System.out.println("Pop: " + s.pop()); // Output: 10

        // Try to pop from an empty stack (should show "Stack is empty")
        System.out.println("Pop: " + s.pop());
	}
	
}
