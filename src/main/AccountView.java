package main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

import java.awt.Font;

public class AccountView {

	/*기본 맴버*/
	private JFrame frame;
	private EtchedBorder border;
	static String loginID;
	/**/
	
	private JLabel PW_Label;
	private JLabel sex_Label;
	private JLabel hobby_Label;
	private JLabel nation_Label;
	private JLabel selfIntroduce_Label;

	private JTextField PW_Textfield;

	private JRadioButton man_Radio;
	private JRadioButton woman_Radio;
	private JRadioButton[] sex = new JRadioButton[2];
	private String sexx = "";

	private JCheckBox[] checkbox = new JCheckBox[3];
	private JCheckBox checkMovie;
	private JCheckBox checkReding;
	private JCheckBox checkCicle;
	private String[] check = { "", "", "" };

	private JComboBox comboxNation;
	private String[] career = { " 관련 없음", " 독학 - 취미", " 독학 - 1년이상",  " 고등학교 수업", " 대학교 전공 과정", " 대학교 관련 수업", " 관련 업무- 1년 이상"};

	private JTextArea self_Intro;
	private JButton save_Button;
	private JLabel PW_DoubleCheckLabel;
	private JTextField PW_DoubleCheckTextfield;
	private JLabel ID_Label;
	private JLabel ID_ShowLabel;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("student main 에서 AccountView 로 아이디 넘어오는지 확인 >> " + loginID);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountView window = new AccountView();
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
	public AccountView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(10, 8, 375, 550);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setUndecorated(true);	
		frame.getContentPane().setLayout(null);
		
		border = new EtchedBorder(EtchedBorder.LOWERED);
		JLabel Background_BorderLabel = new JLabel("");

//		frame.setBackground(new Color(255, 0, 0, 0));
		Background_BorderLabel.setBounds(0, 0, 375, 550);
		Background_BorderLabel.setBorder(border);
		/**/frame.getContentPane().add(Background_BorderLabel);
		
		JButton Exit_Button = new AutoSize_ImgButton("..\\Project\\src\\images\\close_Grey.png");
		Exit_Button.setBounds(345, 8, 20, 20);
		frame.getContentPane().add(Exit_Button);

