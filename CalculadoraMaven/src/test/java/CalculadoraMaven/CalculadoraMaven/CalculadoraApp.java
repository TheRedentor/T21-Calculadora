package CalculadoraMaven.CalculadoraMaven;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculadoraApp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private double result;
	private String textError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraApp frame = new CalculadoraApp();
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
	public CalculadoraApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 159);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(24, 31, 114, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 31, 114, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(272, 31, 114, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton_12 = new JButton("+");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = Functions.sumar(textField.getText(), textField_1.getText());
			}
		});
		btnNewButton_12.setBounds(24, 75, 54, 23);
		contentPane.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("-");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = Functions.restar(textField.getText(), textField_1.getText());
			}
		});
		btnNewButton_13.setBounds(84, 75, 54, 23);
		contentPane.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("X");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = Functions.multiplicar(textField.getText(), textField_1.getText());
			}
		});
		btnNewButton_14.setBounds(148, 75, 54, 23);
		contentPane.add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("/");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = Functions.dividir(textField.getText(), textField_1.getText());
			}
		});
		btnNewButton_15.setBounds(208, 75, 54, 23);
		contentPane.add(btnNewButton_15);
		
		btnNewButton_11 = new JButton("=");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText(String.valueOf(result));
			}
		});
		btnNewButton_11.setBounds(272, 75, 54, 23);
		contentPane.add(btnNewButton_11);
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}
}
