package Tarot;

import java.util.*;
import javax.swing.*;
import javax.swing.ImageIcon;

import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {
	ImageHome panel = new ImageHome(new ImageIcon("bg.JPG").getImage());
	JButton general = new JButton("GENERAL");
	JButton love = new JButton("LOVE");
	Font font = new Font("arial", Font.BOLD, 25);
	
	public Home () { 
		general.setBounds(ImageHome.img.getWidth(null) / 2-95, 360 ,200 ,50);
		general.setBackground(Color.BLACK);
		general.setForeground(Color.WHITE);
		general.setFont(font);
		general.setFocusable(false);
		this.add(general);
		
		love.setBounds(ImageHome.img.getWidth(null) / 2-95, 430 ,200 ,50);
		love.setBackground(Color.BLACK);
		love.setForeground(Color.WHITE);
		love.setFont(font);
		love.setFocusable(false);
		this.add(love);
		
        this.getContentPane().add(panel);
        this.pack();
        this.setTitle("HOME");
        this.setVisible(true);
        this.setLocation(300, 50);
        this.setResizable ( false );
        
		general.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TarotGeneral f = new TarotGeneral();
				dispose();
			}
		});
		love.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TarotLove f = new TarotLove();
				dispose();
			}
		}); 
	}
}