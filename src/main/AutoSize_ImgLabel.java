package main;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AutoSize_ImgLabel extends JLabel{
	
	String imgAddress;
	ImageIcon icon;
	Image img;
	Image img_smooth;

	public AutoSize_ImgLabel(String IMGADDRESS) {
		super();
		this.imgAddress = IMGADDRESS;
		this.icon = new ImageIcon(imgAddress);
		this.img = icon.getImage();
		this.img_smooth = img.getScaledInstance(img.getWidth(null), img.getHeight(null), java.awt.Image.SCALE_SMOOTH);
	}
	public void paintComponent(Graphics g) {
		g.drawImage(img_smooth, 0, 0, getWidth(), getWidth(), this);
	}
}