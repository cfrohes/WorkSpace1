package javaFrame;

public class CircularQueue {
    private int[] queue;
    private int size, front, rear;

    public CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
        System.out.println("CIRCULAR QUEUE OF SIZE " + size + " CREATED");
    }

    // Insert an element into the circular queue
    public void insert(int element) {
        if ((rear + 1) % size == front) {
            System.out.println("QUEUE IS FULL, ELEMENT CANNOT BE INSERTED");
        } else {
            if (front == -1) front = 0; // Update front when inserting the first element
            rear = (rear + 1) % size;
            queue[rear] = element;
            System.out.println("ELEMENT " + element + " INSERTED INTO THE QUEUE");
        }
    }

    // Delete an element from the circular queue
    public void delete() {
        if (front == -1) {
            System.out.println("QUEUE IS EMPTY, ELEMENT CANNOT BE DELETED");
        } else {
            System.out.println("ELEMENT DELETED IS " + queue[front]);
            if (front == rear) { // Queue is empty after deletion
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
        }
    }

    // Display the elements of the circular queue
    public String display() {
        StringBuilder sb = new StringBuilder();
        if (front == -1) {
            sb.append("QUEUE IS EMPTY");
        } else {
            int i = front;
            while (true) {
                sb.append(queue[i]).append(" ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
        }
        return sb.toString();
    }
}
