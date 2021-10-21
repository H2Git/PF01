package main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

//import Studnet_Test;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class Student_3Award {

   private JFrame frame;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Student_3Award window = new Student_3Award();
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
   public Student_3Award() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.getContentPane().setBackground(new Color(245, 255, 250));
      frame.setBounds(50, 50, 1000, 600);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      frame.setLocationRelativeTo(null);
      frame.setResizable(false);
      
      JPanel panel1 = new JPanel();
      panel1.setBackground(Color.WHITE);
      panel1.setBounds(217, 86, 765, 479);
      frame.getContentPane().add(panel1);
      panel1.setLayout(null);
      
      textField = new JTextField();
      textField.setFont(new Font("굴림", Font.PLAIN, 50));
      textField.setText("장학금 총점수 : 99");
      textField.setBounds(12, 10, 741, 201);
      panel1.add(textField);
      textField.setColumns(10);
      
      textField_1 = new JTextField();
      textField_1.setText("내가 받은 상목록");
      textField_1.setFont(new Font("굴림", Font.PLAIN, 50));
      textField_1.setColumns(10);
      textField_1.setBounds(12, 232, 741, 195);
      panel1.add(textField_1);
      
      JPanel panel_2 = new JPanel();
      panel_2.setBackground(Color.WHITE);
      panel_2.setBounds(12, 10, 197, 66);
      frame.getContentPane().add(panel_2);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBounds(12, 86, 197, 479);
      frame.getContentPane().add(panel_1);
      panel_1.setBackground(Color.WHITE);
      panel_1.setLayout(null);
      
      JButton btnNewButton = new JButton("1차 프로젝트");
      btnNewButton.setBounds(12, 10, 173, 60);
      panel_1.add(btnNewButton);
      btnNewButton.setBackground(new Color(0, 255, 255));
      btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
      
      JButton btnNewButton_3 = new JButton("2차 프로젝트");
      btnNewButton_3.setBounds(12, 80, 173, 60);
      panel_1.add(btnNewButton_3);
      btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
      
      JButton btnNewButton_1 = new JButton("3차 프로젝트");
      btnNewButton_1.setBounds(12, 150, 173, 60);
      panel_1.add(btnNewButton_1);
      btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
      
      JButton btnNewButton_2 = new JButton("타이타닉");
      btnNewButton_2.setBounds(12, 219, 173, 60);
      panel_1.add(btnNewButton_2);
      btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
      
      JButton btnNewButton_4 = new JButton("자바 페스티벌");
      btnNewButton_4.setBounds(12, 286, 173, 60);
      panel_1.add(btnNewButton_4);
      btnNewButton_4.setHorizontalAlignment(SwingConstants.LEFT);
      
      JButton btnNewButton_5 = new JButton("데이터베이스");
      btnNewButton_5.setBounds(12, 353, 173, 60);
      panel_1.add(btnNewButton_5);
      btnNewButton_5.setHorizontalAlignment(SwingConstants.LEFT);
      
      JPanel panel_2_1 = new JPanel();
      panel_2_1.setLayout(null);
      panel_2_1.setBackground(Color.WHITE);
      panel_2_1.setBounds(217, 10, 765, 66);
      frame.getContentPane().add(panel_2_1);
      
      textField_2 = new JTextField();
      textField_2.setText("학생 장학금 페이지");
      textField_2.setFont(new Font("굴림", Font.PLAIN, 30));
      textField_2.setColumns(10);
      textField_2.setBounds(12, 5, 741, 51);
      panel_2_1.add(textField_2);
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
//            Studnet_Test.main(null);  
         }
         
      });

      JButton[] bt = new JButton[20];

        for (int i = 0; i < bt.length; i++) {
            bt[i] = new JButton("Button" + i);
            panel1.add(bt[i]);
        }
      
   }
}