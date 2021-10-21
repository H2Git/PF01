package main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

//import Studnet_Test;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JTextField;

public class Student_2Subject {

	/* 기본 맴버 */
	private JFrame frame;
	private EtchedBorder border;
	static String loginID;
	/**/
	private JTextField textField;
	private JPanel graph01_Label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("student main 에서 Student_2Subject 으로 아이디 넘어오는지 확인 >> " + loginID);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_2Subject window = new Student_2Subject();
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
	public Student_2Subject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		/*기본 요소*/
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
		
		JButton Exit_Button = new AutoSize_ImgButton("..\\Project\\src\\images\\close.png");
		Exit_Button.setBounds(965, 10, 25, 25);
		/**/frame.getContentPane().add(Exit_Button);

		Exit_Button.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				frame.dispose();
			}

		});
		/*기본 요소*/

		JLabel subject_NamePanel = new JLabel();
		subject_NamePanel.setHorizontalAlignment(SwingConstants.CENTER);
		subject_NamePanel.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 40));
		subject_NamePanel.setText("Java");
		subject_NamePanel.setBackground(Color.WHITE);
		subject_NamePanel.setBounds(10, 10, 342, 63);
		frame.getContentPane().add(subject_NamePanel);
		subject_NamePanel.setLayout(null);

		JLabel chapter_GroupLabel = new JLabel();
		chapter_GroupLabel.setBounds(10, 83, 342, 507);
		chapter_GroupLabel.setBackground(new Color(255, 0, 0, 0));
		chapter_GroupLabel.setLayout(null);
		frame.getContentPane().add(chapter_GroupLabel);

		// 아직 DB 에 넣지 못한 과목 목록 > DB에서 가져오기 기능 추가
		String[] chapterName = { "Ch.1. 자바 기본 프로그래밍", "Ch.2. 반복문과 배열", "Ch.3. 클래스와 객체", "Ch.4. 상속", "Ch.5 모듈과 패키지 개념",
				"Ch.6. 제네릭과 커넥션", "Ch.7. 입출력 스트림", "Ch.8. 자바 GUI 기초", "Ch.9. 자바 이벤트 처리", "Ch.10. 스윙 컴포넌트" };

		// chapter 10개 만들기

		int yAxis = 0;

		for (int i = 0; i < chapterName.length; i++) {
			RoundedButton Chapter = new RoundedButton(chapterName[i]);
			Chapter.setHorizontalAlignment(SwingConstants.LEFT);
			Chapter.setBackground(new Color(163, 218, 255, 70));
			Chapter.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 13));
			Chapter.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Student_2Test.main(null);
				}
			});
			Chapter.setBounds(22, yAxis, 300, 43);
			chapter_GroupLabel.add(Chapter);

			yAxis += 50;

		}

		// 챕터 점수 받아오는 DAO
		GetScore_DAO all = new GetScore_DAO();

		int chapterScore = 0;
		yAxis = 0;
		String chapter = "ja0";

		// DB 에 chapter 이름이 01, 02 이렇게 되어 있는데, 이걸 1,2,3,4,5 로 바꿔주면서 위 chapter 이름 생성하는곳에
		// 통합시키기

		for (int i = 1; i <= 10; i++) {

			chapter += i;
			chapter = (chapter.equals("ja010")) ? "ja10" : chapter;
			System.out.println(chapter);
			chapterScore = all.getChapterScore(loginID, chapter);
			System.out.println(chapterScore);

			JLabel chapter_ShowScoreLabel = new JLabel(chapterScore + "/20");
			chapter_ShowScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
			chapter_ShowScoreLabel.setFont(new Font("굴림", Font.PLAIN, 20));
			chapter_ShowScoreLabel.setBounds(250, yAxis, 70, 43);
			chapter_GroupLabel.add(chapter_ShowScoreLabel);

			yAxis = yAxis + 50;
			chapter = "ja0";
		}

//		chapterScore = all.getChapterScore(loginID, "ja10");
//		System.out.println(chapterScore);
//
//		JLabel chapter_ShowScoreLabel = new JLabel(chapterScore + "/20");
//		chapter_ShowScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		chapter_ShowScoreLabel.setFont(new Font("굴림", Font.PLAIN, 20));
//		chapter_ShowScoreLabel.setBounds(250, yAxis, 75, 43);
//		chapter_GroupLabel.add(chapter_ShowScoreLabel);

		JPanel notYet_Panel = new JPanel();
		notYet_Panel.setBackground(Color.WHITE);
		notYet_Panel.setBounds(364, 10, 586, 63);
		frame.getContentPane().add(notYet_Panel);
		notYet_Panel.setLayout(null);

		graph01_Label = new JPanel();
		graph01_Label.setBounds(364, 83, 610, 242);
		graph01_Label.setBackground(new Color(255, 0, 0, 0));
		graph01_Label.setLayout(null);
		frame.getContentPane().add(graph01_Label);

		JPanel graph02_Label = new JPanel();
		graph02_Label.setLayout(null);
		graph02_Label.setBackground(Color.WHITE);
		graph02_Label.setBounds(364, 335, 618, 241);
		frame.getContentPane().add(graph02_Label);

		PolylineBarChart1 demo = new PolylineBarChart1();
		JFreeChart chart = demo.getChart();
		ChartPanel cp1 = new ChartPanel(chart);
		cp1.setSize(610, 242);
		frame.getContentPane().add(cp1);

		PolylineBarChart2 demo2 = new PolylineBarChart2();
		JFreeChart chart2 = demo2.getChart();
		ChartPanel cp2 = new ChartPanel(chart2);
		cp2.setSize(618, 241);
		frame.getContentPane().add(cp2);

		/* 윈도우 빌더 이용할려면 이부분 잠시 주석처리 */
		graph01_Label.add(cp1);
		graph02_Label.add(cp2);
		/**/


	}
}