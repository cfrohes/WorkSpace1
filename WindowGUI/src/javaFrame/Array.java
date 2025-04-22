package javaFrame;

public class Array {
    private int[] arr; // Array to hold elements
    private int size; // Maximum size of the array
    private int currentIndex; // Current index for inserting elements

    // Constructor to initialize the array with a fixed size
    public Array(int size) {
        this.size = size;
        arr = new int[size];
        currentIndex = -1; // Initialize currentIndex to -1 (empty array state)
        System.out.println("ARRAY OF SIZE " + size + " CREATED");
    }

    // Method to insert an element into the array
    public void insert(int element) {
        if (currentIndex == size - 1) {
            System.out.println("ARRAY IS FULL, ELEMENT CANNOT BE INSERTED");
        } else {
            arr[++currentIndex] = element; // Increment index and insert element
            System.out.println("ELEMENT " + element + " INSERTED INTO THE ARRAY");
        }
    }

    // Method to delete an element from the array
    public void delete() {
        if (currentIndex == -1) {
            System.out.println("ARRAY IS EMPTY, ELEMENT CANNOT BE DELETED");
        } else {
            System.out.println("ELEMENT DELETED IS " + arr[currentIndex]); // Show the deleted element
            arr[currentIndex] = 0; // Optionally reset the last value to zero
            currentIndex--; // Decrement index to remove the last element
        }
    }

    // Method to display elements of the array
    public String display() {
        StringBuilder sb = new StringBuilder();
        if (currentIndex == -1) {
            sb.append("ARRAY IS EMPTY"); // Return message if array is empty
        } else {
            for (int i = 0; i <= currentIndex; i++) {
                sb.append(arr[i]).append(" "); // Append each element to the StringBuilder
            }
        }
        return sb.toString().trim(); // Trim the final string to remove extra space
    }
}
