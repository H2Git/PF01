package main;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class AutoSize_ImgPanel extends JPanel {

	String imgAddress;
	ImageIcon icon;
	Image img;
	Image img_smooth;

	public AutoSize_ImgPanel(String IMGADDRESS) {
		super();
		this.imgAddress = IMGADDRESS;
		this.icon = new ImageIcon(imgAddress);
		this.img = icon.getImage();
		this.img_smooth = img.getScaledInstance(img.getWidth(null), img.getHeight(null), java.awt.Image.SCALE_SMOOTH);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(img_smooth, 0, 0, getWidth(), getHeight(), this);
	}
	
//	ImageIcon imageSetSize(ImageIcon ICON, int WITDTH, int HEIGHT) { // image Size Setting
//		Image baseImg = ICON.getImage();  //ImageIcon을 Image로 변환.
//		Image resizedImg = baseImg.getScaledInstance(WITDTH, HEIGHT, java.awt.Image.SCALE_SMOOTH);
//		ImageIcon imageIcon = new ImageIcon(resizedImg); 
//		return imageIcon;
//	}
}