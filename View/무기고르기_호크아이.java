package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Player.호크아이;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 무기고르기_호크아이 extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel = new JLabel("\uBB34\uAE30\uB97C \uC120\uD0DD\uD558\uC138\uC694.");
	JCheckBox 활button = new JCheckBox("\uB9AC\uCEE4\uBE0C\uBCF4\uC6B0");
	JLabel lblNewLabel_1 = new JLabel("");
	JButton 완료button = new JButton("\uBB34\uAE30 \uC120\uD0DD \uC644\uB8CC");
	JButton exitbutton = new JButton("EXIT");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					무기고르기_호크아이 frame = new 무기고르기_호크아이();
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
	public 무기고르기_호크아이() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 441, 381);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel.setBounds(33, 10, 203, 33);
		contentPane.add(lblNewLabel);
		
		
		활button.setBounds(43, 49, 107, 23);
		contentPane.add(활button);
		
		
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\\uB9AC\uCEE4\uBE0C\uBCF4\uC6B02.png"));
		lblNewLabel_1.setBounds(140, 66, 237, 185);
		contentPane.add(lblNewLabel_1);
				
		
		완료button.setBounds(153, 281, 115, 33);
		contentPane.add(완료button);
		
		
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitbutton.setBounds(336, 0, 91, 23);
		contentPane.add(exitbutton);
	}
	
	public 무기고르기_호크아이(호크아이 호크아이) {
		this();
		
		완료button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(활button.isSelected()) {
					호크아이.setWeapon(호크아이.ws.get(0));
					System.out.println("리커브보우 선택, power: "+호크아이.getWeapon().getBulletPower()+", 화살개수: 5개");
				}
				else {
					호크아이.setWeapon(null);
					System.out.println("무기 없음");
				}
				dispose();
			}
		});
	}
}
