package javaFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

public class QueueFrame extends JFrame {
    private Queue queue;
    private JTextField inputField;
    private JTextArea displayArea;
    private JTextField sizeField;

    public QueueFrame() {
        // Setup frame properties
        setTitle("Queue Implementation");
        setSize(536, 435); // Increased height for size input
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Create components
        JLabel titleLabel = new JLabel("Queue Operations");
        titleLabel.setForeground(new Color(255, 0, 0));
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        titleLabel.setBounds(181, 10, 150, 30);
        getContentPane().add(titleLabel);

        JLabel sizeLabel = new JLabel("Enter Queue Size:");
        sizeLabel.setBounds(50, 50, 120, 30);
        getContentPane().add(sizeLabel);

        sizeField = new JTextField();
        sizeField.setBounds(133, 51, 100, 30);
        getContentPane().add(sizeField);

        JButton createQueueButton = new JButton("Create Queue");
        createQueueButton.setBounds(244, 50, 100, 30);
        getContentPane().add(createQueueButton);

        JLabel inputLabel = new JLabel("Enter Element:");
        inputLabel.setBounds(50, 100, 100, 30);
        getContentPane().add(inputLabel);

        inputField = new JTextField();
        inputField.setBounds(150, 100, 215, 30);
        getContentPane().add(inputField);

        JButton insertButton = new JButton("Insert");
        insertButton.setBounds(50, 150, 100, 30);
        getContentPane().add(insertButton);

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(160, 150, 100, 30);
        getContentPane().add(deleteButton);

        JButton displayButton = new JButton("Display");
        displayButton.setBounds(270, 150, 100, 30);
        getContentPane().add(displayButton);

        displayArea = new JTextArea();
        displayArea.setBounds(50, 208, 408, 150);
        getContentPane().add(displayArea);

        // Action listener for creating the queue
        createQueueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sizeText = sizeField.getText();
                if (!sizeText.isEmpty()) {
                    try {
                        int size = Integer.parseInt(sizeText);
                        queue = new Queue(size); // Create a new queue with specified size
                        displayArea.setText("Queue created with size: " + size);
                        sizeField.setText(""); // Clear size input field
                    } catch (NumberFormatException ex) {
                        displayArea.setText("Invalid size! Please enter a positive integer.");
                    }
                } else {
                    displayArea.setText("Size cannot be empty.");
                }
            }
        });

        // Add action listeners for other buttons
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (queue == null) {
                    displayArea.setText("Please create a queue first.");
                    return;
                }
                
                String inputText = inputField.getText();
                if (!inputText.isEmpty()) {
                    try {
                        int element = Integer.parseInt(inputText);
                        queue.insert(element);
                        displayArea.setText("Inserted: " + element);
                        inputField.setText(""); // Clear input field
                    } catch (NumberFormatException ex) {
                        displayArea.setText("Invalid input! Please enter an integer.");
                    }
                } else {
                    displayArea.setText("Input cannot be empty.");
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (queue == null) {
                    displayArea.setText("Please create a queue first.");
                    return;
                }
                
                queue.delete();
                displayArea.setText("Element deleted.");
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (queue == null) {
                    displayArea.setText("Please create a queue first.");
                    return;
                }
                
                displayArea.setText(queue.display());
            }
        });
    }

    public static void main(String[] args) {
        QueueFrame frame = new QueueFrame();
        frame.setVisible(true);
    }
}
