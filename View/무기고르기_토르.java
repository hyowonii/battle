package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Player.토르;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class 무기고르기_토르 extends JFrame{

	private JPanel contentPane;
	JLabel topLabel = new JLabel("\uBB34\uAE30\uB97C \uC120\uD0DD\uD558\uC138\uC694.");
	JLabel 묠니르image = new JLabel("");
	JLabel 돌멩이image = new JLabel("");
	JButton exitbutton = new JButton("EXIT");
	JRadioButton 묠니르button = new JRadioButton("\uBB20\uB2C8\uB974");
	JRadioButton 돌멩이button = new JRadioButton("\uB3CC\uBA69\uC774");
	ButtonGroup group = new ButtonGroup();
	private final JButton 완료button = new JButton("\uBB34\uAE30 \uC120\uD0DD \uC644\uB8CC");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {			
			public void run() {
				try {
					무기고르기_토르 frame = new 무기고르기_토르();
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
	public 무기고르기_토르() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 459, 377);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		topLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		
		
		topLabel.setBounds(30, 10, 218, 26);
		contentPane.add(topLabel);
		돌멩이image.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\\uB3CC\uBA69\uC7742.png"));
		
		
		돌멩이image.setBounds(193, 108, 190, 133);
		contentPane.add(돌멩이image);
		
		
		묠니르image.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\\uBB20\uB2C8\uB974345.png"));
		묠니르image.setBounds(12, 98, 169, 152);
		
		contentPane.add(묠니르image);
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitbutton.setBounds(354, 0, 91, 23);
		
		contentPane.add(exitbutton);
		
		
		묠니르button.setBounds(30, 58, 113, 23);
		contentPane.add(묠니르button);
		
		
		돌멩이button.setBounds(233, 58, 113, 23);
		contentPane.add(돌멩이button);
		
		group.add(묠니르button);
		group.add(돌멩이button);
		
		완료button.setBounds(147, 279, 134, 34);
		
		contentPane.add(완료button);
	}
	
	public 무기고르기_토르(토르 토르) {
		this();
		
		완료button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(묠니르button.isSelected()) {
					토르.setWeapon(토르.ws.get(0));
					System.out.println("묠니르 선택, power: "+토르.getWeapon().getPower());
				}
				else if(돌멩이button.isSelected()) {
					토르.setWeapon(토르.ws.get(1));
					System.out.println("돌멩이 선택, power: "+토르.getWeapon().getPower());
				}
				else {
					토르.setWeapon(null);
					System.out.println("무기 없음");
				}
				dispose();
			}
		});
	}

	
	
}
