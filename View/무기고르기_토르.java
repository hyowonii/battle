package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Player.�丣;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class �������_�丣 extends JFrame{

	private JPanel contentPane;
	JLabel topLabel = new JLabel("\uBB34\uAE30\uB97C \uC120\uD0DD\uD558\uC138\uC694.");
	JLabel ���ϸ�image = new JLabel("");
	JLabel ������image = new JLabel("");
	JButton exitbutton = new JButton("EXIT");
	JRadioButton ���ϸ�button = new JRadioButton("\uBB20\uB2C8\uB974");
	JRadioButton ������button = new JRadioButton("\uB3CC\uBA69\uC774");
	ButtonGroup group = new ButtonGroup();
	private final JButton �Ϸ�button = new JButton("\uBB34\uAE30 \uC120\uD0DD \uC644\uB8CC");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {			
			public void run() {
				try {
					�������_�丣 frame = new �������_�丣();
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
	public �������_�丣() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 459, 377);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		topLabel.setFont(new Font("����", Font.PLAIN, 18));
		
		
		topLabel.setBounds(30, 10, 218, 26);
		contentPane.add(topLabel);
		������image.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\\uB3CC\uBA69\uC7742.png"));
		
		
		������image.setBounds(193, 108, 190, 133);
		contentPane.add(������image);
		
		
		���ϸ�image.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\\uBB20\uB2C8\uB974345.png"));
		���ϸ�image.setBounds(12, 98, 169, 152);
		
		contentPane.add(���ϸ�image);
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitbutton.setBounds(354, 0, 91, 23);
		
		contentPane.add(exitbutton);
		
		
		���ϸ�button.setBounds(30, 58, 113, 23);
		contentPane.add(���ϸ�button);
		
		
		������button.setBounds(233, 58, 113, 23);
		contentPane.add(������button);
		
		group.add(���ϸ�button);
		group.add(������button);
		
		�Ϸ�button.setBounds(147, 279, 134, 34);
		
		contentPane.add(�Ϸ�button);
	}
	
	public �������_�丣(�丣 �丣) {
		this();
		
		�Ϸ�button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(���ϸ�button.isSelected()) {
					�丣.setWeapon(�丣.ws.get(0));
					System.out.println("���ϸ� ����, power: "+�丣.getWeapon().getPower());
				}
				else if(������button.isSelected()) {
					�丣.setWeapon(�丣.ws.get(1));
					System.out.println("������ ����, power: "+�丣.getWeapon().getPower());
				}
				else {
					�丣.setWeapon(null);
					System.out.println("���� ����");
				}
				dispose();
			}
		});
	}

	
	
}
