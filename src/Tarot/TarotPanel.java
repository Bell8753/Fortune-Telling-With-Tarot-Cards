package Tarot;

import javax.swing.JButton;
import javax.swing.JLabel;

public interface TarotPanel {
	
	public JLabel getMaincard();
	public JLabel getResult();
	public int getMain();
	
	public void setClicked1(boolean isClicked1);
	public void setClicked2(boolean isClicked2);
	public void setClicked3(boolean isClicked3);
	public void setClicked4(boolean isClicked4);
	public void setClicked5(boolean isClicked5);
	public void setClicked6(boolean isClicked6);
	public void setClicked7(boolean isClicked7);
	public void setClicked8(boolean isClicked8);

	public JButton getOne();
	public JButton getTwo();
	public JButton getThree();
	public JButton getFour();
	public JButton getFive();
	public JButton getSix();
	public JButton getSeven();
	public JButton getEight();

	public void setCntclick(int cntclick);
	public int getCntclick();
	
	public void shuffle();
}