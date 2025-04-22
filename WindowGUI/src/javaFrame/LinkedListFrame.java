package javaFrame;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class LinkedListFrame {

    private JFrame frame;
    private JTextField textField;
    private JTextArea textArea;
    private LinkedList linkedList;
    private JTextField sizeField; // Field to input size
    private boolean isSizeSet = false; // Track if size is set

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LinkedListFrame window = new LinkedListFrame();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public LinkedListFrame() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 576, 387);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblLinkedListOperations = new JLabel("Linked List Operations");
        lblLinkedListOperations.setForeground(new Color(255, 0, 0));
        lblLinkedListOperations.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblLinkedListOperations.setBounds(150, 10, 165, 20);
        frame.getContentPane().add(lblLinkedListOperations);

        sizeField = new JTextField(); // Text field for size input
        sizeField.setBounds(150, 40, 130, 26);
        frame.getContentPane().add(sizeField);
        sizeField.setColumns(10);

        textField = new JTextField();
        textField.setBounds(30, 76, 406, 26);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textArea = new JTextArea();
        textArea.setBounds(51, 211, 400, 100);
        frame.getContentPane().add(textArea);

        // Set Size Button
        JButton btnSetSize = new JButton("Set Size");
        btnSetSize.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int size = Integer.parseInt(sizeField.getText());
                    linkedList = new LinkedList(size); // Initialize LinkedList with specified size
                    isSizeSet = true; // Set flag to true
                    textArea.setText("Linked List of size " + size + " created.");
                    sizeField.setText(""); // Clear the size input field
                } catch (NumberFormatException ex) {
                    textArea.setText("Invalid input. Please enter a valid size.");
                }
            }
        });
        btnSetSize.setBounds(28, 38, 100, 29);
        frame.getContentPane().add(btnSetSize);

        // Insert First Button
        JButton btnInsertFirst = new JButton("Insert First");
        btnInsertFirst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isSizeSet) {
                    try {
                        int element = Integer.parseInt(textField.getText());
                        linkedList.insertFirst(element);
                        textArea.setText("Element " + element + " inserted at the beginning.");
                        textField.setText("");
                    } catch (NumberFormatException ex) {
                        textArea.setText("Invalid input. Please enter a number.");
                    }
                } else {
                    textArea.setText("Please set the size of the linked list first.");
                }
            }
        });
        btnInsertFirst.setBounds(20, 110, 120, 29);
        frame.getContentPane().add(btnInsertFirst);

        // Insert Last Button
        JButton btnInsertLast = new JButton("Insert Last");
        btnInsertLast.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isSizeSet) {
                    try {
                        int element = Integer.parseInt(textField.getText());
                        linkedList.insertLast(element);
                        textArea.setText("Element " + element + " inserted at the end.");
                        textField.setText("");
                    } catch (NumberFormatException ex) {
                        textArea.setText("Invalid input. Please enter a number.");
                    }
                } else {
                    textArea.setText("Please set the size of the linked list first.");
                }
            }
        });
        btnInsertLast.setBounds(160, 110, 120, 29);
        frame.getContentPane().add(btnInsertLast);

        // Delete First Button
        JButton btnDeleteFirst = new JButton("Delete First");
        btnDeleteFirst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isSizeSet) {
                    linkedList.deleteFirst();
                    textArea.setText("First element deleted.");
                } else {
                    textArea.setText("Please set the size of the linked list first.");
                }
            }
        });
        btnDeleteFirst.setBounds(20, 150, 120, 29);
        frame.getContentPane().add(btnDeleteFirst);

        // Delete Last Button
        JButton btnDeleteLast = new JButton("Delete Last");
        btnDeleteLast.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isSizeSet) {
                    linkedList.deleteLast();
                    textArea.setText("Last element deleted.");
                } else {
                    textArea.setText("Please set the size of the linked list first.");
                }
            }
        });
        btnDeleteLast.setBounds(160, 150, 120, 29);
        frame.getContentPane().add(btnDeleteLast);

        // Display Button
        JButton btnDisplay = new JButton("Display Forward");
        btnDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isSizeSet) {
                    String elements = linkedList.displayForward();
                    textArea.setText(elements.length() > 0 ? elements : "List is empty.");
                } else {
                    textArea.setText("Please set the size of the linked list first.");
                }
            }
        });
        btnDisplay.setBounds(300, 110, 140, 29);
        frame.getContentPane().add(btnDisplay);
    }

    public void setVisible(boolean b) {
        frame.setVisible(b);
    }
}