		Exit_Button.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				frame.dispose();
			}

		});
		
		PW_Label = new JLabel("PW  입력   :");
		PW_Label.setFont(new Font("굴림", Font.PLAIN, 15));
		PW_Label.setSize(90, 30); // setBounds가 아니면 setSize와 setLocation을 동시에 사용해야함
		PW_Label.setLocation(30, 90);
		sex_Label = new JLabel("성       별   :");
		sex_Label.setFont(new Font("굴림", Font.PLAIN, 15));
		sex_Label.setBounds(30, 170, 90, 30);
		hobby_Label = new JLabel("전       공   :");
		hobby_Label.setFont(new Font("굴림", Font.PLAIN, 15));
		hobby_Label.setBounds(30, 210, 90, 30);
		nation_Label = new JLabel("최종 경력   :");
		nation_Label.setFont(new Font("굴림", Font.PLAIN, 15));
		nation_Label.setBounds(30, 250, 90, 30);
		selfIntroduce_Label = new JLabel("자기 소개   :");
		selfIntroduce_Label.setFont(new Font("굴림", Font.PLAIN, 15));
		selfIntroduce_Label.setBounds(30, 290, 90, 30);

		// 텍스트 필드
		PW_Textfield = new JTextField(); // 이름 입력 부분
		PW_Textfield.setFont(new Font("굴림", Font.PLAIN, 15));
		PW_Textfield.setBounds(133, 90, 200, 30); // 위지 와 사이즈

		// 라디오 버튼
		ButtonGroup g = new ButtonGroup(); // 라디오버튼중에서 한가지만 선택하기 위한 그룹 설정
		sex[0] = new JRadioButton("남");
		sex[0].setBounds(133, 175, 50, 20);
		sex[1] = new JRadioButton("여");
		sex[1].setBounds(213, 175, 100, 20);
		g.add(sex[0]);
		g.add(sex[1]);

		// 체크박스
		checkbox[0] = new JCheckBox("전공");
		checkbox[0].setBounds(133, 215, 60, 20);
		checkbox[1] = new JCheckBox("비전공");
		checkbox[1].setBounds(192, 215, 70, 20);
		checkbox[2] = new JCheckBox("관련학과");
		checkbox[2].setBounds(262, 215, 80, 20);

		// 콤보박스
		comboxNation = new JComboBox(career);
		comboxNation.setFont(new Font("굴림", Font.PLAIN, 15));
		comboxNation.setBounds(133, 250, 200, 30);

		// 텍스트 에어리어 , 결과 출력부분
		self_Intro = new JTextArea();
		self_Intro.setEditable(false);
		// JTextArea는 JScrollPane를 써야 스크롤바가 생긴다.
		JScrollPane scrollPane = new JScrollPane(self_Intro);
		scrollPane.setBounds(133, 290, 200, 150);

		// 버튼
		save_Button = new JButton("저장 ");
		save_Button.setBackground(Color.LIGHT_GRAY);
		save_Button.setFont(new Font("굴림", Font.PLAIN, 15));
		save_Button.setBounds(140, 470, 100, 30);
		save_Button.addActionListener(new EventHandlerSave()); // 버튼 리스너 등록
		
		ID_Label = new JLabel("ID    코드   :");
		ID_Label.setFont(new Font("굴림", Font.PLAIN, 15));
		ID_Label.setBounds(30, 50, 90, 30);
		frame.getContentPane().add(ID_Label);
		
		ID_ShowLabel = new JLabel(loginID);
		ID_ShowLabel.setFont(new Font("굴림", Font.BOLD, 15));
		ID_ShowLabel.setBounds(143, 50, 190, 30);
		frame.getContentPane().add(ID_ShowLabel);
		// 프레임의 컨테이너의 각종 컴포넌트들을 등록
		
		frame.getContentPane().add(PW_Label);
		
		PW_DoubleCheckLabel = new JLabel("PW  확인   :");
		PW_DoubleCheckLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		PW_DoubleCheckLabel.setBounds(30, 130, 90, 30);
		frame.getContentPane().add(PW_DoubleCheckLabel);
		frame.getContentPane().add(sex_Label);
		frame.getContentPane().add(hobby_Label);
		frame.getContentPane().add(nation_Label);
		frame.getContentPane().add(selfIntroduce_Label);
		frame.getContentPane().add(PW_Textfield);

		frame.getContentPane().add(sex[0]);
		frame.getContentPane().add(sex[1]);

		frame.getContentPane().add(checkbox[0]);
		frame.getContentPane().add(checkbox[1]);
		frame.getContentPane().add(checkbox[2]);
		
		PW_DoubleCheckTextfield = new JTextField();
		PW_DoubleCheckTextfield.setFont(new Font("굴림", Font.PLAIN, 15));
		PW_DoubleCheckTextfield.setBounds(133, 130, 200, 30);
		frame.getContentPane().add(PW_DoubleCheckTextfield);

		frame.getContentPane().add(comboxNation);

		frame.getContentPane().add(scrollPane);
		frame.getContentPane().add(save_Button);

	}

	class EventHandlerSave implements ActionListener { //
		public void actionPerformed(ActionEvent e) {

			// 텍스트 필드값 가져오기
			String a = PW_Textfield.getText();

			// 라디오 버튼 값 가져오기
			if (sex[0].isSelected())
				sexx = "남";
			else if (sex[1].isSelected())
				sexx = "여";

			// 체크박스 값 가져오기
			if (checkbox[0].isSelected())
				check[0] = "영화";
			else
				check[0] = "";
			if (checkbox[1].isSelected())
				check[1] = "독서";
			else
				check[1] = "";
			if (checkbox[2].isSelected())
				check[2] = "자전거";
			else
				check[2] = "";

			// 콤보박스 값 가져오기
			String d = (String) comboxNation.getSelectedItem();

			// TextArea 필드에 출력 보이기
			self_Intro.append("이름 = " + a + "\n");
			self_Intro.append("성별 = " + sexx + "\n");
			self_Intro.append("취미 = " + check[0] + check[1] + check[2] + "\n");
			self_Intro.append("국가 = " + d + "\n");

		}
	}// EventHandlerSave
}