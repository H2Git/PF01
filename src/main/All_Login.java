package main;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class All_Login {

	/*기본 맴버 */
	private JFrame frame;
	private EtchedBorder border;
	
	static String login = "";
	int login_Attempt_CNT = 1;
	
	private JTextField ID_TextField;
	private JPasswordField PW_PasswodField;
	private JLabel Login_Label;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					All_Login window = new All_Login();
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
	public All_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(SystemColor.textHighlight);
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(50, 50, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);

		JLabel Background_imgLabel = new JLabel("");
		Background_imgLabel.setBackground(Color.LIGHT_GRAY);
		Background_imgLabel.setIcon(new ImageIcon("..\\Project\\src\\images\\11.png"));
		Background_imgLabel.setBounds(-26, 0, 1026, 600);
		/**/frame.getContentPane().add(Background_imgLabel);

		JLabel Background_BorderLabel = new JLabel("");
		Background_BorderLabel.setBounds(0, 0, 1000, 600);
		/**/frame.getContentPane().add(Background_BorderLabel);

		border = new EtchedBorder(EtchedBorder.LOWERED);
		Background_BorderLabel.setBorder(border);

		Login_Label = new JLabel("Signin");
		Login_Label.setFont(new Font("Consolas", Font.BOLD, 25));
		Login_Label.setBounds(269, 163, 93, 57);
		/**/frame.getContentPane().add(Login_Label);

		ID_TextField = new JTextField();
		ID_TextField.setFont(new Font("Consolas", Font.PLAIN, 18));
		ID_TextField.setToolTipText("로그인 코드 입력");
		ID_TextField.setBounds(193, 236, 235, 40);
		frame.getContentPane().add(ID_TextField);
		ID_TextField.setColumns(10);

		login = ID_TextField.getText();

		PW_PasswodField = new JPasswordField();
		PW_PasswodField.setFont(new Font("Consolas", Font.PLAIN, 18));
		PW_PasswodField.setToolTipText("비밀번호를 입력하세요");
		PW_PasswodField.setBounds(193, 296, 235, 40);
		/**/frame.getContentPane().add(PW_PasswodField);

		GhostText ghostText = new GhostText(ID_TextField, "Enter User Code ");
		ID_TextField.setPreferredSize(new Dimension(300, 0));

		GhostText ghostText1 = new GhostText(PW_PasswodField, "Password");
		PW_PasswodField.setPreferredSize(new Dimension(300, 30));

		JButton Login_Button = new JButton("LOGIN");
		Login_Button.setVerticalAlignment(SwingConstants.BOTTOM);
		Login_Button.setForeground(Color.WHITE);
		Login_Button.setFont(new Font("Candara", Font.BOLD, 20));
		Login_Button.setBackground(Color.ORANGE);
		Login_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String inputCode = ID_TextField.getText();
				String inputPw = "";

//passward char 타입으로 들어온다. String 비교 안됨.
// pw 타입으로 받아서 char를 String으로, DB에서 비번은 String 으로 옴
				char[] secret_pw = PW_PasswodField.getPassword();
				for (char cha : secret_pw) {
					Character.toString(cha);
					inputPw += (inputPw.equals("")) ? "" + cha + "" : "" + cha + "";
				}
				System.out.println(inputCode + inputPw);

				Login_DAO login = new Login_DAO();
				boolean check = login.LoginCheck(inputCode, inputPw);

//				String ID_tempForCheck = "200101";
//				String PW_tempForCheck = "7790";
//				System.out.println("로그인 확인 반환값  확인 >> " + check);

				if (login_Attempt_CNT < 5) {
					if (check) {
						JOptionPane.showMessageDialog(null, "로그인 성공");

//						System.out.println("??");
						if (ID_TextField.getText().length() == 6) {

//							System.out.println("???");
							Student_1Main.loginID = ID_TextField.getText();
							Student_1Main.main(null);
							Student_1Main.loginID = inputCode; // 학생 메인 페이지로 넘어가면서 학생 아이디를 동시에 넘긴다.
						} else {
							Teacher_1Main.loginID = ID_TextField.getText();
							Teacher_1Main.main(null);
						}
					} else {

						System.out.println("?");
						JOptionPane.showMessageDialog(null, "로그인 실패 (" + login_Attempt_CNT + "/5)");
						login_Attempt_CNT++;
//						System.out.println("실패한 패스워드 체크 >> " + PW_PasswodField.getPassword());
					}
				} else if (login_Attempt_CNT == 5) {
					JOptionPane.showMessageDialog(null, "5번 연속 실패하셨습니다. 프로그램을 종료합니다.");
					frame.dispose();
				}

			}
		});
		Login_Button.setBounds(193, 356, 233, 38);
		/**/frame.getContentPane().add(Login_Button);

		JButton Exit_Button = new AutoSize_ImgButton("..\\Project\\src\\images\\close.png");
		Exit_Button.setBounds(965, 10, 25, 25);
		Exit_Button.setOpaque(false);
		/**/frame.getContentPane().add(Exit_Button);

		Exit_Button.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				frame.dispose();
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}

		});

	}

}