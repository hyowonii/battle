package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Player.Player;
import Player.��������;
import Player.�丣;
import Player.��ũ;
import Player.ȣũ����;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChoosePlayer extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel = new JLabel("Player\uB97C \uC120\uD0DD\uD574\uC8FC\uC138\uC694.");
	JLabel lblNewLabel_1 = new JLabel("Player1");
	JLabel lblNewLabel_2 = new JLabel("Player2");
	JLabel lblNewLabel_3 = new JLabel("VS");
	JRadioButton p1��ũ = new JRadioButton("\uD5D0\uD06C");
	JRadioButton p1�丣 = new JRadioButton("\uD1A0\uB974");
	JRadioButton p1�������� = new JRadioButton("\uBE14\uB799\uC704\uB3C4\uC6B0");
	JRadioButton p1ȣũ���� = new JRadioButton("\uD638\uD06C\uC544\uC774");
	JRadioButton p2��ũ = new JRadioButton("\uD5D0\uD06C");
	JRadioButton p2�丣 = new JRadioButton("\uD1A0\uB974");
	JRadioButton p2�������� = new JRadioButton("\uBE14\uB799\uC704\uB3C4\uC6B0");
	JRadioButton p2ȣũ���� = new JRadioButton("\uD638\uD06C\uC544\uC774");
	JButton BattleStartButton = new JButton("Battle Start!");
	ButtonGroup BG1 = new ButtonGroup();
	ButtonGroup BG2 = new ButtonGroup();
	
	Player p1, p2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoosePlayer frame = new ChoosePlayer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChoosePlayer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(198, 10, 358, 46);
		contentPane.add(lblNewLabel);
		
		
		lblNewLabel_1.setBackground(Color.PINK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(98, 107, 83, 29);
		contentPane.add(lblNewLabel_1);
		
		
		lblNewLabel_2.setBackground(Color.ORANGE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("����", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(546, 107, 83, 29);
		contentPane.add(lblNewLabel_2);
		
		
		lblNewLabel_3.setFont(new Font("����", Font.PLAIN, 30));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(323, 251, 83, 58);
		contentPane.add(lblNewLabel_3);
		
		
		p1��ũ.setBounds(80, 184, 113, 23);
		contentPane.add(p1��ũ);
		
		p1�丣.setBounds(80, 251, 113, 23);
		contentPane.add(p1�丣);
		
		p1��������.setBounds(80, 327, 113, 23);
		contentPane.add(p1��������);
				
		p1ȣũ����.setBounds(80, 394, 113, 23);
		contentPane.add(p1ȣũ����);
		
		BG1.add(p1��ũ);
		BG1.add(p1�丣);
		BG1.add(p1��������);
		BG1.add(p1ȣũ����);
		
		
		p2��ũ.setBounds(528, 184, 113, 23);
		contentPane.add(p2��ũ);
				
		p2�丣.setBounds(528, 251, 113, 23);
		contentPane.add(p2�丣);
				
		p2��������.setBounds(528, 327, 113, 23);
		contentPane.add(p2��������);
				
		p2ȣũ����.setBounds(528, 394, 113, 23);
		contentPane.add(p2ȣũ����);
		
		BG2.add(p2��ũ);
		BG2.add(p2�丣);
		BG2.add(p2��������);
		BG2.add(p2ȣũ����);
		BattleStartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(p1��ũ.isSelected()) p1 = new ��ũ("��ũ");
				else if(p1�丣.isSelected()) p1 = new �丣("�丣");
				else if(p1��������.isSelected()) p1 = new ��������("��������");
				else if(p1ȣũ����.isSelected()) p1 = new ȣũ����("ȣũ����");
				
				if(p2��ũ.isSelected()) p2 = new ��ũ("��ũ");
				else if(p2�丣.isSelected()) p2 = new �丣("�丣");
				else if(p2��������.isSelected()) p2 = new ��������("��������");
				else if(p2ȣũ����.isSelected()) p2 = new ȣũ����("ȣũ����");
				
				
				new BattleWindow(p1, p2).setVisible(true);
				dispose();
			}
		});
		
		
		BattleStartButton.setBounds(302, 409, 124, 34);
		contentPane.add(BattleStartButton);
	}
}
