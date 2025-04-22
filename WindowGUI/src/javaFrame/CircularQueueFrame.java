package javaFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

public class CircularQueueFrame extends JFrame {
    private CircularQueue circularQueue;
    private JTextField sizeField;
    private JTextField inputField;
    private JTextArea displayArea;
    private boolean isQueueInitialized = false; // Track if the queue has been initialized

    public CircularQueueFrame() {
        // Set up the frame
        setTitle("Circular Queue Implementation");
        setSize(482, 374);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Create components
        JLabel titleLabel = new JLabel("Circular Queue Implementation");
        titleLabel.setForeground(new Color(255, 0, 0));
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        titleLabel.setBounds(100, 10, 200, 25);
        getContentPane().add(titleLabel);

        sizeField = new JTextField(); // Text field for size input
        sizeField.setBounds(50, 45, 151, 25);
        getContentPane().add(sizeField);
        
        inputField = new JTextField();
        inputField.setBounds(50, 80, 315, 25);
        getContentPane().add(inputField);

        JButton setSizeButton = new JButton("Set Size");
        setSizeButton.setBounds(211, 42, 100, 30);
        getContentPane().add(setSizeButton);

        JButton insertButton = new JButton("Insert");
        insertButton.setBounds(50, 115, 100, 30);
        getContentPane().add(insertButton);

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(160, 115, 100, 30);
        getContentPane().add(deleteButton);

        JButton displayButton = new JButton("Display");
        displayButton.setBounds(270, 115, 100, 30);
        getContentPane().add(displayButton);

        displayArea = new JTextArea();
        displayArea.setBounds(50, 190, 300, 60);
        displayArea.setEditable(false);
        getContentPane().add(displayArea);

        // Action listeners
        setSizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sizeText = sizeField.getText();
                if (!sizeText.isEmpty()) {
                    try {
                        int size = Integer.parseInt(sizeText);
                        circularQueue = new CircularQueue(size); // Initialize queue with user-defined size
                        isQueueInitialized = true; // Set flag to true
                        displayArea.setText("Circular Queue of size " + size + " created.");
                        sizeField.setText(""); // Clear the size input field
                    } catch (NumberFormatException ex) {
                        displayArea.setText("Invalid input! Please enter an integer.");
                    }
                } else {
                    displayArea.setText("Size input cannot be empty.");
                }
            }
        });

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isQueueInitialized) {
                    String inputText = inputField.getText();
                    if (!inputText.isEmpty()) {
                        try {
                            int element = Integer.parseInt(inputText);
                            circularQueue.insert(element);
                            displayArea.setText("Inserted: " + element);
                            inputField.setText(""); // Clear the input field
                        } catch (NumberFormatException ex) {
                            displayArea.setText("Invalid input! Please enter an integer.");
                        }
                    } else {
                        displayArea.setText("Input cannot be empty.");
                    }
                } else {
                    displayArea.setText("Please set the queue size first.");
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isQueueInitialized) {
                    circularQueue.delete();
                    displayArea.setText("Deleted an element from the queue.");
                } else {
                    displayArea.setText("Please set the queue size first.");
                }
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isQueueInitialized) {
                    displayArea.setText(circularQueue.display());
                } else {
                    displayArea.setText("Please set the queue size first.");
                }
            }
        });
    }

    public static void main(String[] args) {
        CircularQueueFrame frame = new CircularQueueFrame();
        frame.setVisible(true);
    }
}
