package window;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;

import geFi.*;

public class Window extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel sPanel, wPanel, cPanel;
	private JLabel label1, label2, label3, label4, label5, label6;
	private JTextField tf;
	private JButton cButton, rButton, tButton, eButton, dButton;
	private JFrame fr;
	private JTextArea ta;
	private Graphics g;
	
	public Window() {
		southPanel();
		westPanel();
		centerPanel();
		pWindow();
	}
	
	public void southPanel() {
		sPanel = new JPanel();
		sPanel.setLayout(new FlowLayout());
		label1 = new JLabel("Perimeter");
		label2 = new JLabel("EMPTY");
		label3 = new JLabel("Area");
		label4 = new JLabel("EMPTY");
		label6 = new JLabel(" ILY RIVAS");
		sPanel.setBackground(new Color(58, 57, 57));
		
		sPanel.add(label1);
		sPanel.add(label2);
		sPanel.add(label3);
		sPanel.add(label4);
		sPanel.add(label6, BorderLayout.SOUTH);
	
	}
	
	public void westPanel() {
		wPanel = new JPanel();
		label5 = new JLabel("EMPTY");
		tf = new JTextField("EMPTY TF");
		tf.setMaximumSize(new Dimension(180, 25));
		cButton = new JButton("Circle");
		rButton = new JButton("Rectangle");
		tButton = new JButton("Triangle");
		eButton = new JButton("Erase the panel");
		dButton = new JButton("Draw   all");
		wPanel.setLayout(new BoxLayout(wPanel, BoxLayout.PAGE_AXIS));
		wPanel.setPreferredSize(new Dimension(130, 130));
		wPanel.setBackground(new Color(58, 57, 57));
		tf.setBackground(new Color(16, 17, 17));
		tf.setForeground(new Color(140, 140, 140));
		
		
		
		wPanel.add(label5);
		wPanel.add(tf);
		wPanel.add(cButton);
		wPanel.add(rButton);
		wPanel.add(tButton);
		wPanel.add(eButton);
		wPanel.add(dButton);
		
		label5.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		
		
		cButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Circle c = new Circle(2,2);
				c.draw(g);
				g.drawOval(5, 5, 5, 5);
			}
		});
		
	}
	
	public void centerPanel() {
		cPanel = new JPanel();
		cPanel.setLayout(new FlowLayout());
		ta = new JTextArea(34, 32);
		//ta.setEditable(false);
		cPanel.setBackground(new Color(76, 74, 74));
		
		cPanel.add(ta);
		
		
	}
	
	
	
	
	
	public void pWindow() {
		fr = new JFrame("The Best Painting Program E V E R");
		
		JScrollPane scroll = new JScrollPane(new JTextArea(" ", 10, 15));
		fr.setLayout(new BorderLayout());
		
		fr.add(sPanel,BorderLayout.SOUTH);
		fr.add(scroll, BorderLayout.CENTER);
		fr.add(wPanel,BorderLayout.WEST);
		//fr.add(cPanel,BorderLayout.CENTER);
		
		
		BorderLayout b = new BorderLayout(20, 20);
		setLayout(b);
		
		fr.pack();
		fr.setSize(600, 600);
		fr.setLocation(500, 120);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
