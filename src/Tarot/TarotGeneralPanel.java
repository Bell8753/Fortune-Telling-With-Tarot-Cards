package Tarot;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class TarotGeneralPanel extends JPanel implements TarotPanel {
	JPanel rightpanelresult = new JPanel();
	JPanel leftpanel = new JPanel();
	JPanel rightpanel = new JPanel();
	JLabel maincard = new JLabel("");
	JLabel result = new JLabel("");
	private ImageIcon back, fool, highpriestess, emperor, strength, justic, hangedman, death, temperance, devil, tower, sun, judgment;
	private JButton one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve;
	private int main, cntclick = 0;
	private boolean isClicked1 = false;
	private boolean isClicked2 = false;
	private boolean isClicked3 = false;
	private boolean isClicked4 = false;
	private boolean isClicked5 = false;
	private boolean isClicked6 = false;
	private boolean isClicked7 = false;
	private boolean isClicked8 = false;
	private boolean isClicked9 = false;
	private boolean isClicked10 = false;
	private boolean isClicked11 = false;
	private boolean isClicked12 = false;
	Random r = new Random();
	Integer[] ran = new Integer[12];

	public JLabel getMaincard() {
		return maincard;
	}

	public JLabel getResult() {
		return result;
	}

	public int getMain() {
		return main;
	}

	public void setClicked1(boolean isClicked1) {
		this.isClicked1 = isClicked1;
	}

	public void setClicked2(boolean isClicked2) {
		this.isClicked2 = isClicked2;
	}

	public void setClicked3(boolean isClicked3) {
		this.isClicked3 = isClicked3;
	}

	public void setClicked4(boolean isClicked4) {
		this.isClicked4 = isClicked4;
	}

	public void setClicked5(boolean isClicked5) {
		this.isClicked5 = isClicked5;
	}

	public void setClicked6(boolean isClicked6) {
		this.isClicked6 = isClicked6;
	}

	public void setClicked7(boolean isClicked7) {
		this.isClicked7 = isClicked7;
	}

	public void setClicked8(boolean isClicked8) {
		this.isClicked8 = isClicked8;
	}
	
	public void setClicked9(boolean isClicked9) {
		this.isClicked9 = isClicked9;
	}
	
	public void setClicked10(boolean isClicked10) {
		this.isClicked10 = isClicked10;
	}
	
	public void setClicked11(boolean isClicked11) {
		this.isClicked11 = isClicked11;
	}
	
	public void setClicked12(boolean isClicked12) {
		this.isClicked12 = isClicked12;
	}


	public JButton getOne() {
		return one;
	}

	public JButton getTwo() {
		return two;
	}

	public JButton getThree() {
		return three;
	}

	public JButton getFour() {
		return four;
	}

	public JButton getFive() {
		return five;
	}

	public JButton getSix() {
		return six;
	}

	public JButton getSeven() {
		return seven;
	}

	public JButton getEight() {
		return eight;
	}

	public JButton getNine() {
		return nine;
	}
	
	public JButton getTen() {
		return ten;
	}
	
	public JButton getEleven() {
		return eleven;
	}
	
	public JButton getTwelve() {
		return twelve;
	}
	
	public void setCntclick(int cntclick) {
		this.cntclick = cntclick;
	}

	public int getCntclick() {
		return cntclick;
	}

	public void shuffle() {
		for (int i = 0; i < 12; i++) {
			ran[i] = i;
		}
		Collections.shuffle(Arrays.asList(ran));
		leftpanel.removeAll();
		for (int i = 0; i < 12; i++)
			switch (ran[i]) {
			case 0:
				leftpanel.add(one);
				break;
			case 1:
				leftpanel.add(two);
				break;
			case 2:
				leftpanel.add(three);
				break;
			case 3:
				leftpanel.add(four);
				break;
			case 4:
				leftpanel.add(five);
				break;
			case 5:
				leftpanel.add(six);
				break;
			case 6:
				leftpanel.add(seven);
				break;
			case 7:
				leftpanel.add(eight);
				break;
			case 8:
				leftpanel.add(nine);
				break;
			case 9:
				leftpanel.add(ten);
				break;
			case 10:
				leftpanel.add(eleven);
				break;
			case 11:
				leftpanel.add(twelve);
				break;
			}
	}

	public TarotGeneralPanel() {
		back = new ImageIcon("Backplatev.jpg");
		fool = new ImageIcon("Fool.png");
		highpriestess = new ImageIcon("HighPriestess.png");
		emperor = new ImageIcon("Emperor.png");
		strength = new ImageIcon("Strength.png");
		justic = new ImageIcon("Justice.png");
		hangedman = new ImageIcon("HangedMan.png");
		death = new ImageIcon("Death.png");
		temperance = new ImageIcon("Temperance.png");
		devil = new ImageIcon("Devil.png");
		tower = new ImageIcon("Tower.png");
		sun = new ImageIcon("Sun.png");
		judgment = new ImageIcon("Judgement.png");
		one = new JButton(back);
		two = new JButton(back);
		three = new JButton(back);
		four = new JButton(back);
		five = new JButton(back);
		six = new JButton(back);
		seven = new JButton(back);
		eight = new JButton(back);
		nine = new JButton(back);
		ten = new JButton(back);
		eleven = new JButton(back);
		twelve = new JButton(back);
		rightpanel.setBackground(Color.BLACK);
		leftpanel.setPreferredSize(new Dimension(1150, 590));
		leftpanel.setLayout(new GridLayout(2, 6));
		shuffle();
		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isClicked1 == false && cntclick < 1) {
					one.setBorder(new LineBorder(Color.GRAY, 5));
					one.setIcon(fool);
					isClicked1 = true;
				} else if (isClicked1 == true || cntclick == 1) {
					JOptionPane.showMessageDialog(null, "The prediction is already done. Please shuffle.");
				} 
				if (cntclick == 0) {
					main = 1;
				}
				cntclick++;
				if (cntclick == 1) {
					if (isClicked2 == false)  {
							two.setIcon(highpriestess);
						} 
					if (isClicked3 == false) {
							three.setIcon(emperor);
						} 
					if (isClicked4 == false) {
							four.setIcon(strength);
						} 
					if (isClicked5 == false) {
							five.setIcon(justic);
						} 
					if (isClicked6 == false) {
							six.setIcon(hangedman);
						} 
					if (isClicked7 == false) {
							seven.setIcon(death);
						} 
					if (isClicked8 == false) {
							eight.setIcon(temperance);
						} 
					if (isClicked9 == false) {
							nine.setIcon(devil);
						} 
					if (isClicked10 == false) {
							ten.setIcon(tower);
						} 
					if (isClicked11 == false) {
							eleven.setIcon(sun);
						} 
					if (isClicked12 == false) {
							twelve.setIcon(judgment);
						}
						
					if (main == 1 && one.getIcon() == fool) {
						maincard.setText("Your card is : The Fool");
						result.setText(
						"<html>The Fool marks a new start. His attitude is optimistic,"
						+ " so this card is quite positive. But if surrounded by negative cards,"
						+ " it can be read as a rash or foolhardy.</html>");
					}
					isClicked2 = true;
					isClicked3 = true;
					isClicked4 = true;
					isClicked5 = true;
					isClicked6 = true;
					isClicked7 = true;
					isClicked8 = true;
					isClicked9 = true;
					isClicked10 = true;
					isClicked11 = true;
					isClicked12 = true;
				}
			}
		});
		 two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isClicked2 == false && cntclick < 1) {
					two.setBorder(new LineBorder(Color.GRAY, 5));
					two.setIcon(highpriestess);
					isClicked2 = true;
				} else if (isClicked2 == true || cntclick == 1) {
					JOptionPane.showMessageDialog(null, "The prediction is already done. Please shuffle.");
				} 
				if (cntclick == 0) {
					main = 2;
				}
				cntclick++;
				if (cntclick == 1) {
					if (isClicked1 == false)  {
							one.setIcon(fool);
						} 
					if (isClicked3 == false) {
							three.setIcon(emperor);
						} 
					if (isClicked4 == false) {
							four.setIcon(strength);
						} 
					if (isClicked5 == false) {
							five.setIcon(justic);
						} 
					if (isClicked6 == false) {
							six.setIcon(hangedman);
						} 
					if (isClicked7 == false) {
							seven.setIcon(death);
						} 
					if (isClicked8 == false) {
							eight.setIcon(temperance);
						} 
					if (isClicked9 == false) {
							nine.setIcon(devil);
						} 
					if (isClicked10 == false) {
							ten.setIcon(tower);
						} 
					if (isClicked11 == false) {
							eleven.setIcon(sun);
						} 
					if (isClicked12 == false) {
							twelve.setIcon(judgment);
						} 
						
					if (main == 2 && two.getIcon() == highpriestess) {
						maincard.setText("Your card is : The High Priestess");
						result.setText(
						"<html>This card represents dreams,"
						+ " knowledge and intuition. The asker will soon take part in new experiences"
						+ " and develop an understanding of the world if he uses the aforementioned elements.</html>");
					}
					isClicked1 = true;
					isClicked3 = true;
					isClicked4 = true;
					isClicked5 = true;
					isClicked6 = true;
					isClicked7 = true;
					isClicked8 = true;
					isClicked9 = true;
					isClicked10 = true;
					isClicked11 = true;
					isClicked12 = true;
				}
			}
		});
		 three.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (isClicked3 == false && cntclick < 1) {
						three.setBorder(new LineBorder(Color.GRAY, 5));
						three.setIcon(emperor);
						isClicked3 = true;
					} else if (isClicked3 == true || cntclick == 1) {
						JOptionPane.showMessageDialog(null, "The prediction is already done. Please shuffle.");
					} 
					if (cntclick == 0) {
						main = 3;
					}
					cntclick++;
					if (cntclick == 1) {
						if (isClicked1 == false)  {
								one.setIcon(fool);
							} 
						if (isClicked2 == false) {
								two.setIcon(highpriestess);
							} 
						if (isClicked4 == false) {
								four.setIcon(strength);
							} 
						if (isClicked5 == false) {
								five.setIcon(justic);
							} 
						if (isClicked6 == false) {
								six.setIcon(hangedman);
							} 
						if (isClicked7 == false) {
								seven.setIcon(death);
							} 
						if (isClicked8 == false) {
								eight.setIcon(temperance);
							} 
						if (isClicked9 == false) {
								nine.setIcon(devil);
							} 
						if (isClicked10 == false) {
								ten.setIcon(tower);
							} 
						if (isClicked11 == false) {
								eleven.setIcon(sun);
							} 
						if (isClicked12 == false) {
								twelve.setIcon(judgment);
							} 
							
						if (main == 3 && three.getIcon() == emperor) {
							maincard.setText("Your card is : The Emperor");
							result.setText(
							"<html>If the card represents a situation, it tells the asker he has it under control thanks to his willpower,"
							+ " logic and analytical gifts – and he may be promoted or land a new job.</html>");
						}
						isClicked1 = true;
						isClicked2 = true;
						isClicked4 = true;
						isClicked5 = true;
						isClicked6 = true;
						isClicked7 = true;
						isClicked8 = true;
						isClicked9 = true;
						isClicked10 = true;
						isClicked11 = true;
						isClicked12 = true;
					}
				}
			});
		 four.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (isClicked4 == false && cntclick < 1) {
						four.setBorder(new LineBorder(Color.GRAY, 5));
						four.setIcon(strength);
						isClicked4 = true;
					} else if (isClicked4 == true || cntclick == 1) {
						JOptionPane.showMessageDialog(null, "The prediction is already done. Please shuffle.");
					} 
					if (cntclick == 0) {
						main = 4;
					}
					cntclick++;
					if (cntclick == 1) {
						if (isClicked1 == false)  {
								one.setIcon(fool);
							} 
						if (isClicked2 == false) {
								two.setIcon(highpriestess);
							} 
						if (isClicked3 == false) {
								three.setIcon(emperor);
							} 
						if (isClicked5 == false) {
								five.setIcon(justic);
							} 
						if (isClicked6 == false) {
								six.setIcon(hangedman);
							} 
						if (isClicked7 == false) {
								seven.setIcon(death);
							} 
						if (isClicked8 == false) {
								eight.setIcon(temperance);
							} 
						if (isClicked9 == false) {
								nine.setIcon(devil);
							} 
						if (isClicked10 == false) {
								ten.setIcon(tower);
							} 
						if (isClicked11 == false) {
								eleven.setIcon(sun);
							} 
						if (isClicked12 == false) {
								twelve.setIcon(judgment);
							} 
							
						if (main == 4 && four.getIcon() == strength) {
							maincard.setText("Your card is : Strength");
							result.setText(
							"<html>It says the asker is much stronger than he believes. "
							+ "If the asker has found himself in a state of depression or ill, "
							+ "it suggests he’ll regain his strength. This card can also represent mental and emotional endurance.</html>");
						}
						isClicked1 = true;
						isClicked2 = true;
						isClicked3 = true;
						isClicked5 = true;
						isClicked6 = true;
						isClicked7 = true;
						isClicked8 = true;
						isClicked9 = true;
						isClicked10 = true;
						isClicked11 = true;
						isClicked12 = true;
					}
				}
			});
		 five.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (isClicked5 == false && cntclick < 1) {
						five.setBorder(new LineBorder(Color.GRAY, 5));
						five.setIcon(justic);
						isClicked5 = true;
					} else if (isClicked5 == true || cntclick == 1) {
						JOptionPane.showMessageDialog(null, "The prediction is already done. Please shuffle.");
					} 
					if (cntclick == 0) {
						main = 5;
					}
					cntclick++;
					if (cntclick == 1) {
						if (isClicked1 == false)  {
								one.setIcon(fool);
							} 
						if (isClicked2 == false) {
								two.setIcon(highpriestess);
							} 
						if (isClicked3 == false) {
								three.setIcon(emperor);
							} 
						if (isClicked4 == false) {
								four.setIcon(strength);
							}
						if (isClicked6 == false) {
								six.setIcon(hangedman);
							} 
						if (isClicked7 == false) {
								seven.setIcon(death);
							} 
						if (isClicked8 == false) {
								eight.setIcon(temperance);
							} 
						if (isClicked9 == false) {
								nine.setIcon(devil);
							} 
						if (isClicked10 == false) {
								ten.setIcon(tower);
							} 
						if (isClicked11 == false) {
								eleven.setIcon(sun);
							} 
						if (isClicked12 == false) {
								twelve.setIcon(judgment);
							} 
							
						if (main == 5 && five.getIcon() == justic) {
							maincard.setText("Your card is : Justice");
							result.setText(
							"<html>It’s a great card to pull if the asker is starting a new relationship, "
							+ "even in business, because it shows the relationship will be harmonic and fair.</html>");
						}
						isClicked1 = true;
						isClicked2 = true;
						isClicked3 = true;
						isClicked4 = true;
						isClicked6 = true;
						isClicked7 = true;
						isClicked8 = true;
						isClicked9 = true;
						isClicked10 = true;
						isClicked11 = true;
						isClicked12 = true;
					}
				}
			});
		 six.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (isClicked6 == false && cntclick < 1) {
						six.setBorder(new LineBorder(Color.GRAY, 5));
						six.setIcon(hangedman);
						isClicked6 = true;
					} else if (isClicked6 == true || cntclick == 1) {
						JOptionPane.showMessageDialog(null, "The prediction is already done. Please shuffle.");
					} 
					if (cntclick == 0) {
						main = 6;
					}
					cntclick++;
					if (cntclick == 1) {
						if (isClicked1 == false)  {
								one.setIcon(fool);
							} 
						if (isClicked2 == false) {
								two.setIcon(highpriestess);
							} 
						if (isClicked3 == false) {
								three.setIcon(emperor);
							} 
						if (isClicked4 == false) {
								four.setIcon(strength);
							}
						if (isClicked5 == false) {
								five.setIcon(justic);
							}  
						if (isClicked7 == false) {
								seven.setIcon(death);
							} 
						if (isClicked8 == false) {
								eight.setIcon(temperance);
							} 
						if (isClicked9 == false) {
								nine.setIcon(devil);
							} 
						if (isClicked10 == false) {
								ten.setIcon(tower);
							} 
						if (isClicked11 == false) {
								eleven.setIcon(sun);
							} 
						if (isClicked12 == false) {
								twelve.setIcon(judgment);
							} 
							
						if (main == 6 && six.getIcon() == hangedman) {
							maincard.setText("Your card is : The Hanged Man");
							result.setText(
							"<html>This card represents change, but more from within than in the physical world."
							+ "The asker is in limbo, waiting for a chapter in his life to be over so he can start fresh. "
							+ "He may be in the middle of a divorce, waiting for it to be over.</html>");
						}
						isClicked1 = true;
						isClicked2 = true;
						isClicked3 = true;
						isClicked4 = true;
						isClicked5 = true;
						isClicked7 = true;
						isClicked8 = true;
						isClicked9 = true;
						isClicked10 = true;
						isClicked11 = true;
						isClicked12 = true;
					}
				}
			});
		 seven.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (isClicked7 == false && cntclick < 1) {
						seven.setBorder(new LineBorder(Color.GRAY, 5));
						seven.setIcon(death);
						isClicked7 = true;
					} else if (isClicked7 == true || cntclick == 1) {
						JOptionPane.showMessageDialog(null, "The prediction is already done. Please shuffle.");
					} 
					if (cntclick == 0) {
						main = 7;
					}
					cntclick++;
					if (cntclick == 1) {
						if (isClicked1 == false)  {
								one.setIcon(fool);
							} 
						if (isClicked2 == false) {
								two.setIcon(highpriestess);
							} 
						if (isClicked3 == false) {
								three.setIcon(emperor);
							} 
						if (isClicked4 == false) {
								four.setIcon(strength);
							}
						if (isClicked5 == false) {
								five.setIcon(justic);
							} 
						if (isClicked6 == false) {
								six.setIcon(hangedman);
							} 
						if (isClicked8 == false) {
								eight.setIcon(temperance);
							} 
						if (isClicked9 == false) {
								nine.setIcon(devil);
							} 
						if (isClicked10 == false) {
								ten.setIcon(tower);
							} 
						if (isClicked11 == false) {
								eleven.setIcon(sun);
							} 
						if (isClicked12 == false) {
								twelve.setIcon(judgment);
							} 
							
						if (main == 7 && seven.getIcon() == death) {
							maincard.setText("Your card is : Death");
							result.setText(
							"<html>This card represents change and tells the asker the old must be cleared to make space for the new.</html>");
						}
						isClicked1 = true;
						isClicked2 = true;
						isClicked3 = true;
						isClicked4 = true;
						isClicked5 = true;
						isClicked6 = true;
						isClicked8 = true;
						isClicked9 = true;
						isClicked10 = true;
						isClicked11 = true;
						isClicked12 = true;
					}
				}
			});
		 eight.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (isClicked8 == false && cntclick < 1) {
						eight.setBorder(new LineBorder(Color.GRAY, 5));
						eight.setIcon(temperance);
						isClicked8 = true;
					} else if (isClicked8 == true || cntclick == 1) {
						JOptionPane.showMessageDialog(null, "The prediction is already done. Please shuffle.");
					} 
					if (cntclick == 0) {
						main = 8;
					}
					cntclick++;
					if (cntclick == 1) {
						if (isClicked1 == false)  {
								one.setIcon(fool);
							} 
						if (isClicked2 == false) {
								two.setIcon(highpriestess);
							} 
						if (isClicked3 == false) {
								three.setIcon(emperor);
							} 
						if (isClicked4 == false) {
								four.setIcon(strength);
							}
						if (isClicked5 == false) {
								five.setIcon(justic);
							} 
						if (isClicked6 == false) {
								six.setIcon(hangedman);
							} 
						if (isClicked7 == false) {
								seven.setIcon(death);
							}
						if (isClicked9 == false) {
								nine.setIcon(devil);
							} 
						if (isClicked10 == false) {
								ten.setIcon(tower);
							} 
						if (isClicked11 == false) {
								eleven.setIcon(sun);
							} 
						if (isClicked12 == false) {
								twelve.setIcon(judgment);
							} 
							
						if (main == 8 && eight.getIcon() == temperance) {
							maincard.setText("Your card is : Temperance");
							result.setText(
							"<html>This card represents good overall health from the inside out, as well as balance in daily life."
							+ " It’s an opportunity to look inward to find the hidden treasure that is you!</html>");
						}
						isClicked1 = true;
						isClicked2 = true;
						isClicked3 = true;
						isClicked4 = true;
						isClicked5 = true;
						isClicked6 = true;
						isClicked7 = true;
						isClicked9 = true;
						isClicked10 = true;
						isClicked11 = true;
						isClicked12 = true;
					}
				}
			});
		 nine.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (isClicked9 == false && cntclick < 1) {
						nine.setBorder(new LineBorder(Color.GRAY, 5));
						nine.setIcon(devil);
						isClicked9 = true;
					} else if (isClicked9 == true || cntclick == 1) {
						JOptionPane.showMessageDialog(null, "The prediction is already done. Please shuffle.");
					} 
					if (cntclick == 0) {
						main = 9;
					}
					cntclick++;
					if (cntclick == 1) {
						if (isClicked1 == false)  {
								one.setIcon(fool);
							} 
						if (isClicked2 == false) {
								two.setIcon(highpriestess);
							} 
						if (isClicked3 == false) {
								three.setIcon(emperor);
							} 
						if (isClicked4 == false) {
								four.setIcon(strength);
							}
						if (isClicked5 == false) {
								five.setIcon(justic);
							} 
						if (isClicked6 == false) {
								six.setIcon(hangedman);
							} 
						if (isClicked7 == false) {
								seven.setIcon(death);
							} 
						if (isClicked8 == false) {
								eight.setIcon(temperance);
							}
						if (isClicked10 == false) {
								ten.setIcon(tower);
							} 
						if (isClicked11 == false) {
								eleven.setIcon(sun);
							} 
						if (isClicked12 == false) {
								twelve.setIcon(judgment);
							}
							
						if (main == 9 && nine.getIcon() == devil) {
							maincard.setText("Your card is : The Devil");
							result.setText(
							"<html>This particular card represents being a slave to something."
							+ " It can be anything from a bad attitude to an unsatisfying job. However,"
							+ " awareness of the problem will lead to self-improvement.</html>");
						}
						isClicked1 = true;
						isClicked2 = true;
						isClicked3 = true;
						isClicked4 = true;
						isClicked5 = true;
						isClicked6 = true;
						isClicked7 = true;
						isClicked8 = true;
						isClicked10 = true;
						isClicked11 = true;
						isClicked12 = true;
					}
				}
			});
		 ten.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (isClicked10 == false && cntclick < 1) {
						ten.setBorder(new LineBorder(Color.GRAY, 5));
						ten.setIcon(tower);
						isClicked10 = true;
					} else if (isClicked10 == true || cntclick == 1) {
						JOptionPane.showMessageDialog(null, "The prediction is already done. Please shuffle.");
					} 
					if (cntclick == 0) {
						main = 10;
					}
					cntclick++;
					if (cntclick == 1) {
						if (isClicked1 == false)  {
								one.setIcon(fool);
							} 
						if (isClicked2 == false) {
								two.setIcon(highpriestess);
							} 
						if (isClicked3 == false) {
								three.setIcon(emperor);
							} 
						if (isClicked4 == false) {
								four.setIcon(strength);
							} 
						if (isClicked5 == false) {
								five.setIcon(justic);
							} 
						if (isClicked6 == false) {
								six.setIcon(hangedman);
							} 
						if (isClicked7 == false) {
								seven.setIcon(death);
							} 
						if (isClicked8 == false) {
								eight.setIcon(temperance);
							} 
						if (isClicked9 == false) {
								nine.setIcon(devil);
							}
						if (isClicked11 == false) {
								eleven.setIcon(sun);
							} 
						if (isClicked12 == false) {
								twelve.setIcon(judgment);
							} 
							
						if (main == 10 && ten.getIcon() == tower) {
							maincard.setText("Your card is : The Tower");
							result.setText(
							"<html>This card signifies BIG changes, which may come like a lightning bolt from the sky!"
							+ " But this card inspires one to be positive about the changes."
							+ " In the end, you’ll be proud of how you handled the situation.</html>");
						}
						isClicked1 = true;
						isClicked2 = true;
						isClicked3 = true;
						isClicked4 = true;
						isClicked5 = true;
						isClicked6 = true;
						isClicked7 = true;
						isClicked8 = true;
						isClicked9 = true;
						isClicked11 = true;
						isClicked12 = true;
					}
				}
			});
		 eleven.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (isClicked11 == false && cntclick < 1) {
						eleven.setBorder(new LineBorder(Color.GRAY, 5));
						eleven.setIcon(sun);
						isClicked11 = true;
					} else if (isClicked11 == true || cntclick == 1) {
						JOptionPane.showMessageDialog(null, "The prediction is already done. Please shuffle.");
					} 
					if (cntclick == 0) {
						main = 11;
					}
					cntclick++;
					if (cntclick == 1) {
						if (isClicked1 == false)  {
								one.setIcon(fool);
							} 
						if (isClicked2 == false) {
								two.setIcon(highpriestess);
							} 
						if (isClicked3 == false) {
								three.setIcon(emperor);
							} 
						if (isClicked4 == false) {
								four.setIcon(strength);
							}
						if (isClicked5 == false) {
								five.setIcon(justic);
							} 
						if (isClicked6 == false) {
								six.setIcon(hangedman);
							} 
						if (isClicked7 == false) {
								seven.setIcon(death);
							} 
						if (isClicked8 == false) {
								eight.setIcon(temperance);
							} 
						if (isClicked9 == false) {
								nine.setIcon(devil);
							} 
						if (isClicked10 == false) {
								ten.setIcon(tower);
							} 
						if (isClicked12 == false) {
								twelve.setIcon(judgment);
							}
							
						if (main == 11 && eleven.getIcon() == sun) {
							maincard.setText("Your card is : The Sun");
							result.setText(
							"<html>This card also predicts love is on the way, and I know we single people love to hear that."
							+ "Furthermore, it symbolizes children. You might hear some good news about a baby or a birth."
							+ "Last but not least, The Sun also refers to material happiness and rewards in your relationship!</html>");
						}
						isClicked1 = true;
						isClicked2 = true;
						isClicked3 = true;
						isClicked4 = true;
						isClicked5 = true;
						isClicked6 = true;
						isClicked7 = true;
						isClicked8 = true;
						isClicked9 = true;
						isClicked10 = true;
						isClicked12 = true;
					}
				}
			});
		 twelve.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (isClicked12 == false && cntclick < 1) {
						twelve.setBorder(new LineBorder(Color.GRAY, 5));
						twelve.setIcon(judgment);
						isClicked12 = true;
					} else if (isClicked12 == true || cntclick == 1) {
						JOptionPane.showMessageDialog(null, "The prediction is already done. Please shuffle.");
					} 
					if (cntclick == 0) {
						main = 12;
					}
					cntclick++;
					if (cntclick == 1) {
						if (isClicked1 == false)  {
								one.setIcon(fool);
							} 
						if (isClicked2 == false) {
								two.setIcon(highpriestess);
							} 
						if (isClicked3 == false) {
								three.setIcon(emperor);
							} 
						if (isClicked4 == false) {
								four.setIcon(strength);
							}
						if (isClicked5 == false) {
								five.setIcon(justic);
							} 
						if (isClicked6 == false) {
								six.setIcon(hangedman);
							} 
						if (isClicked7 == false) {
								seven.setIcon(death);
							} 
						if (isClicked8 == false) {
								eight.setIcon(temperance);
							} 
						if (isClicked9 == false) {
								nine.setIcon(devil);
							} 
						if (isClicked10 == false) {
								ten.setIcon(tower);
							} 
						if (isClicked11 == false) {
								eleven.setIcon(sun);
							} 
						
						if (main == 12 && twelve.getIcon() == judgment) {
							maincard.setText("Your card is : Judgement");
							result.setText(
							"<html>This is a wonderful card that tells the asker he’ll get another chance and new opportunity."
							+ " He’ll have the possibility of undergoing a spiritual rebirth,"
							+ " re-evaluate experiences and forgive.</html>");
						}
						isClicked1 = true;
						isClicked2 = true;
						isClicked3 = true;
						isClicked4 = true;
						isClicked5 = true;
						isClicked6 = true;
						isClicked7 = true;
						isClicked8 = true;
						isClicked9 = true;
						isClicked10 = true;
						isClicked11 = true;
					}
				}
			});
		 
		result.setForeground(Color.MAGENTA);
		result.setFont(new Font("Angsana New", 3, 30));
		maincard.setForeground(Color.MAGENTA);
		maincard.setFont(new Font("Angsana New", 3, 30));;
		rightpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		rightpanelresult.setLayout(new GridLayout(1, 0));
		rightpanel.add(maincard);
		rightpanelresult.add(result);
		rightpanel.add(rightpanelresult);
		rightpanel.setPreferredSize(new Dimension(330, 355));
		rightpanelresult.setPreferredSize(new Dimension(310, 305));
		rightpanelresult.setBackground(Color.BLACK);
		this.setLayout(new BorderLayout());
		this.add(leftpanel, BorderLayout.WEST);
		this.add(rightpanel, BorderLayout.EAST);
	}
}