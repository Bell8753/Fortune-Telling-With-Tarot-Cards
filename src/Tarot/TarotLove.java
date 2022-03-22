package Tarot;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class TarotLove extends JFrame {
	private ImageIcon back = new ImageIcon("Backplatev.jpg");
	JPanel TarotResult = new JPanel();
	TarotLovePanel TarotPanel = new TarotLovePanel();
	JButton shuf = new JButton("SHUFFLE");
	JButton home = new JButton("HOME");
	JLabel maincard = new JLabel("Your main card is : ");
	JLabel supportcard = new JLabel("Your supporting card is : ");
	JLabel result = new JLabel("");

	public TarotLove() {
		shuf.setBackground(new Color(255, 221, 3));
		shuf.setFocusable(false);
		home.setBackground(new Color(255, 221, 3));
		home.setFocusable(false);
		this.setTitle("Select 2 Cards To Predict Your Love");
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(200, 50);
		this.setLayout(new BorderLayout());
		this.add(TarotPanel, BorderLayout.CENTER);
		this.add(TarotResult, BorderLayout.EAST);
		this.add(shuf, BorderLayout.SOUTH);
		this.add(home, BorderLayout.NORTH);
		this.pack();
		TarotPanel.setBackground(Color.BLACK);
		
		shuf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TarotPanel.getOne().setIcon(back);
				TarotPanel.getTwo().setIcon(back);
				TarotPanel.getThree().setIcon(back);
				TarotPanel.getFour().setIcon(back);
				TarotPanel.getFive().setIcon(back);
				TarotPanel.getSix().setIcon(back);
				TarotPanel.getSeven().setIcon(back);
				TarotPanel.getEight().setIcon(back);
				TarotPanel.getOne().setBorder(null);
				TarotPanel.getTwo().setBorder(null);
				TarotPanel.getThree().setBorder(null);
				TarotPanel.getFour().setBorder(null);
				TarotPanel.getFive().setBorder(null);
				TarotPanel.getSix().setBorder(null);
				TarotPanel.getSeven().setBorder(null);
				TarotPanel.getEight().setBorder(null);
				TarotPanel.getResult().setText("");
				TarotPanel.getMaincard().setText("");
				TarotPanel.getSupportcard().setText("");
				TarotPanel.shuffle();
				TarotPanel.setClicked1(false);
				TarotPanel.setClicked2(false);
				TarotPanel.setClicked3(false);
				TarotPanel.setClicked4(false);
				TarotPanel.setClicked5(false);
				TarotPanel.setClicked6(false);
				TarotPanel.setClicked7(false);
				TarotPanel.setClicked8(false);
				TarotPanel.setCntclick(0);	
			}
		});
		home.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Home startgame = new Home();
				dispose();
			}
		});
	}
}