package Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMAP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Create a HashMap to store employee records
        HashMap<Integer, String> hm = new HashMap<>();
        // TODO: Read employee information and add them to the HashMap
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // Consume the newline after the integer input
            String name = sc.nextLine();
            hm.put(id, name);
            System.out.println("Added: ID  " + id + " -> " + name);
        }
        // TODO: Retrieve an employee’s name using their ID
        int id = sc.nextInt();
        String empName = hm.get(id);
        if(empName != null) {
        System.out.println("Employee Name: " + empName);
        } else {
            System.out.println("Employee not found.");
        }
        // TODO: Remove an employee using their ID
        int rId = sc.nextInt();
        String rEmpName = hm.remove(rId);
        if(rEmpName != null) {
        System.out.println("Employee removed: " + rEmpName);
        } else {
            System.out.println("Employee not found.");
        }
        // TODO: Print all employee records
        System.out.println(hm);

        sc.close();
    }
}