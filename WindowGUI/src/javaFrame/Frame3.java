package javaFrame;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Frame3 {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Frame3 window = new Frame3();
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
    public Frame3() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Welcome Label
        JLabel lblWelcome = new JLabel("Welcome to Data Structure");
        lblWelcome.setForeground(new Color(255, 0, 0));
        lblWelcome.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblWelcome.setBounds(130, 30, 200, 20);
        frame.getContentPane().add(lblWelcome);

        // Array Button
        JButton btnArray = new JButton("Array");
        btnArray.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnArray.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayFrame arrayFrame = new ArrayFrame();
                arrayFrame.setVisible(true);  // Open Array operations frame
            }
        });
        btnArray.setBounds(50, 100, 100, 25);
        frame.getContentPane().add(btnArray);

        // Stack Button
        JButton btnStack = new JButton("Stack");
        btnStack.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnStack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                StackFrame stackFrame = new StackFrame();
                stackFrame.setVisible(true);  // Open Stack operations frame
            }
        });
        btnStack.setBounds(170, 100, 100, 25);
        frame.getContentPane().add(btnStack);

        // Queue Button
        JButton btnQueue = new JButton("Queue");
        btnQueue.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnQueue.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                QueueFrame queueFrame = new QueueFrame();
                queueFrame.setVisible(true);  // Open Queue operations frame
            }
        });
        btnQueue.setBounds(290, 100, 100, 25);
        frame.getContentPane().add(btnQueue);

        // Circular Queue Button
        JButton btnCircularQueue = new JButton("Circular Queue");
        btnCircularQueue.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnCircularQueue.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		CircularQueueFrame cqueueFrame = new CircularQueueFrame();
                cqueueFrame.setVisible(true);  // Open Queue operations frame
            }
        });
        btnCircularQueue.setBounds(50, 150, 140, 25);
        frame.getContentPane().add(btnCircularQueue);

        // Linked List Button
        JButton btnLinkedList = new JButton("Linked List");
        btnLinkedList.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnLinkedList.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                LinkedListFrame  linkedListFrame = new LinkedListFrame();
                linkedListFrame.setVisible(true);  // Open linkedlist operations frame
            }
        });
        btnLinkedList.setBounds(210, 150, 140, 25);
        frame.getContentPane().add(btnLinkedList);
    }
}
