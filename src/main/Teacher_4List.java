package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


import vo.St_Vo;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Teacher_4List {

	JTable jt;

	JTextField st_CodeTxt = null;
	JTextField st_TeamCodeTxt = null;
	JTextField st_NameTxt = null;
	JTextField st_ScoreTxt = null;
	JTextField st_PwTxt = null;
	JTextField st_MajorTxt = null;

	public Teacher_4List() {

		jt = new JTable();
	}

	private void initialize() {

		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 0, 0, 0));
		frame.setBounds(50, 50, 1000, 600);

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setUndecorated(true);

		JPanel data = new JPanel();
		data.setBounds(588, 63, 394, 500);
		data.setLayout(new GridLayout(8, 2));

		JLabel code = new JLabel("코드");
		code.setFont(new Font("굴림", Font.PLAIN, 30));
		code.setHorizontalAlignment(SwingConstants.CENTER);
		st_CodeTxt = new JTextField(20);

		JLabel team = new JLabel("팀");
		team.setFont(new Font("굴림", Font.PLAIN, 30));
		team.setHorizontalAlignment(SwingConstants.CENTER);
		st_TeamCodeTxt = new JTextField(20);

		JLabel name = new JLabel("이름");
		name.setFont(new Font("굴림", Font.PLAIN, 30));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		st_NameTxt = new JTextField(20);

		JLabel pw = new JLabel("비번");
		pw.setFont(new Font("굴림", Font.PLAIN, 30));
		pw.setHorizontalAlignment(SwingConstants.CENTER);
		st_PwTxt = new JTextField(20);

		JLabel score = new JLabel("점수");
		score.setFont(new Font("굴림", Font.PLAIN, 30));
		score.setHorizontalAlignment(SwingConstants.CENTER);
		st_ScoreTxt = new JTextField(20);

		JLabel major = new JLabel("전공");
		major.setFont(new Font("굴림", Font.PLAIN, 30));
		major.setHorizontalAlignment(SwingConstants.CENTER);
		st_MajorTxt = new JTextField(20);

		JButton cancel = new JButton("취소");
		cancel.setFont(new Font("굴림", Font.PLAIN, 30));

		data.add(code);
		data.add(st_CodeTxt);
		
		data.add(team);
		data.add(st_TeamCodeTxt);
		
		data.add(name);
		data.add(st_NameTxt);
		
		data.add(pw);
		data.add(st_PwTxt);
		
		data.add(score);
		data.add(st_ScoreTxt);
		
		data.add(major);
		data.add(st_MajorTxt);

		JPanel pan = new JPanel();

		pan.setBounds(512, 10, 394, 43);

		

//

		JButton send = new JButton("입력");
		send.setFont(new Font("굴림", Font.PLAIN, 30));
		send.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String a = st_CodeTxt.getText();
				String b = st_TeamCodeTxt.getText();
				String c = st_NameTxt.getText();
				String d = st_PwTxt.getText();
				String e1 = st_ScoreTxt.getText();
				String f = st_MajorTxt.getText();
				int pi_e1 = Integer.parseInt(e1);
				int pi_f = Integer.parseInt(f);
				
				GetScore_DAO get = new GetScore_DAO();
				int cnt = get.insert2(a, b, c, d, pi_e1, pi_f);
				//위에 액션 이벤트 이름이 e라서 그래써요 ㅎㅎ
				// 감사합니다. 큰절
				//혹시 저거 insert만 따로 dao 클래스 만들어서 해볼까요?

			}
		});

		data.add(send);
		data.add(cancel);

		Container cp = frame.getContentPane();
		cp.add(pan, BorderLayout.SOUTH);
		cp.add(new JScrollPane(jt), BorderLayout.CENTER);
		cp.add(data, BorderLayout.EAST);

		JButton show = new JButton("학생 정보");
		show.setFont(new Font("굴림", Font.PLAIN, 30));
		data.add(show);

		JButton btnNewButton = new JButton("종료");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		data.add(btnNewButton);

		show.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// JTable
				String[] col = { "ST_CODE", "ST_TEAMNAME", "ST_NAME", "ST_PW", "ST_SCORE", "ST_MAJOR" };
				DefaultTableModel model = new DefaultTableModel(0, 0);
				model.setColumnIdentifiers(col);
				jt.setModel(model);

				Table_DAO dao = new Table_DAO();
				ArrayList<St_Vo> list = dao.Select();
				for (St_Vo vo : list) {
					model.addRow(new Object[] { vo.getSt_code(), vo.getSt_Teamcode(), vo.getSt_Name(), vo.getSt_Pw(),
							vo.getSt_score(), vo.getSt_score() });
				}
			}

		});

		frame.setVisible(true);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 51, 102));
		panel_2.setBounds(900, 50, 260, 200);
		panel_2.setLayout(null);

//		frame.setUndecorated(true);

		// frame.getContentPane().setLayout(null);
		// cp.add(pan);
		// JScrollPane scrollPane = new JScrollPane(jt);
		// scrollPane.setBounds(0, 0, 500, 500);
		// cp.add(scrollPane);
		// cp.add(data);
	}

	public static void main(String[] args) {

		new Teacher_4List().initialize();

	}

}