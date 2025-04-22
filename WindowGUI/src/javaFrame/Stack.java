package javaFrame;

import java.util.Arrays;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            throw new IllegalStateException("Stack is full");
        }
    }

    public int pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    public String display() {
        if (top >= 0) {
            return "Current stack: " + Arrays.toString(Arrays.copyOf(stackArray, top + 1));
        } else {
            return "Stack is empty";
        }
    }
}
