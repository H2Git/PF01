package main;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class AutoSize_ImgButton extends JButton {

	String imgAddress;
	ImageIcon icon;
	Image img;
	Image img_smooth;

	public AutoSize_ImgButton(String IMGADDRESS) {
		super();
		this.imgAddress = IMGADDRESS;
		this.icon = new ImageIcon(imgAddress);
		this.img = icon.getImage();
		this.img_smooth = img.getScaledInstance(img.getWidth(null), img.getHeight(null), java.awt.Image.SCALE_SMOOTH);		
		this.icon = new ImageIcon(img_smooth);
	}

	
//	String pressed_imgAddress;
//	ImageIcon pressed_icon;
//	Image pressed_img;
//	Image pressed_img_smooth;
//	int pressed_offset;
//	public AutoSize_ImgButton(String IMGADDRESS, String PRESSED_IMGADDRESS) {
//		super();
//		this.imgAddress = IMGADDRESS;
//		this.icon = new ImageIcon(imgAddress);
//		this.img = icon.getImage();
//		this.img_smooth = img.getScaledInstance(img.getWidth(null), img.getHeight(null), java.awt.Image.SCALE_SMOOTH);		
//		this.icon = new ImageIcon(img_smooth);
//		
//		this.pressed_imgAddress = IMGADDRESS;
//		this.pressed_icon = new ImageIcon(pressed_imgAddress);
//		this.pressed_img = pressed_icon.getImage();
//		this.pressed_img_smooth = pressed_img.getScaledInstance(pressed_img.getWidth(null), pressed_img.getHeight(null), java.awt.Image.SCALE_SMOOTH);		
//		this.pressed_icon = new ImageIcon(pressed_img_smooth);
//		this.setPressedIcon(pressed_icon);
//		
//		
//	}

	public void paintComponent(Graphics g) {
		g.drawImage(img_smooth, 0, 0, getWidth(), getHeight(), this);
//		g.drawImage(pressed_img_smooth, 0, 0, getWidth(), getHeight(), this);
	}
}