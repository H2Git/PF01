package main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class Student_2Test {

	/* 기본 맴버 */
	private JFrame frame;
	private EtchedBorder border;
	static String loginID;
	/**/

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
					Student_2Test window = new Student_2Test();
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
	public Student_2Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		/* 기본 요소 */
		frame = new JFrame();
		frame.setBackground(SystemColor.textHighlight);
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 50, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		/**/frame.setUndecorated(true);
		/**/frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);

		border = new EtchedBorder(EtchedBorder.LOWERED);
		JLabel Background_BorderLabel = new JLabel("");
		Background_BorderLabel.setBounds(0, 0, 1000, 600);
		Background_BorderLabel.setBorder(border);
		/**/frame.getContentPane().add(Background_BorderLabel);

		JButton Exit_Button = new AutoSize_ImgButton("..\\Project\\src\\images\\close_Grey.png");
		Exit_Button.setBounds(973, 5, 20, 20);
		/**/frame.getContentPane().add(Exit_Button);

		Exit_Button.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				frame.dispose();
			}

		});
		/* 기본 요소 */

		JButton btnNewButton = new JButton("저장");
		btnNewButton.setBackground(new Color(230, 230, 230));
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
		btnNewButton.setBounds(768, 557, 222, 33);
		frame.getContentPane().add(btnNewButton);

		AutoSize_ImgPanel panel_Test = new AutoSize_ImgPanel("..\\Project\\src\\images\\quiz.jpg");
		panel_Test.setLayout(null);
		panel_Test.setBackground(new Color(255, 190, 0));
		panel_Test.setBounds(2, 2, 530, 594);
		frame.getContentPane().add(panel_Test);

		JPanel quiz_01 = new JPanel();
		quiz_01.setLayout(null);
		quiz_01.setBackground(new Color(255, 205, 0));
		quiz_01.setBounds(535, 32, 225, 260);


		JRadioButton quiz_01_01 = new JRadioButton("1번");
		quiz_01_01.setBounds(5, 5, 215, 82);
		quiz_01.add(quiz_01_01);

		JRadioButton quiz_01_02 = new JRadioButton("2번");
		quiz_01_02.setBounds(5, 89, 215, 82);
		quiz_01.add(quiz_01_02);

		JRadioButton quiz_01_03 = new JRadioButton("3번");
		quiz_01_03.setBounds(5, 173, 215, 82);
		quiz_01.add(quiz_01_03);

		quiz1 = new ButtonGroup();
		quiz1.add(quiz_01_01);
		quiz1.add(quiz_01_02);
		quiz1.add(quiz_01_03);

		JPanel quiz_02 = new JPanel();
		quiz_02.setLayout(null);
		quiz_02.setBackground(new Color(255, 204, 0));
		quiz_02.setBounds(765, 32, 225, 260);

		JRadioButton quiz_02_01 = new JRadioButton("1번");
		quiz_02_01.setBounds(5, 5, 215, 82);
		quiz_02.add(quiz_02_01);

		JRadioButton quiz_02_02 = new JRadioButton("2번");
		quiz_02_02.setBounds(5, 89, 215, 82);
		quiz_02.add(quiz_02_02);

		JRadioButton quiz_02_03 = new JRadioButton("3번");
		quiz_02_03.setBounds(5, 173, 215, 82);
		quiz_02.add(quiz_02_03);

		quiz2 = new ButtonGroup();
		quiz2.add(quiz_02_01);
		quiz2.add(quiz_02_02);
		quiz2.add(quiz_02_03);

		JPanel quiz_03 = new JPanel();
		quiz_03.setLayout(null);
		quiz_03.setBackground(new Color(255, 204, 0));
		quiz_03.setBounds(535, 294, 225, 260);

		JRadioButton quiz_03_01 = new JRadioButton("1번");
		quiz_03_01.setBounds(5, 2, 215, 82);
		quiz_03.add(quiz_03_01);

		JRadioButton quiz_03_02 = new JRadioButton("2번");
		quiz_03_02.setBounds(5, 86, 215, 82);
		quiz_03.add(quiz_03_02);

		JRadioButton quiz_03_03 = new JRadioButton("3번");
		quiz_03_03.setBounds(5, 172, 215, 82);
		quiz_03.add(quiz_03_03);

		quiz3 = new ButtonGroup();
		quiz3.add(quiz_03_01);
		quiz3.add(quiz_03_02);
		quiz3.add(quiz_03_03);

		JPanel quiz_04 = new JPanel();
		quiz_04.setLayout(null);
		quiz_04.setBackground(new Color(255, 204, 0));
		quiz_04.setBounds(765, 294, 225, 260);

		JRadioButton quiz_04_01 = new JRadioButton("1번");
		quiz_04_01.setBounds(5, 2, 215, 82);
		quiz_04.add(quiz_04_01);

		JRadioButton quiz_04_02 = new JRadioButton("2번");
		quiz_04_02.setBounds(5, 86, 215, 82);
		quiz_04.add(quiz_04_02);

		JRadioButton quiz_04_03 = new JRadioButton("3번");
		quiz_04_03.setBounds(5, 172, 215, 82);
		quiz_04.add(quiz_04_03);

		quiz4 = new ButtonGroup();
		quiz4.add(quiz_04_01);
		quiz4.add(quiz_04_02);
		quiz4.add(quiz_04_03);
		
		frame.getContentPane().add(quiz_01);
		frame.getContentPane().add(quiz_02);
		frame.getContentPane().add(quiz_03);
		frame.getContentPane().add(quiz_04);

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

}