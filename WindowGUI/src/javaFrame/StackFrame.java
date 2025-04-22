package javaFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

public class StackFrame extends JFrame {
    private Stack stack;
    private JTextField inputField;
    private JTextArea displayArea;
    private JTextField sizeField; // For setting the size of the stack
    private boolean isStackInitialized = false; // Track if the stack has been initialized

    public StackFrame() {
        // Set up the frame
        setTitle("Stack Implementation");
        setSize(471, 326);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Create components
        JLabel titleLabel = new JLabel("Stack Implementation");
        titleLabel.setForeground(new Color(255, 0, 0));
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        titleLabel.setBounds(130, 10, 200, 25);
        getContentPane().add(titleLabel);

        sizeField = new JTextField(); // Text field for size input
        sizeField.setBounds(50, 50, 118, 25);
        getContentPane().add(sizeField);
        
        inputField = new JTextField();
        inputField.setBounds(50, 80, 300, 25);
        getContentPane().add(inputField);

        JButton setSizeButton = new JButton("Set Size");
        setSizeButton.setBounds(178, 47, 100, 30);
        getContentPane().add(setSizeButton);

        JButton pushButton = new JButton("Push");
        pushButton.setBounds(50, 121, 100, 30);
        getContentPane().add(pushButton);

        JButton popButton = new JButton("Pop");
        popButton.setBounds(160, 121, 100, 30);
        getContentPane().add(popButton);

        JButton displayButton = new JButton("Display");
        displayButton.setBounds(276, 121, 100, 30);
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
                        stack = new Stack(size); // Initialize stack with user-defined size
                        isStackInitialized = true; // Set flag to true
                        displayArea.setText("Stack of size " + size + " created.");
                        sizeField.setText(""); // Clear the size input field
                    } catch (NumberFormatException ex) {
                        displayArea.setText("Invalid input! Please enter an integer.");
                    }
                } else {
                    displayArea.setText("Size input cannot be empty.");
                }
            }
        });

        pushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputField.getText();
                if (isStackInitialized) {
                    if (!inputText.isEmpty()) {
                        try {
                            int element = Integer.parseInt(inputText);
                            stack.push(element);
                            displayArea.setText("Pushed: " + element);
                            inputField.setText(""); // Clear the input field
                        } catch (NumberFormatException ex) {
                            displayArea.setText("Invalid input! Please enter an integer.");
                        } catch (IllegalStateException ex) {
                            displayArea.setText(ex.getMessage());
                        }
                    } else {
                        displayArea.setText("Input cannot be empty.");
                    }
                } else {
                    displayArea.setText("Please set the stack size first.");
                }
            }
        });

        popButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isStackInitialized) {
                    try {
                        int poppedValue = stack.pop();
                        displayArea.setText("Popped: " + poppedValue);
                    } catch (IllegalStateException ex) {
                        displayArea.setText(ex.getMessage());
                    }
                } else {
                    displayArea.setText("Please set the stack size first.");
                }
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isStackInitialized) {
                    displayArea.setText(stack.display());
                } else {
                    displayArea.setText("Please set the stack size first.");
                }
            }
        });
    }

    public static void main(String[] args) {
        StackFrame frame = new StackFrame();
        frame.setVisible(true);
    }
}
