package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Buttons extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Font fuente = new Font("Calibri", 3, 16);
	JButton ac = new JButton("AC");
	JButton cambiar = new JButton ("+/-");
	JButton delete = new JButton ("⌫");
	JButton divide = new JButton("÷");
	JButton multiply = new JButton("*");
	JButton nuSeven = new JButton("7");
	JButton nuEight = new JButton("8");
	JButton nuNine = new JButton("9");
	JButton min = new JButton("-");
	JButton nufour = new JButton("4");
	JButton nufive = new JButton("5");
	JButton nusix = new JButton("6");
	JButton plus = new JButton("+");
	JButton nuone = new JButton("1");
	JButton nutwo = new JButton("2");
	JButton nuthree = new JButton("3");
	JButton nuzero = new JButton("0");
	JButton equal = new JButton("=");
	JButton percentage = new JButton("%");
	JButton point= new JButton(".");
	
	JButton equis = new JButton ("x");
	JButton equiscua= new JButton ("x²");
	JButton equiscub = new JButton("x³");
	JButton equisn = new JButton ("x^n");
	
	JButton der= new JButton ("d/dx");
	JButton inte= new JButton ("∫");
	JButton fact = new JButton("!");
	
	JButton pareiz = new JButton ("(");
	JButton  pareder = new JButton (")");
	
	JButton pi= new JButton("π");
	JButton raiz = new JButton("√");
	JButton raizcu = new JButton("3√");
	JButton cuad= new JButton("n²");
	JButton cub= new JButton("n³");
	JButton alan= new JButton("n^n");
	JButton vacio= new JButton("HELLO");
	
	
	
	String sequis="x", sder= "y=", sinte="f(x)=",sac="", sdiv="÷", smul="*", s7="7", s8="8", s9="9", smin="-", s4="4",s5="5",s6="6",splus="+", s1="1",s2="2", s3="3", s0="0",sEqual="=",sPer="%", sPoint=".";
	String sfact = "!", sraiz= "√",  sequiscua= "^2", sequiscub = "^3", sequisn = "x^", sraizcu="3√", salan="^";
	String sNew="", sIndexInt="", x = "x", comand="";
	int index=0;
	int tipodeInt=0, index1=0;
	
	
	public Buttons() {
		GridLayout g = new GridLayout(6, 6);
		setLayout(g);
		
		
		add(ac);
		add(raiz);
		add(equis);
		add(equiscua);
		add(equiscub);
		add(equisn);
		
		
		add(der);
		add(raizcu);
		add(cambiar);
		add(percentage);
		add(fact);
		add(divide);
		
		add(inte);
		add(cuad);
		add(nuSeven);
		add(nuEight);
		add(nuNine);
		add(multiply);
		
		add(pi);
		add(cub);
		add(nufour);
		add(nufive);
		add(nusix);
		add(min);
		
		add(delete);
		add(alan);
		add(nuone);
		add(nutwo);
		add(nuthree);
		add(plus);
		
		add(vacio);
		add(pareiz);
		add(pareder);
		add(nuzero);
		add(point);
		add(equal);
		
		
		equis.setBackground(new Color(81, 78, 75));
		equis.setFont(fuente);
		equiscua.setBackground(new Color(81, 78, 75));
		equiscua.setFont(fuente);
		equiscub.setBackground(new Color(81, 78, 75));
		equiscub.setFont(fuente);
		equisn.setBackground(new Color(81, 78, 75));
		equisn.setFont(fuente);
		ac.setBackground(new Color(157, 160, 165));
		ac.setFont(fuente);
		
		der.setBackground(new Color(157, 160, 165));
		der.setFont(fuente);
		cambiar.setBackground(new Color(157, 160, 165));
		cambiar.setFont(fuente);
		percentage.setBackground(new Color(157, 160, 165));
		percentage.setFont(fuente);
		fact.setBackground(new Color(157, 160, 165));
		fact.setFont(fuente);
		divide.setBackground(new Color(247, 142, 56));
		divide.setFont(fuente);
		
		inte.setBackground(new Color(157, 160, 165));
		inte.setFont(fuente);
		nuSeven.setBackground(new Color(81, 78, 75));
		nuSeven.setFont(fuente);
		nuEight.setBackground(new Color(81, 78, 75));
		nuEight.setFont(fuente);
		nuNine.setBackground(new Color(81, 78, 75));
		nuNine.setFont(fuente);
		multiply.setBackground(new Color(247, 142, 56));
		multiply.setFont(fuente);
		
		raiz.setBackground(new Color(157, 160, 165));
		raiz.setFont(fuente);
		nufour.setBackground(new Color(81, 78, 75));
		nufour.setFont(fuente);
		nufive.setBackground(new Color(81, 78, 75));
		nufive.setFont(fuente);
		nusix.setBackground(new Color(81, 78, 75));
		nusix.setFont(fuente);
		min.setBackground(new Color(247, 142, 56));
		min.setFont(fuente);
		
		delete.setBackground(new Color(157, 160, 165));
		nuone.setBackground(new Color(81, 78, 75));
		nuone.setFont(fuente);
		nutwo.setBackground(new Color(81, 78, 75));
		nutwo.setFont(fuente);
		nuthree.setBackground(new Color(81, 78, 75));
		nuthree.setFont(fuente);
		plus.setBackground(new Color(247, 142, 56));
		plus.setFont(fuente);
		
		pareiz.setBackground(new Color(157, 160, 165));
		pareiz.setFont(fuente);
		pareder.setBackground(new Color(157, 160, 165));
		pareder.setFont(fuente);
		nuzero.setBackground(new Color(81, 78, 75));
		nuzero.setFont(fuente);
		point.setBackground(new Color(157, 160, 165));
		point.setFont(fuente);
		equal.setBackground(new Color(247, 142, 56));
		equal.setFont(fuente);
		
		equis.setForeground(Color.WHITE);
		equiscua.setForeground(Color.WHITE);
		equiscub.setForeground(Color.WHITE);
		equisn.setForeground(Color.WHITE);
		nuSeven.setForeground(Color.WHITE);
		nuEight.setForeground(Color.WHITE);
		nuNine.setForeground(Color.WHITE);
		nufour.setForeground(Color.WHITE);
		nufive.setForeground(Color.WHITE);
		nusix.setForeground(Color.WHITE);
		nuone.setForeground(Color.WHITE);
		nutwo.setForeground(Color.WHITE);
		nuthree.setForeground(Color.WHITE);
		nuzero.setForeground(Color.WHITE);
		
		raizcu.setBackground(new Color(157, 160, 165));
		raizcu.setFont(fuente);
		cuad.setBackground(new Color(157, 160, 165));
		cuad.setFont(fuente);
		cub.setBackground(new Color(157, 160, 165));
		cub.setFont(fuente);
		pi.setBackground(new Color(157, 160, 165));
		pi.setFont(fuente);
		alan.setBackground(new Color(157, 160, 165));
		alan.setFont(fuente);
		
		
		
		
		
		ac.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(sac);
				Window.escribir(sac);
				sNew = "";
			}
		});
		percentage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String sPrimerVal= sNew;
				float primerVal= Float.parseFloat(sPrimerVal);
				
				float res= primerVal / 100;
				String finalRes= Float.toString(res);
				Window.escribir(finalRes);
				sPrimerVal="";
				sNew=finalRes;
			}
			});
		
		divide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(sdiv);
				Window.escribir(sNew);
				index=sNew.indexOf("÷");
			}
		});
		min.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(smin);
				Window.escribir(sNew);
				index=sNew.indexOf("-");
			}
		});
		multiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(smul);
				Window.escribir(sNew);
				index=sNew.indexOf("*");
			}
		});
		
		point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		sNew = sNew.concat(sPoint);
		Window.escribir(sNew);
		}
	});
		
		nuSeven.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			sNew = sNew.concat(s7);
			Window.escribir(sNew);
			}
		});

		nuEight.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			sNew = sNew.concat(s8);
			Window.escribir(sNew);
			}
		});

		nuNine.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sNew = sNew.concat(s9);
					Window.escribir(sNew);
				}
		});
		

		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(splus);
				Window.escribir(sNew);
				index=sNew.indexOf("+");
			}
		});
		
		nufour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(s4);
				Window.escribir(sNew);
				}
		});
		
		nufive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(s5);
				Window.escribir(sNew);
				}
		});
		
		nusix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(s6);
				Window.escribir(sNew);
				}
		});
		
		nuone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(s1);
				Window.escribir(sNew);
				}
		});
		
		nutwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(s2);
				Window.escribir(sNew);
				}
		});
		
		nuthree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(s3);
				Window.escribir(sNew);
				}
		});
		
		nuzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(s0);
				Window.escribir(sNew);
				}
		});
		
		fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(sfact);
				Window.escribir(sNew);
				index=sNew.indexOf("!");
				
				String val= sNew.substring(0, index);
				int value= Integer.parseInt(val);
				String finalres= Integer.toString(Window.factorial(value));
				Window.escribir(finalres);
				val="";
				sNew=finalres;
				
				}
		});
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					sNew = sNew.substring(0, sNew.length()-1);
					Window.escribir(sNew);
				
		        }
			
		});
		equis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(sequis);
				Window.escribir(sNew);
	        }
		});
		equiscua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(sequiscua);
				Window.escribir(sNew);
				sIndexInt="equiscuad";
	        }
		});
		equiscub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(sequiscub);
				Window.escribir(sNew);
				sIndexInt="equiscub";
	        }
		});
		equisn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(sequisn);
				Window.escribir(sNew);
			
	        }
		});
		raiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(sraiz);
				Window.escribir(sNew);
				index=sNew.indexOf("√");
			
	        }
		});
		raizcu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(sraizcu);
				Window.escribir(sNew);
				index=sNew.indexOf("3√");
			
	        }
		});
		cuad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value= Integer.parseInt(sNew);
				double res=  Math.pow(value, 2);
				String finalRes= Double.toString(res);
				Window.escribir(finalRes);
				sNew=finalRes;
			
	        }
		});
		cub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value= Integer.parseInt(sNew);
				double res=  Math.pow(value, 3);
				String finalRes= Double.toString(res);
				Window.escribir(finalRes);
				sNew=finalRes;
			
	        }
		});
		alan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(salan);
				Window.escribir(sNew);
				index=sNew.indexOf("^");
			
	        }
		});
		cambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float val= Float.parseFloat(sNew);
				float res = val*-1;
				String finalRes= Float.toString(res);
				Window.escribir(finalRes);
				sNew=finalRes;
				}
		});
		
		pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float val= Float.parseFloat(sNew);
				double res = val*Math.PI;
				String finalRes= Double.toString(res);
				Window.escribir(finalRes);
				sNew=finalRes;
	        }
		});
		raiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value=sNew.substring(1, sNew.length()-1);
				double val= Double.parseDouble(value);
				double res = Math.sqrt(val);
				String finalRes= Double.toString(res);
				Window.escribir(finalRes);
				sNew=finalRes;
	        }
		});
		der.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(sder);
				Window.escribir(sNew);
				index=sNew.indexOf("y");
			}
		});
		inte.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(sinte);
				Window.escribir(sNew);
				comand= "I";
			}
		});
		pareder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat("(");
				Window.escribir(sNew);
				comand= "(";
			}
		});
		pareiz.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sNew = sNew.concat(")");
				Window.escribir(sNew);
			}
		});
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char op=sNew.charAt(index);
				if (comand == "I" && comand!= "(") { // 
					String integral = sNew.substring(5,sNew.length());
					if (integral.contains(x) == true) {
						String isequis = sNew.substring(5,6);
						
						if (isequis.contains(x) == true) {
							
							if (integral.contains("÷")== false && integral.contains("*")==false && integral.contains("^")==true) {
								
								String equisala = integral.substring(0,2);
								String exponente = integral.substring(2,integral.length());
								int newExp = Integer.parseInt(exponente)+1;
								String resultex = Integer.toString(newExp);
								sNew= "y="+"("+equisala+resultex+")"+"/"+resultex+"+ C";
								Window.escribir(sNew);
								
							}else if (integral.contains("÷")== false && integral.contains("*")==false && integral.contains("^")==false) {
								sNew= "y=(x^2)/2 + C";
								Window.escribir(sNew);
							}
							
							else if (integral.contains("÷")== true) {
								String primeraparte = integral.substring(0,index-5);
								int indexequis1 = primeraparte.indexOf(x);
								String pow1 = integral.substring(indexequis1+2,index-5);
								int powUno =Integer.parseInt(pow1) ;
								
								String segundaparte = integral.substring(index-4, integral.length());
								int indexequis2 = segundaparte.indexOf(x);
								String pow2= segundaparte.substring(indexequis2+2, segundaparte.length());
								int powDos =Integer.parseInt(pow2) ;
								
								if (powUno > powDos) {
									int powFin= powUno-powDos+1;
									String finPow = Integer.toString(powFin);
									sNew= "y=(1/"+finPow+")x^"+finPow+"+ C";
									Window.escribir(sNew);
										
									
									}
								
								else if (powDos>powUno) {
									int powFin= powDos-powUno+1;
									String finPow = Integer.toString(powFin);
									sNew= "y=(1/"+finPow+"x^"+finPow+")+ C";
									Window.escribir(sNew);
								
								}
								else if (powDos == powUno) {
											sNew= "y= x + C";
											Window.escribir(sNew);
										}
								}
							else if (integral.contains("*")==true) {
								String primeraparte = integral.substring(0,index-5);
								int indexequis1 = primeraparte.indexOf(x);
								System.out.println(primeraparte);
								String pow1 = integral.substring(indexequis1+2,index-5);
								int powUno =Integer.parseInt(pow1) ;
								
								String segundaparte = integral.substring(index-4, integral.length());
								int indexequis2 = segundaparte.indexOf(x);
								String pow2= segundaparte.substring(indexequis2+2, segundaparte.length());
								int powDos =Integer.parseInt(pow2) ;
								
								int powFinal = powUno + powDos + 1;
								sNew= "y=(1/"+powFinal+")x^"+powFinal+"+ C";
								Window.escribir(sNew);
							}
								
						}else if (isequis.contains(x)== false){
							if (integral.contains("÷")== false && integral.contains("*")==false && integral.contains("^")==true) {
								
								int indexequis = integral.indexOf("x");
								String pow = integral.substring(indexequis+2,integral.length());
								
								String num = integral.substring(0,indexequis);
								
								int newExpo = Integer.parseInt(pow)+1;
								String resexp =  Integer.toString(newExpo);
								sNew= "y=("+num+"x^"+resexp+")"+"/"+resexp+"+ C";
								Window.escribir(sNew);
							}
							else if (integral.contains("÷")== false && integral.contains("*")==false && integral.contains("^")==false) {
								
								int indexequis = integral.indexOf("x");
								
								String num = integral.substring(0,indexequis);
								
								sNew= "y=("+num+"x^2)/2 + C";
								Window.escribir(sNew);
							}
							else if (integral.contains("÷")== true) {
								String primeraparte = integral.substring(0,index-5);
								int indexequis1 = primeraparte.indexOf(x);
								String pow1 = integral.substring(indexequis1+2,index-5);
								int powUno =Integer.parseInt(pow1) ;
								String num= primeraparte.substring(0,indexequis1);
								int num1 = Integer.parseInt(num);
								System.out.println(primeraparte.contains("^"));
								
								String segundaparte = integral.substring(index-4, integral.length());
								int indexequis2 = segundaparte.indexOf(x);
								String pow2= segundaparte.substring(indexequis2+2, segundaparte.length());
								int powDos =Integer.parseInt(pow2) ;
								String numD= segundaparte.substring(0,indexequis2);
								int num2 = Integer.parseInt(numD);
								
								if (powUno > powDos) {
									int powFin= powUno-powDos+1;
									String finPow = Integer.toString(powFin);
									
									if (num1!= num2) {
										int num2fin= num2*powFin;
										String fin2 = Integer.toString(num2fin);
										
											sNew= "y=("+num1+"/"+fin2+")x^"+finPow+"+ C";
											Window.escribir(sNew);
										
									}
									else {
										
											sNew= "y=(1/"+finPow+")x^"+finPow+"+ C";
											Window.escribir(sNew);
										}
									
									}
								
								else if (powDos>powUno) {
									int powFin= powDos-powUno+1;
									String finPow = Integer.toString(powFin);
									
									if (num1!= num2) {
										int num2fin= num2*powFin;
										sNew= "y=(-"+num1+"/"+num2fin+"x^"+finPow+")+ C";
										Window.escribir(sNew);
										
									}
									else {
										sNew= "y=(1/"+finPow+"x^"+finPow+")+ C";
										Window.escribir(sNew);
										}
									
									
								}
								else if (powDos == powUno) {
									if (num1!= num2) {
										
										
											sNew= "y=("+num1+"/"+num2+")x + C";
											Window.escribir(sNew);
										
									}
									else {
										
											sNew= "y= x + C";
											Window.escribir(sNew);
										}
								}
								
								
							}
							else if (integral.contains("*")==true) {
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
									sNew= "y=("+num1+"/"+num2Final+")x^"+powFinal+"+ C";
									Window.escribir(sNew);
								}
								else {
									sNew= "y=(1/"+powFinal+"x^"+powFinal+")+ C";
									Window.escribir(sNew);
								}
								
							}
						}
						
					}else {
							sNew = "y="+integral+"x + C";
							Window.escribir(sNew);}
						
					}
					
				
				
				else if (op != 'y' && op != '^') {
					String sPrimerVal= sNew.substring(0, index);
					String sSegundoVal= sNew.substring((index+1), sNew.length());
				
					float primerVal= Float.parseFloat(sPrimerVal);
					float segundoVal= Float.parseFloat(sSegundoVal);
				
					if (op == '+') {
					
						float res= primerVal + segundoVal;
						String finalRes= Float.toString(res);
						Window.escribir(finalRes);
						sPrimerVal="";
						sSegundoVal="";
						sNew=finalRes;
					}
					
					else if (op == '*') {
						float res= primerVal * segundoVal;
						String finalRes= Float.toString(res);
						Window.escribir(finalRes);
						sPrimerVal="";
						sSegundoVal="";
						sNew=finalRes;
					}	
				
					else if (op == '-') {
						float res= primerVal - segundoVal;
						String finalRes= Float.toString(res);
						Window.escribir(finalRes);
						sPrimerVal="";
						sSegundoVal="";
						sNew=finalRes;
					}
				
					else if (op == '÷') {
						float res= primerVal / segundoVal;
						String finalRes= Float.toString(res);
						Window.escribir(finalRes);
						sPrimerVal="";
						sSegundoVal="";
						sNew=finalRes;
					}
				
					else if(op=='^') {
						double res= Math.pow(primerVal, segundoVal);
						String finalRes= Double.toString(res);
						Window.escribir(finalRes);
						sPrimerVal="";
						sSegundoVal="";
						sNew=finalRes;
					}
				
				}
			}
			
		});
}}

