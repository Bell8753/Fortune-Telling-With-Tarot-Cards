package Tarot;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

class ImageHome extends JPanel {
	  static Image img;

	  public ImageHome(String img) { 
	    this(new ImageIcon(img).getImage()); 
	  }

	  public ImageHome(Image img) { 
	    this.img = img;
	    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
	    setPreferredSize(size);
	    setMinimumSize(size);
	    setMaximumSize(size);
	    setSize(size);
	    setLayout(null);
	  }

	  public void paintComponent(Graphics g) { 
		Font f = new Font("arial", Font.BOLD, 55);
	    g.drawImage(img, 0, 0, null);
		g.setFont(f);
		g.setColor(Color.white);
		g.drawString("Fortune Telling With Tarot Cards", ImageHome.img.getWidth(null) / 40,120); 
	  }	  
}