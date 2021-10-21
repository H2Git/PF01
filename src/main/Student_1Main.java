package main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Student_1Main {

	/* 기본 맴버 */
	private JFrame frame;
	private EtchedBorder border;
	static String loginID;

	public static void main(String[] args) {

		System.out.println("All_Login 에서 Student_1Main으로 아이디 넘어오는지 확인 >> " + loginID);

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_1Main window = new Student_1Main();
					window.frame.setVisible(true);

					int result = JOptionPane.showConfirmDialog(null, "최초 로그인입니다. 비밀번호를 변경하시겠습니까?", "Confirm", JOptionPane.YES_NO_OPTION);if (result == JOptionPane.YES_OPTION)
						AccountView.main(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});


	}

	/**
	 * Create the application.
	 */
	public Student_1Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	void initialize() {

		frame = new JFrame();
		frame.setBackground(SystemColor.textHighlight);
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 50, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		/**/frame.setUndecorated(true);
		/**/frame.getContentPane().setLayout(null);

		JLabel Subject_GroupLabel = new JLabel();
		Subject_GroupLabel.setBounds(30, 86, 710, 504);
		Subject_GroupLabel.setBackground(new Color(255, 0, 0, 0));
		Subject_GroupLabel.setLayout(null);
		/**/frame.getContentPane().add(Subject_GroupLabel);

		RoundedButton Subject01 = new RoundedButton("Java");
		Subject01.setVerticalAlignment(SwingConstants.BOTTOM);
		Subject01.setBackground(new Color(163, 218, 255, 70));
		Subject01.setFont(new Font("Consolas", Font.BOLD, 70));
		Subject01.setBounds(0, 72, 235, 178);
		Subject01.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {

				Student_2Subject.loginID = loginID;
				Student_2Subject.main(null);
				PolylineBarChart1.loginID = loginID;
			}

		});
		Subject_GroupLabel.add(Subject01);

		RoundedButton Subject02 = new RoundedButton("DB");
		Subject02.setVerticalAlignment(SwingConstants.BOTTOM);
		Subject02.setBackground(new Color(212, 250, 255, 160));
		Subject02.setFont(new Font("Consolas", Font.BOLD, 80));
		Subject02.setBounds(238, 72, 235, 178);
		Subject_GroupLabel.add(Subject02);

		RoundedButton Subject03 = new RoundedButton("HTML");
		Subject03.setVerticalAlignment(SwingConstants.BOTTOM);
		Subject03.setBounds(475, 72, 235, 178);
		Subject03.setBackground(new Color(255, 218, 142, 40));
		Subject03.setFont(new Font("Consolas", Font.BOLD, 75));
		Subject_GroupLabel.add(Subject03);

		RoundedButton Subject04 = new RoundedButton("JSP");
		Subject04.setVerticalAlignment(SwingConstants.BOTTOM);
		Subject04.setFont(new Font("Consolas", Font.BOLD, 70));
		Subject04.setBackground(new Color(165, 223, 249, 60));
		Subject04.setBounds(0, 285, 235, 178);
		Subject_GroupLabel.add(Subject04);

		RoundedButton Subject05 = new RoundedButton("PYTHON");
		Subject05.setVerticalAlignment(SwingConstants.BOTTOM);
		Subject05.setFont(new Font("Consolas", Font.BOLD, 65));
		Subject05.setBackground(new Color(207, 240, 218, 90));
		Subject05.setBounds(238, 285, 235, 178);
		Subject_GroupLabel.add(Subject05);

		RoundedButton Subject06 = new RoundedButton("IoT");
