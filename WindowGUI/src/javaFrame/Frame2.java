package javaFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Frame2 frame = new Frame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame2() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(41, 10, 159, 42);
		contentPane.add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 + num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"PLEASE ENTER THE VALID NUMBER..!");
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setBounds(55, 119, 92, 49);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SUB");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 - num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"PLEASE ENTER THE VALID NUMBER..!");
				}
			}

		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setForeground(new Color(0, 128, 0));
		btnNewButton_1.setBounds(258, 119, 85, 49);
		contentPane.add(btnNewButton_1);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(331, 10, 173, 42);
		contentPane.add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ANS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(310, 300, 33, 35);
		contentPane.add(lblNewLabel);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(353, 285, 151, 50);
		contentPane.add(textFieldAns);
		textFieldAns.setColumns(10);
	}
}
