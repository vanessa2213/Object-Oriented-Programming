package userInterface;

import javax.swing.*;

import userInterface.Window;

import java.awt.*;
import java.awt.event.*;
import java.awt.print.Printable;
import java.awt.Color;

public class ButtonPanel extends JPanel{


	private static final long serialVersionUID = 1L;
	String s5 = "7",s6 = "8", s7 = "9", s9= "4", s10 = "5", s11 = "6", s13 = "1", s14 = "2", s15 = "3", s16 = "0";
	String s28 ="!", s27 = "", s0 = "", s1 = "-", s2 = "÷", s3 = "*", s4 = "-", s8 = "+", s12 = "=", s17 = ".",
	s20 = "x", s21 = "^2", s22 = "^3", s24 = "(", s25 = ")", s26 = "/", s19 =  "f(×)=", s18 = "y = ";
	String ss = ""; 
	int index = 0, cont = 1, multI = 0, index3, inParentIndex, FiParentIndex, indexx;
	String in1 = "";
	String in2 = "";
	String x = "x", typeOfDerivate = "", constant = "", comand = "", res = "", res1 = "", x1 = "", comand1 = "", comand2 = "";
	char func, constantC, op;

	
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29;
	
	public ButtonPanel() {
		
		GridLayout g = new GridLayout(6,5);
		setLayout(g);
		
		b0 = new JButton("AC");
		b1 = new JButton("0");
		b2 = new JButton("+/-");
		b3 = new JButton("*");
		b4 = new JButton("-");
		b5 = new JButton("+");
		b6 = new JButton("÷");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b10 = new JButton("4");
		b11 = new JButton("5");
		b12 = new JButton("6");
		b13 = new JButton("1");
		b14 = new JButton("2");
		b15 = new JButton("3");
		b16 = new JButton(".");
		b17 = new JButton("=");
		b18 = new JButton("d/dx");
		b19 = new JButton("∫");
		b20 = new JButton("x");
		b21 = new JButton("x²");
		b22 = new JButton("x³");
		b23 = new JButton("x^n");
		b24 = new JButton("(");
		b25 = new JButton(")");
		b26 = new JButton("/");
		b27 = new JButton("⌫");
		b28 = new JButton("!");
		b29 = new JButton("√");
		
		Font fuente = new Font("Arial Nova Light", 6, 16);
	
		b0.setBackground(new Color(157, 160, 165));
		b0.setFont(fuente);
		b20.setBackground(new Color(157, 160, 165));
		b20.setFont(fuente);
		b21.setBackground(new Color(157, 160, 165));
		b21.setFont(fuente);
		b15.setFont(fuente);
		b15.setFont(fuente);
		b22.setBackground(new Color(157, 160, 165));
		b22.setFont(fuente);
		b23.setBackground(new Color(157, 160, 165));
		b23.setFont(fuente);
		b24.setBackground(new Color(157, 160, 165));
		b24.setFont(fuente);
		b25.setBackground(new Color(157, 160, 165));
		b25.setFont(fuente);
		b26.setBackground(new Color(157, 160, 165));
		b26.setFont(fuente);
		b28.setBackground(new Color(157, 160, 165));
		b28.setFont(fuente);
		b29.setBackground(new Color(157, 160, 165));
		b29.setFont(fuente);
		
		b2.setBackground(new Color(247, 142, 56));
		b2.setFont(fuente);
		b3.setBackground(new Color(247, 142, 56));
		b3.setFont(fuente);
		b4.setBackground(new Color(247, 142, 56));
		b4.setFont(fuente);
		b5.setBackground(new Color(247, 142, 56));
		b5.setFont(fuente);
		b6.setBackground(new Color(247, 142, 56));
		b6.setFont(fuente);
		b17.setBackground(new Color(247, 142, 56));
		b17.setFont(fuente);
		b18.setBackground(new Color(247, 142, 56));
		b18.setFont(fuente);
		b19.setBackground(new Color(247, 142, 56));
		b19.setFont(fuente);
		
		b27.setBackground(new Color(81, 78, 75));
		b1.setBackground(new Color(81, 78, 75));
		b7.setBackground(new Color(81, 78, 75));
		b8.setBackground(new Color(81, 78, 75));
		b9.setBackground(new Color(81, 78, 75));
		b10.setBackground(new Color(81, 78, 75));
		b11.setBackground(new Color(81, 78, 75));
		b12.setBackground(new Color(81, 78, 75));
		b13.setBackground(new Color(81, 78, 75));
		b14.setBackground(new Color(81, 78, 75));
		b15.setBackground(new Color(81, 78, 75));
		b16.setBackground(new Color(81, 78, 75));
		
		
	    b1.setFont(fuente); 
		b1.setForeground(Color.WHITE);
		b7.setFont(fuente); 
		b7.setForeground(Color.WHITE);
		b8.setFont(fuente); 
		b8.setForeground(Color.WHITE);
		b9.setFont(fuente); 
		b9.setForeground(Color.WHITE);
		b10.setFont(fuente); 
		b10.setForeground(Color.WHITE);
		b11.setFont(fuente); 
		b11.setForeground(Color.WHITE);
		b12.setFont(fuente); 
		b12.setForeground(Color.WHITE);
		b13.setFont(fuente); 
		b13.setForeground(Color.WHITE);
		b14.setFont(fuente); 
		b14.setForeground(Color.WHITE);
		b15.setFont(fuente); 
		b15.setForeground(Color.WHITE);
		b16.setFont(fuente); 
		b16.setForeground(Color.WHITE);
		 
		b27.setForeground(Color.WHITE);
		
		add(b0);
		add(b20);
		add(b21);
		add(b22);
		add(b23);
		add(b24);
		add(b25);
		add(b26);
		add(b28);
		add(b29);
		add(b7);
		add(b8);
		add(b9);
		add(b18);
		add(b6); // entre 
		
		add(b10); // 4
		add(b11); // 5
		add(b12); // 6
		add(b19); // integral
		add(b3); //x por
		add(b13); //1
		add(b14); //2
		add(b15); //3
		add(b2); //+/-
		add(b4); //-
		add(b16); //.
		add(b1); //0
		add(b27); // delete
		add(b17); // =
		add(b5); // +
		
		b28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ss= ss.concat(s28);
				Window.refreshScreen(ss);
				index=ss.indexOf("!");
				String val= ss.substring(0, index);
				int value= Integer.parseInt(val);
				String finalres= Integer.toString(Window.factorial(value));
				Window.refreshScreen(finalres);
				val="";
				ss=finalres;
				
			}	
		});
		
		
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s8);
				Window.refreshScreen(ss);
				index = ss.indexOf("+");
			}
		});
		
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s2);
				Window.refreshScreen(ss);
				index = ss.indexOf("÷");
			}
		});
		b21.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s21);
				Window.refreshScreen(ss);
				comand1 = "^";
			}
		});
		
		b22.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s22);
				Window.refreshScreen(ss);
				comand1 = "^";
			}
		});
		b23.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat("^");
				Window.refreshScreen(ss);
				comand1 = "^";
			}
		});
		b29.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat("√");
				Window.refreshScreen(ss);
				index = ss.indexOf("√");
			}
		});
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s5);
				Window.refreshScreen(ss);
			}
		});
		
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s7);
				Window.refreshScreen(ss);
			}
		});
		
		b10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s9);
				Window.refreshScreen(ss);
			}
		});
		
		b11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s10);
				Window.refreshScreen(ss);
			}
		});
		
		b13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s13);
				Window.refreshScreen(ss);
			}
		});
		
		b14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s14);
				Window.refreshScreen(ss);
			}
		});
		
		b15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s15);
				Window.refreshScreen(ss);
			}
		});
		
		b16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s17);
				Window.refreshScreen(ss);
			}
		});

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s16);
				Window.refreshScreen(ss);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float val= Float.parseFloat(ss);
				float res = val*-1;
				String finalRes= Float.toString(res);
				Window.refreshScreen(finalRes);
				ss=finalRes;
			}
		});
		
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s3);
				Window.refreshScreen(ss);
				index = ss.indexOf("*");
			}
		});
		
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s4);
				Window.refreshScreen(ss);
				index = ss.indexOf("-");
			}
		});
		
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s6);
				Window.refreshScreen(ss);				
			}
		});
		
		b12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Window.refreshScreen("");
				ss = ss.concat(s11);
				Window.refreshScreen(ss);
			}
		});
		
		b0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s0);
				Window.refreshScreen(s0);
				ss = "";
				comand = "";
				comand2 = "";
			}
		});
		
		b18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s18);
				Window.refreshScreen(ss);
				index = 0;
				comand = "d";
			}
		});
		b19.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s19);
				Window.refreshScreen(ss);
				comand = "I";
			}
		});
		
		b17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (comand == "I" && comand!= "(") { // integrals
					String integral = ss.substring(5,ss.length());
					if (integral.contains(x) == true) {
						String isequis = ss.substring(5,6);
						
						if (isequis.contains(x) == true) {//checks if the first character is an x an not a number
							
							if (integral.contains("÷")== false && integral.contains("*")==false && integral.contains("^")==true && integral.contains("+") == false && integral.contains("-") == false) {
								//checks if  it doesnt have any operation and a power greater than 1
								String equisala = integral.substring(0,2);
								String exponente = integral.substring(2,integral.length());
								int newExp = Integer.parseInt(exponente)+1;
								String resultex = Integer.toString(newExp);
								ss= "y="+"("+equisala+resultex+")"+"/"+resultex+"+ C";
								Window.refreshScreen(ss);
								
							}else if (integral.contains("÷")== false && integral.contains("*")==false && integral.contains("^")==false && integral.contains("*")==false && integral.contains("+")==false) {
								//checks if it doesnt have any operations and a power lower than 1
								ss= "y=(x^2)/2 + C";
								Window.refreshScreen(ss);
							}
							else if (integral.contains("÷")== true) {
								//check if its an operation using division
								String primeraparte = integral.substring(0,index-5);
								int indexequis1 = primeraparte.indexOf(x);
								String pow1 = integral.substring(indexequis1+2,index-5);
								int powUno =Integer.parseInt(pow1) ;
								
								String segundaparte = integral.substring(index-4, integral.length());
								int indexequis2 = segundaparte.indexOf(x);
								String pow2= segundaparte.substring(indexequis2+2, segundaparte.length());
								int powDos =Integer.parseInt(pow2) ;
								
								if (powUno > powDos) {
									//check if the first power is greater than the second
									int powFin= powUno-powDos+1;
									String finPow = Integer.toString(powFin);
									ss= "y=(1/"+finPow+")x^"+finPow+"+ C";
									Window.refreshScreen(ss);
										
									
									}
								
								else if (powDos>powUno) {
									//check if the second power is greater than the first
									int powFin= powDos-powUno+1;
									String finPow = Integer.toString(powFin);
									ss= "y=(1/"+finPow+"x^"+finPow+")+ C";
									Window.refreshScreen(ss);
								
								}
								else if (powDos == powUno) {
									//check if the power are equal
											ss= "y= x + C";
											Window.refreshScreen(ss);
										}
								}
						

						
							else if (integral.contains("*")==true) {
								//check if it is multiplying
								String primeraparte = integral.substring(0,index-5);
								int indexequis1 = primeraparte.indexOf(x);
								String pow1 = integral.substring(indexequis1+2,index-5);
								int powUno =Integer.parseInt(pow1) ;
								
								String segundaparte = integral.substring(index-4, integral.length());
								int indexequis2 = segundaparte.indexOf(x);
								String pow2= segundaparte.substring(indexequis2+2, segundaparte.length());
								int powDos =Integer.parseInt(pow2) ;
								
								int powFinal = powUno + powDos + 1;
								ss= "y=(1/"+powFinal+")x^"+powFinal+"+ C";
								Window.refreshScreen(ss);
							}
						}else if (isequis.contains(x)== false){
							if (integral.contains("÷")== false && integral.contains("*")== false && integral.contains("^")==true && integral.contains("+")==false) {
								//checks if  it doesnt have any operation and a power greater than 1
								int indexequis = integral.indexOf("x");
								String pow = integral.substring(indexequis+2,integral.length());
								
								String num = integral.substring(0,indexequis);
								
								int newExpo = Integer.parseInt(pow)+1;
								String resexp =  Integer.toString(newExpo);
								ss= "y=("+num+"x^"+resexp+")"+"/"+resexp+"+ C";
								Window.refreshScreen(ss);
							}
							else if (integral.contains("÷")== false && integral.contains("*")==false && integral.contains("^")==false && integral.contains("+")==false) {
								
								int indexequis = integral.indexOf("x");
								
								String num = integral.substring(0,indexequis);
								
								ss= "y=("+num+"x^2)/2 + C";
								Window.refreshScreen(ss);
							
							}
							else if (integral.contains("+")==true) {
								String primeraparteSum = integral.substring(0,index-5);
								int indexSum1 = primeraparteSum.indexOf(x);
								int indexResult1 = indexSum1;
								int indexSum1_2 = indexSum1 + 2;
								char expSum1 = integral.charAt(indexSum1_2); 
								String expSumF =  Character.toString(expSum1);
								int old_exp = Integer.parseInt(expSumF);
								int new_exp = old_exp + 1;
								String primeraSum = integral.substring(0,indexResult1);
								System.out.println(primeraSum);
								
								String segundaparteSum = integral.substring(index-4, integral.length());
								int indexSum2 = segundaparteSum.indexOf(x);
								int indexResult2 = indexSum2;
								int indexSum2_2 = indexSum2 + 2;
								char expSum2 = segundaparteSum.charAt(indexSum2_2); 
								String expSumS =  Character.toString(expSum2);
								int old_exp2 = Integer.parseInt(expSumS);
								int new_exp2 = old_exp2 + 1;
								String segundaSum = segundaparteSum.substring(0,indexResult2);
								System.out.println(segundaSum);
								
								
								
								String sumResultFinal = ("("+ primeraSum + "/" + new_exp + ")"+"x"+"^" + new_exp + "+" + "("+ segundaSum + "/" + new_exp2 + ")"+"x"+"^" + new_exp2);
								Window.refreshScreen(sumResultFinal);
							}
							else if (integral.contains("÷")== true) {
								String primeraparte = integral.substring(0,index-5);
								int indexequis1 = primeraparte.indexOf(x);
								String pow1 = integral.substring(indexequis1+2,index-5);
								int powUno =Integer.parseInt(pow1) ;
								String num= primeraparte.substring(0,indexequis1);
								int num1 = Integer.parseInt(num);
								
								String segundaparte = integral.substring(index-4, integral.length());
								int indexequis2 = segundaparte.indexOf(x);
								String pow2= segundaparte.substring(indexequis2+2, segundaparte.length());
								int powDos =Integer.parseInt(pow2) ;
								String numD= segundaparte.substring(0,indexequis2);
								int num2 = Integer.parseInt(numD);
								
								if (powUno > powDos) {
									//check if the first power is greater than the second
									int powFin= powUno-powDos+1;
									String finPow = Integer.toString(powFin);
									
									if (num1!= num2) {
										//check if the first number is not equal to the second
										int num2fin= num2*powFin;
										String fin2 = Integer.toString(num2fin);
										
											ss= "y=("+num1+"/"+fin2+")x^"+finPow+"+ C";
											Window.refreshScreen(ss);
										
									}
									else {
										//then if they are equal
											ss= "y=(1/"+finPow+")x^"+finPow+"+ C";
											Window.refreshScreen(ss);
										}
									
									}
								
								else if (powDos>powUno) {
									//check if the second power is greater than the first
									int powFin= powDos-powUno+1;
									String finPow = Integer.toString(powFin);
									
									if (num1!= num2) {
										//check if the first number is not equal to the second
										int num2fin= num2*powFin;
										ss= "y=(-"+num1+"/"+num2fin+"x^"+finPow+")+ C";
										Window.refreshScreen(ss);
										
									}
									else {
										//then if they are equal
										ss= "y=(1/"+finPow+"x^"+finPow+")+ C";
										Window.refreshScreen(ss);
										}
									
									
								}
								else if (powDos == powUno) {
									//check if the powers are equal
									if (num1!= num2) {
										//check if the first number is not equal to the second
										ss= "y=("+num1+"/"+num2+")x + C";
										Window.refreshScreen(ss);
										
									}
									else {
										//then if they are equal
											ss= "y= x + C";
											Window.refreshScreen(ss);
										}
								}
								
								
							}else if (integral.contains("*")==true) {
								//check if it is multiplying
								String primeraparte = integral.substring(0,index-5);
								int indexequis1 = primeraparte.indexOf(x);
								System.out.println(primeraparte);
								String pow1 = integral.substring(indexequis1+2,index-5);
								int powUno =Integer.parseInt(pow1) ;
								String num= primeraparte.substring(0,indexequis1);
								int num1 = Integer.parseInt(num);
								
								String segundaparte = integral.substring(index-4, integral.length());
								int indexequis2 = segundaparte.indexOf(x);
								String pow2= segundaparte.substring(indexequis2+2, segundaparte.length());
								int powDos =Integer.parseInt(pow2) ;
								String numD= segundaparte.substring(0,indexequis2);
								int num2 = Integer.parseInt(numD);
								
								int powFinal = powUno + powDos + 1;
								int num2Final = num2 * powFinal;
								if (num1!= num2) {
									//check if the first number is not equal to the second
									ss= "y=("+num1+"/"+num2Final+")x^"+powFinal+"+ C";
									Window.refreshScreen(ss);
								}
								else {
									//check if the numbers are equal
									ss= "y=(1/"+powFinal+"x^"+powFinal+")+ C";
									Window.refreshScreen(ss);
								}
								
							}
						}
						
					}else { 
						//check if it just a number
						ss = "y="+integral+"x + C";
						Window.refreshScreen(ss);}
					}
					
				
				
				if (comand != "d") { // 
					System.out.println(ss);
					System.out.println(index);
					op = ss.charAt(index); // Obteniedo el operador
					//String op = ss.substring(index);
					System.out.println(op);
					
					
				}
				
				
				
				if (comand == "d"){
					op = 'y'; // Obteniedo el operador
					
			
				}
				if (op == 'y' && comand2 == "/") { // y = x^3/x^2 COCIENTES
					
					System.out.println(ss);
					
					int indexpow = ss.indexOf("^");
					int indexDiv = ss.indexOf("/");
					
					String ssNew = ss.substring((indexDiv + 1), ss.length());
					System.out.println(ssNew);
					int indexpow2 = ssNew.indexOf("^");
					
					String expS = ss.substring((indexpow + 1), (indexDiv));
					System.out.println(expS);
					int exp = Integer.parseInt(expS);
					
					String expS2 = ssNew.substring((indexpow2 + 1), ssNew.length());
					System.out.println(expS2);
					int exp2 = Integer.parseInt(expS2);
					
					String cons = ss.substring(4, (indexpow));
					System.out.println("cons"+cons);
					String cons_1 = ss.substring(4, (indexpow-1));
					System.out.println("cons_1"+cons_1);
					
					String cons1 = ssNew.substring(0, 1);
					System.out.println("cons1"+cons1);
					String cons1_1 = ssNew.substring(0, (indexpow2-1));
					System.out.println("cons_1"+cons1_1);
					
					String comand5 = "";
					
					if (exp > exp2) {
						System.out.println("primero");
						
						int newExp = exp - exp2;
						System.out.println(newExp);
						if (newExp == 1) {
							
							if (cons.contains("x") == true && cons1.contains("x") == true) {
								System.out.println("YAA");
								String res3 = "1";
								Window.refreshScreen("1");
				
							}
							
							
							if (cons.contains("x") == false && cons1.contains("x") == false && comand5 != "div") {
								System.out.println("div");
								String newCons = cons.substring(0,1);
								String newCons1 = cons1.substring(0,1);
								String res3 = newCons+"/"+newCons1;
								Window.refreshScreen(res3);
								
							}
							
						} else if (newExp > 1) {
							String res3 = newExp+"x"+(newExp-1);
							Window.refreshScreen(res3);
						}
						
						
					} else if (exp2 > exp) {
						System.out.println("segundo");
						
						int newExp = exp - exp2;
						int newExp1 = newExp - 1;
						int newExp2 = newExp1*-1;
						System.out.println(newExp);
						String res3 = newExp+"/"+"x^"+newExp2;
						Window.refreshScreen(res3);
					}
					
					
					
					
					
				}
				//////
				if (op == '√') { // RAICES
					
					int root = ss.indexOf("√");
				
					
					String id = ss.substring(0, (root));
					System.out.println(id);
					double con = Double.parseDouble(id);
					System.out.println("es"+con);
					
					
					String n = ss.substring((root + 1), ss.length());
					double nd = Double.parseDouble(n); // Obteniendo exponente en Integer
					System.out.println(nd);
					
					double res1 = Math.pow(nd, 1/con);
					String res1S = String.valueOf(res1);
					System.out.println(res1S);
					Window.refreshScreen(res1S);
				}
				
				
				else if (comand1 == "^" && comand != "(" && comand != "d") { // exponenciales
					op = '^';
					
					int gor = ss.indexOf("^");
				
					
					String conS = ss.substring(0, (gor));
					System.out.println(conS);
					double con = Double.parseDouble(conS);
					System.out.println(con);
					
					
					String expS = ss.substring((gor + 1), ss.length());
					double exp = Double.parseDouble(expS); // Obteniendo exponente en Integer
					System.out.println(exp);
					
					double res1 = Math.pow(con, exp);
					String res1S = String.valueOf(res1);
					System.out.println(res1S);
					Window.refreshScreen(res1S);
					
					
				}
				
				
				
				
				if (op != 'y' && op != '^' && op != '√') { // Operaciones bÃ¡sicas
					String in1 = ss.substring(0, index); // Obteniendo el primer numero en String 
					String in2 = ss.substring((index + 1), ss.length()); // Obteniendo el segundo numero en String 
					float su1 = Float.parseFloat(in1);
					float su2 = Float.parseFloat(in2);
					
					
					if (op == '+') {
						float re = su1 + su2;
						String res = Float.toString(re);
						Window.refreshScreen(res);
						in1 = "";
						in2 = "";
						ss = res;
					}
					else if (op == '-') {
						float re = su1 - su2;
						String res = Float.toString(re);
						Window.refreshScreen(res);
						in1 = "";
						in2 = "";
						ss = res;
					}
					else if (op == '*') {
						float re = su1 * su2;
						String res = Float.toString(re);
						Window.refreshScreen(res);
						in1 = "";
						in2 = "";
						ss = res;
					}
					else if (op =='÷') {
						float re = su1 / su2;
						String res = Float.toString(re);
						Window.refreshScreen(res);
						in1 = "";
						in2 = "";
						ss = res;
					}
					
					
					
				} 
				
				
				else if (op== 'y' && comand != "("){ // Derivar NO CAMBIAR NADA DE AQUI PLOOOOTS
					
					
					int subIn = ss.indexOf("x"); // Obteniendo indice de variable x
					//int parentInt = ss.indexOf("(");
					//System.out.println(parentInt);
					//char parentC = ss.charAt(parentInt);
					//System.out.println(parentC);
					int index1 = subIn + 2; // Obteniendo variable de exponente
					char exp = ss.charAt(index1); // Obteniendo exponente en Char
					String expS = Character.toString(exp); // Obteniendo exponente en String
					int expI = Integer.parseInt(expS); // Obteniendo exponente en Integer
					System.out.println(expI);
					
					int index2 = index1 + 1;
					
					int newExp = expI - 1;
					String newExpS = Integer.toString(newExp);
					
					int ind = ss.indexOf("+");
					System.out.println(ind);
					
					
					char multC = ss.charAt(subIn - 1);
					
					if (multC != ' ') {
						String multS = Character.toString(multC);
						multI = Integer.parseInt(multS);
					}
					
					
					if (newExp == 1) {
						x = "x";
					} else if (newExp > 1) {
						x = "x^"+newExpS;
					}
					
					String f1 = ss.substring(4, ss.length());
					System.out.println(f1);
					
					if (ind != -1 && multC == ' ') {
						if (ss.charAt(index2) == '+') {
							typeOfDerivate = "sum";
							if (ss.charAt(index2 + 1) == 'x') {
								typeOfDerivate = "sum2";
							} 
						} 
					} else if (ind == -1 && multC == ' '){
						typeOfDerivate = "exp";
					} else if (multC != ' ' && ind == -1) {
						typeOfDerivate = "prod";
					} else if (multC != ' ' && ss.charAt(index2) == '+' && ss.charAt(index2 + 1) == 'x') {
						typeOfDerivate = "sum3";
					} else if (multC != ' ' && ss.charAt(index2) == '+' && ss.charAt(index2 + 1) != 'x') {
						typeOfDerivate = "sum4";
					} 
					
					
					
					if (typeOfDerivate == "sum") { // Exponencial + constante
						res = expS+x;
						Window.refreshScreen(res);
						in1 = "";
						in2 = "";
						ss = res;
					} else if (typeOfDerivate == "sum2") { // Suma de dos exponenciales
						char exp_s = ss.charAt(index2 + 3);
						String expS_s = Character.toString(exp_s);
						int expI_s = Integer.parseInt(expS_s);
						
						int newExp_s = expI_s - 1;
						String newExpS_2 = Integer.toString(newExp_s);
						
						if (newExp_s == 1) {
							x1 = "x";
						} else if (newExp_s > 1) {
							x1 = "x^"+newExpS;
						}
						
						res = expS+x+"+"+expI_s+x1;
						Window.refreshScreen(res);
						ss = res;
					} else if (typeOfDerivate == "sum3") { // Suma de un producto mas un exponencial
						char exp_s = ss.charAt(index2 + 3);
						String expS_s = Character.toString(exp_s);
						int expI_s = Integer.parseInt(expS_s);
						
						int newExp_s = expI_s - 1;
						String newExpS_2 = Integer.toString(newExp_s);
						
						if (newExp_s == 1) {
							x1 = "x";
						} else if (newExp_s > 1) {
							x1 = "x^"+newExpS;
						}
						
						int c = multI * expI;
						res = c+x+"+"+expI_s+x1;
						Window.refreshScreen(res);
					} else if (typeOfDerivate == "sum4") { // Suma de dos productos
						char multC1 = ss.charAt(index2 + 1);
						String multS1 = Character.toString(multC1);
						int multI1 = Integer.parseInt(multS1);
						
						char exp_s = ss.charAt(index2 + 4);
						String expS_s = Character.toString(exp_s);
						int expI_s = Integer.parseInt(expS_s);
						
						int newExp_s = expI_s - 1;
						String newExpS_2 = Integer.toString(newExp_s);
						
						if (newExp_s == 1) {
							x1 = "x";
						} else if (newExp_s > 1) {
							x1 = "x^"+newExpS_2;
						}
						
						
						int c1 = multI1 * expI_s;
						int c = multI * expI;
						res = c+x+"+"+c1+x1;
						Window.refreshScreen(res);
					} else if (typeOfDerivate == "exp") { // exponencial simple sin otra operacion
						res = expS+x;
						Window.refreshScreen(res);
						ss = res;
					} else if (typeOfDerivate == "prod") { // producto simple sin otra operacion
						int c = multI * expI;
						res = c+x;
						Window.refreshScreen(res);
						ss = res;
					} 
				} 
				else if (op == 'i') {//integrales
					//**1.- EXPONENCIAL
					//**2.- PRODUCTO
					//**3.- DIVISION
					//**4.- CADENA
				} else if (op == 'p') {
					System.out.println();
				}
				else if (comand == "(" && op != '^') { // Products
					
					inParentIndex = ss.indexOf('(');
					FiParentIndex = ss.indexOf(')');
					System.out.println(inParentIndex);
					System.out.println(FiParentIndex);
					
					
					System.out.println(ss);
					
					char op1 = ss.charAt(inParentIndex + 1);
					char op2 = ss.charAt(FiParentIndex + 2);
					
					System.out.println(op1);
					System.out.println(op2);
					
					
					
					if (op1 == 'x' && op2 == 'x') { // Deriva (x^n)(x^n)
						char expC = ss.charAt(inParentIndex + 3);
						String expS = Character.toString(expC);
						int exp = Integer.parseInt(expS);
						System.out.println(exp);
						
						char expC_1 = ss.charAt(FiParentIndex + 4);
						String expS_1 = Character.toString(expC_1);
						int exp_1 = Integer.parseInt(expS_1);
						System.out.println(exp_1);
						
						int res1 = exp + exp_1;
						String x = "x^"+res1;
						
						int newExp = res1 -1;
						
						res = res1+"x^"+newExp;
						Window.refreshScreen(res);
		
					} else if (op1 != 'x' && op2 == 'l') { // Deriva (ax^n)(x^n)
						char constantC = ss.charAt(inParentIndex + 1);
						String constantS = Character.toString(constantC);
						int constant = Integer.parseInt(constantS);
						System.out.println(constant);
						
						char expC = ss.charAt(inParentIndex + 4);
						String expS = Character.toString(expC);
						int exp = Integer.parseInt(expS);
						System.out.println(exp);
						
						int newExp = exp -1;
						
						if (newExp == 1) {
							x = "x";
						} else if (newExp > 1) {
							x = "x^"+newExp;
						}
						
						char expC_1 = ss.charAt(FiParentIndex + 4);
						String expS_1 = Character.toString(expC_1);
						int exp_1 = Integer.parseInt(expS_1);
						System.out.println(exp_1);
						
						
						int newExp1 = exp_1 -1;
						
						System.out.println(newExp1);
						
						if (newExp1 == 1) {
							x1 = "x";
						} else if (newExp1 > 1) {
							x1 = "x^"+newExp1;
						}
						
						
						
						int newConstant = constant * exp;
						String res1 = newConstant+x;
						String res2 = exp_1+x1;
						String u = ss.substring((inParentIndex+1), FiParentIndex);
						String v = ss.substring((FiParentIndex+2), (FiParentIndex+5));
						
						String res_ss = "("+res1+")"+"("+v+")"+"+"+"("+u+")"+"("+res2+")";
						Window.refreshScreen(res_ss);
						
						
						
					} else if(comand == "(") { // todos los productos simples
						int constant = 0;
						System.out.println("abuebo");
						int indexpow = ss.indexOf("x");
						
						
						String segundaP = ss.substring((FiParentIndex+1), ss.length());
						int indexpow2 = segundaP.indexOf("x");
						
						String constantS = "";
						String constantS2 = "";
						
						
						char pow = ss.charAt(indexpow - 1);
						char pow2 = segundaP.charAt(indexpow2 - 1);
						String pow2S = Character.toString(pow2);

						if (pow == '(') {
							constantS = ss.substring(5, (indexpow + 1));
						} 
						if (pow != '(') {
							constantS = ss.substring(5, (indexpow));
						}
						if (pow2S.contains("(") == true) {
							System.out.println("SO");
							constantS2 = segundaP.substring(1, (indexpow2+1));
						} 
						if (pow2S.contains("(") == false) {
							System.out.println("yaaa");
							constantS2 = segundaP.substring(1, (indexpow2));
						}
						
						
						
						int constant2 = 0;
						
						if (constantS.contains("x") == true) {
							constant = 1;
							System.out.println("Faso");
						} else if (constantS.contains("x") == false){
							constant = Integer.parseInt(constantS);
						}
						
						
						if (constantS2.contains("x") == true) {
							constant2 = 1;
						} else if (constantS2.contains("x") == false){
							constant2 = Integer.parseInt(constantS2);
						}
						
						
						String expS = ss.substring((indexpow + 2), (FiParentIndex));
						int exp = Integer.parseInt(expS);

						int expIndex2 = segundaP.indexOf("^");
						String expS_1 = segundaP.substring((expIndex2 + 1), (segundaP.length()-1));
						System.out.println(expS_1);
						int exp_1 = Integer.parseInt(expS_1);
						System.out.println(exp_1);
						
						
						int newExp1 = exp_1 -1;
						
						int res1 = exp + exp_1;
						int newExp = res1 -1;
						
						if (constantS.contains("x") == true) {
							res = (res1*constant2)+"x^"+newExp;
						} else if (constantS2.contains("x") == true) {
							res = (res1*constant)+"x^"+newExp;
						} else if (constantS.contains("x") == false && constantS2.contains("x") == false) {
							res = (constant*constant2)*res1+"x^"+newExp;
						}
						

						Window.refreshScreen(res);
					} 
					
					
					
				} 
			}
		});
		

		
		b20.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s20);
				Window.refreshScreen(ss);
				
			}
		});
		

		b24.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s24);
				Window.refreshScreen(ss);
				comand = "(";
			}
		});
		
		b25.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s25);
				Window.refreshScreen(ss);
			}
		});
		
		b26.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s26);
				Window.refreshScreen(ss);

				comand2 = "/";
			}
		});
		b27.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ss = ss.concat(s27);
				ss = ss.substring(0, ss.length()-1);
				Window.refreshScreen(ss);
				
		        }
			
		});		
		
		}

}