//		Subject06.setVerticalAlignment(SwingConstants.BOTTOM);
		Subject06.setFont(new Font("Consolas", Font.BOLD, 70));
		Subject06.setBackground(new Color(170, 171, 211, 40));
		Subject06.setBounds(475, 285, 235, 178);
		Subject_GroupLabel.add(Subject06);

		JLabel Subject_Main = new JLabel("수강 목록");
		Subject_Main.setHorizontalAlignment(SwingConstants.CENTER);
		Subject_Main.setFont(new Font("굴림", Font.PLAIN, 35));
		Subject_Main.setBounds(259, 10, 198, 52);
		Subject_GroupLabel.add(Subject_Main);

		RoundedButton awardPage_Button = new RoundedButton("장학금");
		awardPage_Button.setVerticalAlignment(SwingConstants.BOTTOM);
		awardPage_Button.setFont(new Font("굴림", Font.PLAIN, 23));
		awardPage_Button.setBounds(566, 22, 134, 30);
		Subject_GroupLabel.add(awardPage_Button);
		awardPage_Button.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				Student_3Award.main(null);
			}

		});

		JPanel event_GroupPanel = new JPanel();
		event_GroupPanel.setLayout(null);
		event_GroupPanel.setBackground(new Color(255, 0, 0, 0));
		event_GroupPanel.setBounds(740, 86, 258, 504);
		frame.getContentPane().add(event_GroupPanel);

		JLabel lblNewLabel = new JLabel("EVENT");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setFont(new Font("Consolas", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 238, 55);
		event_GroupPanel.add(lblNewLabel);

		JPanel event_01 = new JPanel();
		event_01.setBackground(Color.WHITE);
		event_01.setBounds(22, 75, 215, 89);
		event_GroupPanel.add(event_01);
		event_01.setLayout(null);
		event_01.setBackground(new Color(232, 244, 252, 160));
		JLabel event1_name = new JLabel("   자바칩");
		event1_name.setBounds(0, 0, 213, 49);
		event_01.add(event1_name);
		event1_name.setFont(new Font("돋움", Font.BOLD, 20));

		JLabel event1_details = new JLabel("6/14   시상+상금 20만원");
		event1_details.setFont(new Font("돋움체", Font.PLAIN, 13));
		event1_details.setBounds(65, 48, 148, 41);
		event_01.add(event1_details);

		JPanel event_02 = new JPanel();
		event_02.setBackground(new Color(232, 244, 252, 160));
		event_02.setLayout(null);
		event_02.setBounds(22, 178, 215, 89);
		event_GroupPanel.add(event_02);

		JLabel event2_name = new JLabel("   1차 프로젝트");
		event2_name.setFont(new Font("돋움", Font.BOLD, 20));
		event2_name.setBounds(0, 0, 213, 49);
		event_02.add(event2_name);

		JLabel event2_details = new JLabel(" 6/28  시상+상금 20만원");
		event2_details.setFont(new Font("돋움체", Font.PLAIN, 13));
		event2_details.setBounds(58, 48, 155, 41);
		event_02.add(event2_details);

		JPanel event_03 = new JPanel();
		event_03.setBackground(new Color(232, 244, 252, 160));
		event_03.setLayout(null);
		event_03.setBounds(22, 277, 215, 89);
		event_GroupPanel.add(event_03);

		JLabel event3_name = new JLabel("   캐글링 ");
		event3_name.setFont(new Font("돋움", Font.BOLD, 20));
		event3_name.setBounds(0, 0, 213, 49);
		event_03.add(event3_name);

		JLabel lblNewLabel_5_1_2 = new JLabel("7/8   시상+상금 20만원");
		lblNewLabel_5_1_2.setFont(new Font("돋움체", Font.PLAIN, 13));
		lblNewLabel_5_1_2.setBounds(65, 48, 148, 41);
		event_03.add(lblNewLabel_5_1_2);

		JPanel event_04 = new JPanel();
		event_04.setBackground(new Color(232, 244, 252, 160));
		event_04.setLayout(null);
		event_04.setBounds(22, 376, 215, 89);
		event_GroupPanel.add(event_04);

		JLabel event4_name = new JLabel("   2차 프로젝트");
		event4_name.setFont(new Font("돋움", Font.BOLD, 20));
		event4_name.setBounds(0, 0, 213, 49);
		event_04.add(event4_name);

		JLabel event4_details = new JLabel("8/22  시상+상금 20만원");
		event4_details.setFont(new Font("돋움체", Font.PLAIN, 13));
		event4_details.setBounds(65, 48, 148, 41);
		event_04.add(event4_details);

		goToAwardPage(event_01);
		goToAwardPage(event_02);
		goToAwardPage(event_03);
		goToAwardPage(event_04);

		JLabel lblNewLabel_1 = new JLabel("빅데이터 분석 서비스 개발자과정");
		lblNewLabel_1.setBounds(10, 17, 710, 66);
		/**/frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(255, 0, 0, 0));
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 35));

		JLabel account_Label = new JLabel("최상문");
		account_Label.setBounds(790, 23, 200, 50);
		account_Label.setBackground(new Color(255, 0, 0, 0));
		account_Label.setLayout(null);
		account_Label.setFont(new Font("굴림", Font.PLAIN, 20));
		/**/frame.getContentPane().add(account_Label);

		RoundedButton Account_Icon = new RoundedButton("나의 정보");
		Account_Icon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AccountView.loginID = loginID;
				AccountView.main(null);
			}
		});
		Account_Icon.setBounds(70, 5, 70, 37);
		Account_Icon.setBackground(new Color(212, 223, 222, 160));
		Subject01.setVerticalAlignment(SwingConstants.BOTTOM);
		account_Label.add(Account_Icon);

		JLabel Background_imgLabel = new JLabel("");
		Background_imgLabel.setBackground(Color.LIGHT_GRAY);
		Background_imgLabel.setIcon(new ImageIcon("..\\Project\\src\\images\\gg.png"));
		Background_imgLabel.setBounds(-30, 20, 1000, 600);
		/**/frame.getContentPane().add(Background_imgLabel);

		border = new EtchedBorder(EtchedBorder.LOWERED);
		JLabel Background_BorderLabel = new JLabel("");
		Background_BorderLabel.setBounds(0, 0, 1000, 600);
		Background_BorderLabel.setBorder(border);
		/**/frame.getContentPane().add(Background_BorderLabel);

		JButton Exit_Button = new AutoSize_ImgButton("..\\Project\\src\\images\\close.png");
		Exit_Button.setBounds(960, 10, 25, 25);
		/**/frame.getContentPane().add(Exit_Button);

		Exit_Button.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				frame.dispose();
			}

		});

		JPanel line_panel2 = new JPanel();
		line_panel2.setBackground(Color.LIGHT_GRAY);
		line_panel2.setBounds(750, 18, 1, 572);
		/**/frame.getContentPane().add(line_panel2);

		JPanel line_panel1 = new JPanel();
		line_panel1.setBackground(Color.LIGHT_GRAY);
		line_panel1.setBounds(15, 88, 957, 1);
		/**/frame.getContentPane().add(line_panel1);

	}

	public void goToAwardPage(JPanel awardPage_Button) {
		awardPage_Button.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				Student_3Award.main(null);
			}

		});
	}

}