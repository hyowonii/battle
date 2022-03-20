package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Player.Player;
import Player.블랙위도우;
import Player.토르;
import Player.헐크;
import Player.호크아이;

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
	JRadioButton p1헐크 = new JRadioButton("\uD5D0\uD06C");
	JRadioButton p1토르 = new JRadioButton("\uD1A0\uB974");
	JRadioButton p1블랙위도우 = new JRadioButton("\uBE14\uB799\uC704\uB3C4\uC6B0");
	JRadioButton p1호크아이 = new JRadioButton("\uD638\uD06C\uC544\uC774");
	JRadioButton p2헐크 = new JRadioButton("\uD5D0\uD06C");
	JRadioButton p2토르 = new JRadioButton("\uD1A0\uB974");
	JRadioButton p2블랙위도우 = new JRadioButton("\uBE14\uB799\uC704\uB3C4\uC6B0");
	JRadioButton p2호크아이 = new JRadioButton("\uD638\uD06C\uC544\uC774");
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
		
		
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(198, 10, 358, 46);
		contentPane.add(lblNewLabel);
		
		
		lblNewLabel_1.setBackground(Color.PINK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(98, 107, 83, 29);
		contentPane.add(lblNewLabel_1);
		
		
		lblNewLabel_2.setBackground(Color.ORANGE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(546, 107, 83, 29);
		contentPane.add(lblNewLabel_2);
		
		
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(323, 251, 83, 58);
		contentPane.add(lblNewLabel_3);
		
		
		p1헐크.setBounds(80, 184, 113, 23);
		contentPane.add(p1헐크);
		
		p1토르.setBounds(80, 251, 113, 23);
		contentPane.add(p1토르);
		
		p1블랙위도우.setBounds(80, 327, 113, 23);
		contentPane.add(p1블랙위도우);
				
		p1호크아이.setBounds(80, 394, 113, 23);
		contentPane.add(p1호크아이);
		
		BG1.add(p1헐크);
		BG1.add(p1토르);
		BG1.add(p1블랙위도우);
		BG1.add(p1호크아이);
		
		
		p2헐크.setBounds(528, 184, 113, 23);
		contentPane.add(p2헐크);
				
		p2토르.setBounds(528, 251, 113, 23);
		contentPane.add(p2토르);
				
		p2블랙위도우.setBounds(528, 327, 113, 23);
		contentPane.add(p2블랙위도우);
				
		p2호크아이.setBounds(528, 394, 113, 23);
		contentPane.add(p2호크아이);
		
		BG2.add(p2헐크);
		BG2.add(p2토르);
		BG2.add(p2블랙위도우);
		BG2.add(p2호크아이);
		BattleStartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(p1헐크.isSelected()) p1 = new 헐크("헐크");
				else if(p1토르.isSelected()) p1 = new 토르("토르");
				else if(p1블랙위도우.isSelected()) p1 = new 블랙위도우("블랙위도우");
				else if(p1호크아이.isSelected()) p1 = new 호크아이("호크아이");
				
				if(p2헐크.isSelected()) p2 = new 헐크("헐크");
				else if(p2토르.isSelected()) p2 = new 토르("토르");
				else if(p2블랙위도우.isSelected()) p2 = new 블랙위도우("블랙위도우");
				else if(p2호크아이.isSelected()) p2 = new 호크아이("호크아이");
				
				
				new BattleWindow(p1, p2).setVisible(true);
				dispose();
			}
		});
		
		
		BattleStartButton.setBounds(302, 409, 124, 34);
		contentPane.add(BattleStartButton);
	}
}
