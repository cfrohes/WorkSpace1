package javaFrame;

public class Queue {
    private int[] q;
    private int size;
    private int r = -1;
    private int f = -1;

    public Queue(int size) {
        this.size = size;
        q = new int[size];
    }

    public void insert(int element) {
        if (r == size - 1) {
            System.out.println("QUEUE IS FULL ELEMENT CANNOT BE INSERTED");
        } else {
            ++r;
            q[r] = element;
            System.out.println("ELEMENT " + element + " INSERTED INTO THE QUEUE..");
        }
    }

    public void delete() {
        if ((f == -1 && r == -1) || f == size - 1) {
            System.out.println("QUEUE IS EMPTY AND ELEMENT CANNOT BE DELETED.");
        } else {
            f++;
            System.out.println("ELEMENT DELETED IS " + q[f]);
            q[f] = 0;
        }
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        if ((f == -1 && r == -1) || f == size - 1) {
            sb.append("QUEUE IS EMPTY AND DISPLAY NOT POSSIBLE");
        } else {
            for (int i = f + 1; i <= r; i++) {
                sb.append(q[i]).append(" ");
            }
        }
        return sb.toString();
    }
}
