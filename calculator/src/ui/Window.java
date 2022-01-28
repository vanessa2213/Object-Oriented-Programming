package ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Window extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JTextField textField;

	public Window(){
		super("Calculator");
		
		textField = new JTextField();
		add(textField, BorderLayout.NORTH);
		Buttons b= new Buttons();
		add(b);
	
		setSize(450,480);
		setLocation(500,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button");
	}
	public static void escribir(String text) {
		textField.setText(text); 
	}
	
	
	public static int factorial(int num) {
		if (num==0 || num==1) {
			return 1;
		}
		return num*factorial(num-1);
	}
}