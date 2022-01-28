package userInterface;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Window  extends JFrame implements ActionListener{
	
	//private JButton button, button2;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JTextField textField;
	
	public Window() {
		super(" JALISCO INSTRUMENTS ");
		
		textField = new JTextField();
		textField.setEditable(false);
		
		Font fuente=new Font("Dialog", Font.BOLD, 20);
		textField.setFont(fuente);
		
		//button = new JButton("   0   ");
		//button2 = new JButton("0.00");
		ButtonPanel bp = new ButtonPanel();
		

		
		add(bp, BorderLayout.CENTER);
		add(textField, BorderLayout.NORTH);
		
		
		setSize(345, 480);
		setLocation(450, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button");
	}
	static void refreshScreen(String pantalla) {
		textField.setText(pantalla); 
	}
	
	public static int factorial(int num) {
		if (num==0 || num==1) {
			return 1;
		}
		return num*factorial(num-1);
	}

}
