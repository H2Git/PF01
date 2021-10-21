package main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Close_Dialog extends JFrame {

	JPanel MainContainer;
	JLabel tLabel;
	JButton exitOptionbtn;

	protected JPanel UIComponents() { // 기본 판넬 붙이고 구성요소 붙이기

		MainContainer = new JPanel();
		MainContainer.setLayout(new BorderLayout());
		MainContainer.add(setTextLabel(), BorderLayout.CENTER);
		MainContainer.add(ButtonSet(), BorderLayout.SOUTH);
		return MainContainer;
	}

	protected JComponent setTextLabel() { // 텍스트 라벨 설정
		tLabel = new JLabel("창을 종료하는 예제입니다.");
		tLabel.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT); // 프레임 가운데에 정렬한다.
		return tLabel;		
	}

	protected JComponent ButtonSet() { // 텍스트 버튼 설정
		exitOptionbtn = new JButton("프로그램을 종료합니다.");

		exitOptionbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// JOptionPane의 ConfirmDialog는 결과에 따라 정수값을 반환한다.
				int exitOption = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?", "프로그램 종료", JOptionPane.YES_NO_OPTION);

				// YES_OPTION은 0, NO_OPTION은 1, CLOSED_OPTION은 -1을 반환한다
				if (exitOption == JOptionPane.YES_OPTION) {
					System.exit(JFrame.EXIT_ON_CLOSE); // 프레임을 종료한다
				} else if ((exitOption == JOptionPane.NO_OPTION) || (exitOption == JOptionPane.CLOSED_OPTION)) {
					return; // 아무 작업도 하지 않고 다이얼로그 상자를 닫는다
				}
			}
		});

		return exitOptionbtn;
	}
	
	

}