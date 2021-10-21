package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

//import Studnet_Test;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Teacher_1Main {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;

	private JComboBox comboxtitle;
	private JComboBox comboxsubject;
	private JComboBox comboxchapter;
	private JComboBox comboxstudent;
	private JComboBox comboxstudent2;
	private JComboBox comboxaward;

	String[] title = { "지능형 빅데이터 분석서비스", "스마트그리드 IoT융합 SW전문가 과정", "머신러닝 빅데이터 응용 전문가 과정", "빅데이터 융합 SW 개발자과정" };
	String[] subject = { "JAVA", "HTML", "R", "DB", "PYTHONE", "CRAWLING", "BIG DATA", "Web Sever", "IoT" };
	String[] chapter = { "ja01", "ja02", "ja03", "ja04", "ja05", "ja06", "ja07", "ja08", "ja09", "ja10" };
	String[] student = { "최상문", "김예슬", "노은지", "박우현" };

	String[] award = { "1차 프로젝트", "2차 프로젝트", "3차 프로젝트", "타이타닉", "자바 페스티벌", "파이썬페스티벌", "모두모여 페스티벌", "자바시험", "캐글",
			"캡틴마블" };
	private JLabel lblNewLabel;
	private JTextField textField;
	private EtchedBorder border = null;
	static String loginID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println(loginID);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teacher_1Main window = new Teacher_1Main();
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
	public Teacher_1Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 0, 0, 0));
		frame.setBounds(50, 50, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setUndecorated(true);

		comboxtitle = new JComboBox(title);
		comboxtitle.setBounds(10, 27, 348, 41);
		comboxtitle.setBackground(new Color(227, 222, 222));
		comboxtitle.setFont(new Font("굴림", Font.PLAIN, 25));

		comboxsubject = new JComboBox(subject);
		comboxsubject.setBounds(12, 10, 352, 30);
		comboxsubject.setBackground(new Color(227, 222, 222));
		comboxsubject.setFont(new Font("굴림", Font.PLAIN, 20));

		comboxchapter = new JComboBox(chapter);
		comboxchapter.setBounds(12, 50, 352, 30);
		comboxchapter.setBackground(new Color(227, 222, 222));
		comboxchapter.setFont(new Font("굴림", Font.PLAIN, 20));

		comboxstudent = new JComboBox(student);
		
		comboxstudent.setBounds(12, 90, 154, 30);
		comboxstudent.setBackground(new Color(227, 222, 222));
		comboxstudent.setFont(new Font("굴림", Font.PLAIN, 20));

		comboxstudent2 = new JComboBox(student);
		comboxstudent2.setBounds(12, 50, 154, 30);
		comboxstudent2.setBackground(new Color(227, 222, 222));
		comboxstudent2.setFont(new Font("굴림", Font.PLAIN, 20));

		comboxaward = new JComboBox(award);
		comboxaward.setBounds(12, 10, 352, 30);
		comboxaward.setBackground(new Color(227, 222, 222));
		comboxaward.setFont(new Font("굴림", Font.PLAIN, 20));

		textField_1 = new JTextField();
		textField_1.setBounds(178, 90, 186, 30);

		textField_1.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 82, 372, 508);
		frame.getContentPane().add(panel_1);
		panel_1.setBackground(new Color(255, 0, 0, 0));
		panel_1.setLayout(null);
		panel_1.add(comboxtitle);

		JPanel panel = new JPanel();
		panel.setBounds(0, 92, 372, 236);
		panel.add(comboxsubject);
		panel.add(comboxchapter);
		panel.add(comboxstudent);
		panel.add(textField_1);
		panel_1.add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(255, 0, 0, 0));

		GhostText ghostText = new GhostText(textField_1, "학생 점수 입력2 ");
		textField_1.setPreferredSize(new Dimension(160, 0));
		
		JButton btnNewButton = new JButton("점수 입력2");
		btnNewButton.setBounds(178, 130, 186, 30);
		panel.add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				
				
				GetScore_DAO dao = new GetScore_DAO();
				dao.insert3(textField_1.getText(),comboxstudent.getSelectedItem().toString(),comboxchapter.getSelectedItem().toString());
				

			}
		});
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 0, 0, 0));
		panel_3.setLayout(null);
		panel_3.setBounds(0, 324, 372, 184);
		panel_3.add(comboxaward);
		panel_3.add(comboxstudent2);
		panel_1.add(panel_3);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(178, 50, 186, 30);
		panel_3.add(textField_2);
		
		

		
		JButton btnNewButton_2 = new JButton("문제 입력");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Teacher_3Upload.main(null);
			}
		});
		btnNewButton_2.setBounds(178, 169, 186, 30);
		panel.add(btnNewButton_2);

		GhostText ghostText1 = new GhostText(textField_2, "학생 점수 입력 ");
		textField_2.setPreferredSize(new Dimension(160, 30));

		JButton btnNewButton_1 = new JButton("점수 입력");
		btnNewButton_1.setBounds(178, 90, 186, 30);
		panel_3.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println();
				
				System.out.println(comboxaward.getSelectedItem().toString());
				
				System.out.println(comboxstudent2.getSelectedItem().toString());
				
				String aw = "";
				
				if (comboxaward.getSelectedItem().toString().equals("1차 프로젝트")) {
					aw = "11";
				}else if(comboxaward.getSelectedItem().toString().equals("2차 프로젝트")) {
					aw = "12";
				}else if(comboxaward.getSelectedItem().toString().equals("3차 프로젝트")) {
					aw = "13";
				}
				
				
				
				GetScore_DAO dao = new GetScore_DAO();
				dao.insert4(textField_2.getText(), comboxstudent2.getSelectedItem().toString(), aw);
				

			}
		});

		JButton btn_StudentList = new JButton("학생 정보 수정");
		btn_StudentList.setBounds(178, 130, 186, 30);
		panel_3.add(btn_StudentList);
		btn_StudentList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Teacher_4List.main(null);
			}
		});
		btn_StudentList.setToolTipText("학생들의 상세정보 수정하기 위한 페이지 입니다.");
//		btn_StudentList.setBackground(new Color(255, 0, 0, 0));
//		btn_StudentList.setPressedIcon(null);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(10, 10, 972, 67);
		frame.getContentPane().add(panel_2_1);
		panel_2_1.setLayout(null);

		lblNewLabel = new JLabel("연구원 메인 페이지");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(12, 10, 365, 47);
		panel_2_1.add(lblNewLabel);

		JPanel panel_Chart = new JPanel();
		panel_Chart.setLayout(null);
		panel_Chart.setBackground(Color.WHITE);
		panel_Chart.setBounds(392, 82, 590, 508);
		frame.getContentPane().add(panel_Chart);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\Java\\Project1\\src\\image\\11.png"));
		lblNewLabel_1.setBounds(-26, 0, 1026, 600);
		frame.getContentPane().add(lblNewLabel_1);

		border = new EtchedBorder();
		lblNewLabel_1.setBorder(border);

		PolylineBarChart3 demo = new PolylineBarChart3();
		JFreeChart chart = demo.getChart();
		ChartPanel cp = new ChartPanel(chart);
		cp.setSize(590, 508);
		frame.add(cp);
		panel_Chart.add(cp);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(975, 10, 15, 8);
		frame.getContentPane().add(textField);

		textField.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				frame.dispose();

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}
}