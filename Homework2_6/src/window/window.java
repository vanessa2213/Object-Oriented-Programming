package window;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class window extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String test = "C:\\Users\\Dell\\Desktop>test.txt";
	 JMenuBar bar;
	 JMenu menu;
	 JMenuItem save, load;
	 static JTextArea textArea;
	 String line= "";
	 
	 public window() {
		 super("TEXT EDITOR");
		 
		 GridLayout g = new GridLayout(4,1);
		 setLayout(g);
		 textArea = new JTextArea("");
		 
		 
		 bar= new JMenuBar();
		 
		 menu= new JMenu("Menu:");
		 load= new JMenuItem("Load");
		 save= new JMenuItem("Save");
		 
		 
		 menu.add(save);
		 menu.addSeparator();
		 menu.add(load);
		 bar.add(menu);
		 
		 setJMenuBar(bar);
		 add(textArea);
		 
		 load.addActionListener(new ActionListener() {
			 
			 public void actionPerformed(ActionEvent e) {
				 System.out.println("Load button.");
				 JFileChooser fc= new JFileChooser();
				 int returnVal= fc.showOpenDialog(window.this);
				 if (returnVal == JFileChooser.APPROVE_OPTION) {
					 FileReader fr;
					 
					 try {
						 fr= new FileReader(fc.getSelectedFile());
						 BufferedReader br=new BufferedReader(fr);
						 
						 while ((line = br.readLine()) != null) {
							 System.out.println(line);
							 textArea.append(line);
						 }
						 
						 br.close();
					 } catch(FileNotFoundException e1) {
						 e1.printStackTrace();
					 } catch(IOException e1) {
						 e1.printStackTrace();
					 }
					 
				 }
			 }
		 });
		 
		 save.addActionListener(new ActionListener() {
			 
			 public void actionPerformed(ActionEvent e) {
					System.out.println("save button");
					JFileChooser fc1 = new JFileChooser();
					int returnVal = fc1.showSaveDialog(window.this);
					System.out.println(textArea.getText());
					
					if(returnVal == JFileChooser.APPROVE_OPTION){
			
						
						try {
							FileWriter writer = new FileWriter(test);
							BufferedWriter bw = new BufferedWriter(writer);

							bw.write(textArea.getText());
							bw.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						
					}
					
				}
		 });
		 
		 	setSize(500, 500);
			setLocation(500, 500);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
	 }
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

}
