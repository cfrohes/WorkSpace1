package javaFrame;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class ArrayFrame {

    private JFrame frame;
    private JTextField textField; // For inserting elements
    private JTextField textFieldSize; // For setting the size of the array
    private JTextArea textArea; // To display messages
    private Array array; // The Array object
    private boolean isArrayInitialized = false; // Track if the array has been initialized

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ArrayFrame window = new ArrayFrame();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ArrayFrame() {
        initialize(); // Initialize GUI components
        // No need to initialize array here
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblArrayOperations = new JLabel("Array Operations");
        lblArrayOperations.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblArrayOperations.setForeground(new Color(255, 0, 0));
        lblArrayOperations.setBounds(159, 10, 150, 20);
        frame.getContentPane().add(lblArrayOperations);

        textField = new JTextField();
        textField.setBounds(61, 78, 233, 26);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textFieldSize = new JTextField(); // Initialize textFieldSize for size input
        textFieldSize.setBounds(61, 41, 105, 26); // Position it at the top for size input
        frame.getContentPane().add(textFieldSize);
        
        textArea = new JTextArea();
        textArea.setBounds(20, 160, 400, 100);
        frame.getContentPane().add(textArea);

        // Insert Button
        JButton btnInsert = new JButton("Insert");
        btnInsert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isArrayInitialized) {
                    try {
                        int element = Integer.parseInt(textField.getText());
                        array.insert(element);
                        textArea.setText("Element " + element + " inserted into the array.");
                        textField.setText("");
                    } catch (NumberFormatException ex) {
                        textArea.setText("Invalid input. Please enter a number.");
                    }
                } else {
                    textArea.setText("Please set the array size first.");
                }
            }
        });
        btnInsert.setBounds(21, 114, 120, 29);
        frame.getContentPane().add(btnInsert);

        // Delete Button
        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isArrayInitialized) {
                    array.delete();
                    textArea.setText("Element deleted from the array.");
                } else {
                    textArea.setText("Please set the array size first.");
                }
            }
        });
        btnDelete.setBounds(159, 114, 120, 29);
        frame.getContentPane().add(btnDelete);

        // Display Button
        JButton btnDisplay = new JButton("Display");
        btnDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isArrayInitialized) {
                    String elements = array.display();
                    textArea.setText(elements.length() > 0 ? elements : "Array is empty.");
                } else {
                    textArea.setText("Please set the array size first.");
                }
            }
        });
        btnDisplay.setBounds(300, 114, 120, 29);
        frame.getContentPane().add(btnDisplay);
        
        // Set Size Button
        JButton btnSetSize = new JButton("Set Size");
        btnSetSize.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int size = Integer.parseInt(textFieldSize.getText());
                    array = new Array(size); // Initialize array with user-defined size
                    isArrayInitialized = true; // Set flag to true
                    textArea.setText("Array of size " + size + " created.");
                    textFieldSize.setText(""); // Clear the size input field
                } catch (NumberFormatException ex) {
                    textArea.setText("Invalid input. Please enter a valid size.");
                }
            }
        });
        btnSetSize.setBounds(170, 39, 120, 29);
        frame.getContentPane().add(btnSetSize);
    }
    
    public void setVisible(boolean b) {
        frame.setVisible(b);
    }
}
