package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class Teacher_3Upload {

	private JFrame frame;
	private JTextField textField;

	private EtchedBorder border; 

	private ButtonGroup quiz1;
	private ButtonGroup quiz2;
	private ButtonGroup quiz3;
	private ButtonGroup quiz4;

	String answer_Tr = ""; // 선생이 입력할 정답 코드들

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teacher_3Upload window = new Teacher_3Upload();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Teacher_3Upload() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(50, 50, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setUndecorated(true);

		JButton btnNewButton = new JButton("저장");
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "제출 성공");

				String answer1 = checkSelectedButton(quiz1);
				String answer2 = checkSelectedButton(quiz2);
				String answer3 = checkSelectedButton(quiz3);
				String answer4 = checkSelectedButton(quiz4);

				answer_Tr = answer1.concat(answer2).concat(answer3).concat(answer4);

				System.out.println(answer_Tr);
				frame.dispose();
			}
		});

		btnNewButton.setFont(new Font("바탕", Font.PLAIN, 25));
		btnNewButton.setBounds(773, 528, 222, 30);
		frame.getContentPane().add(btnNewButton);

		ImgPanel panel_Test = new ImgPanel();
		panel_Test.setLayout(null);
		panel_Test.setBackground(new Color(255, 204, 0));
		panel_Test.setBounds(0, 0, 540, 570);
		frame.getContentPane().add(panel_Test);

		JPanel quiz_01 = new JPanel();
		quiz_01.setLayout(null);
		quiz_01.setBackground(new Color(255, 205, 0));
		quiz_01.setBounds(543, 0, 225, 260);
		frame.getContentPane().add(quiz_01);

		JTextField quiz_01_01 = new JTextField();
		quiz_01_01.setBounds(5, 5, 215, 82);
		quiz_01.add(quiz_01_01);

		JTextField quiz_01_02 = new JTextField("");
		quiz_01_02.setBounds(5, 89, 215, 82);
		quiz_01.add(quiz_01_02);

		JTextField quiz_01_03 = new JTextField("");
		quiz_01_03.setBounds(5, 173, 215, 82);
		quiz_01.add(quiz_01_03);

		JPanel quiz_02 = new JPanel();
		quiz_02.setLayout(null);
		quiz_02.setBackground(new Color(255, 204, 0));
		quiz_02.setBounds(773, 0, 225, 260);
		frame.getContentPane().add(quiz_02);

		JTextField quiz_02_01 = new JTextField("");
		quiz_02_01.setBounds(5, 5, 215, 82);
		quiz_02.add(quiz_02_01);

		JTextField quiz_02_02 = new JTextField("");
		quiz_02_02.setBounds(5, 89, 215, 82);
		quiz_02.add(quiz_02_02);

		JTextField quiz_02_03 = new JTextField("");
		quiz_02_03.setBounds(5, 173, 215, 82);
		quiz_02.add(quiz_02_03);

		JPanel quiz_03 = new JPanel();
		quiz_03.setLayout(null);
		quiz_03.setBackground(new Color(255, 204, 0));
		quiz_03.setBounds(543, 262, 225, 260);
		frame.getContentPane().add(quiz_03);

		JTextField quiz_03_01 = new JTextField("");
		quiz_03_01.setBounds(5, 2, 215, 82);
		quiz_03.add(quiz_03_01);

		JTextField quiz_03_02 = new JTextField("");
		quiz_03_02.setBounds(5, 86, 215, 82);
		quiz_03.add(quiz_03_02);

		JTextField quiz_03_03 = new JTextField("");
		quiz_03_03.setBounds(5, 172, 215, 82);
		quiz_03.add(quiz_03_03);

		JPanel quiz_04 = new JPanel();
		quiz_04.setLayout(null);
		quiz_04.setBackground(new Color(255, 204, 0));
		quiz_04.setBounds(773, 262, 225, 260);
		frame.getContentPane().add(quiz_04);

		JTextField quiz_04_01 = new JTextField("");
		quiz_04_01.setBounds(5, 2, 215, 82);
		quiz_04.add(quiz_04_01);

		JTextField quiz_04_02 = new JTextField("");
		quiz_04_02.setBounds(5, 86, 215, 82);
		quiz_04.add(quiz_04_02);

		JTextField quiz_04_03 = new JTextField("");
		quiz_04_03.setBounds(5, 172, 215, 82);
		quiz_04.add(quiz_04_03);

		JPanel imagePanel = new JPanel();
		imagePanel.setBounds(0, 0, 523, 517);
		frame.getContentPane().add(imagePanel);
//		border = new EtchedBorder(EtchedBorder.LOWERED);
//		imagePanel.setBorder(border);
		
		GhostText ghostText1 = new GhostText(quiz_01_01, "문제를 입력하세요");
		quiz_01_01.setPreferredSize(new Dimension(200, 0));
		
		GhostText ghostText2 = new GhostText(quiz_01_02, "문제를 입력하세요");
		quiz_01_02.setPreferredSize(new Dimension(200, 0));
		
		GhostText ghostText3 = new GhostText(quiz_01_03, "문제를 입력하세요");
		quiz_01_03.setPreferredSize(new Dimension(200, 0));

		JButton btnNewButton_1 = new JButton("파일 올리기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Uupload.main(null);
			}
		});
		btnNewButton_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_1.setFont(new Font("바탕", Font.PLAIN, 25));
		btnNewButton_1.setBounds(543, 528, 220, 30);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("종료");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_2.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_2.setFont(new Font("바탕", Font.PLAIN, 25));
		btnNewButton_2.setBounds(773, 563, 222, 30);
		frame.getContentPane().add(btnNewButton_2);

//		JButton btnNewButton_1 = new JButton("열기");
//		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 25));
//		btnNewButton_1.setBounds(430, 532, 221, 33);
//		frame.getContentPane().add(btnNewButton_1);

	}

	public String checkSelectedButton(ButtonGroup buttonGroup) {

		String temp = "";

		for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
			AbstractButton button = buttons.nextElement();

			if (button.isSelected()) {
				temp += "1";
			} else
				temp += "0";
		}

		return temp;
	}

	class ImgPanel extends JPanel {

		ImageIcon icon = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\Java\\Project1\\src\\image\\noimage.gif");
		Image img = icon.getImage();
		Image img_smooth = img.getScaledInstance(img.getWidth(null), img.getHeight(null), java.awt.Image.SCALE_SMOOTH);

		public void paintComponent(Graphics g) {
			g.drawImage(img_smooth, 0, 0, getWidth(), getWidth(), this);
		}
	}
}