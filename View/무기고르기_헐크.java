package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Player.��ũ;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class �������_��ũ extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel = new JLabel("\uBB34\uAE30\uB97C \uC120\uD0DD\uD558\uC138\uC694.");
	JButton exitbutton = new JButton("EXIT");
	JRadioButton ��button = new JRadioButton("\uCD1D");
	JRadioButton ��ġbutton = new JRadioButton("\uB9DD\uCE58");
	JRadioButton Ȱbutton = new JRadioButton("\uD65C");
	JRadioButton ������button = new JRadioButton("\uB3CC\uBA69\uC774");
	JLabel lblNewLabel_1 = new JLabel("");
	JLabel lblNewLabel_2 = new JLabel("");
	JLabel lblNewLabel_3 = new JLabel("");
	JLabel lblNewLabel_4 = new JLabel("");
	JButton �Ϸ�button = new JButton("\uBB34\uAE30 \uC120\uD0DD \uC644\uB8CC");
	ButtonGroup group = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					�������_��ũ frame = new �������_��ũ();
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
	public �������_��ũ() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 541);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 18));
		lblNewLabel.setBounds(36, 10, 177, 29);
		contentPane.add(lblNewLabel);
		
		
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitbutton.setBounds(345, 0, 91, 23);
		contentPane.add(exitbutton);
		
		
		��button.setBounds(30, 57, 113, 23);
		contentPane.add(��button);
		
		
		��ġbutton.setBounds(238, 57, 113, 23);
		contentPane.add(��ġbutton);
		
		
		Ȱbutton.setBounds(36, 253, 113, 23);
		contentPane.add(Ȱbutton);
		
		
		������button.setBounds(238, 253, 113, 23);
		contentPane.add(������button);
		
		group.add(��button);
		group.add(��ġbutton);
		group.add(Ȱbutton);
		group.add(������button);
		
		
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\\uCD1D23.png"));
		lblNewLabel_1.setBounds(12, 86, 177, 161);
		contentPane.add(lblNewLabel_1);
		
		
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\\uB9DD\uCE581234.png"));
		lblNewLabel_2.setBounds(220, 86, 177, 161);
		contentPane.add(lblNewLabel_2);
		
		
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\\uB9AC\uCEE4\uBE0C\uBCF4\uC6B02.png"));
		lblNewLabel_3.setBounds(0, 282, 217, 161);
		contentPane.add(lblNewLabel_3);
		
		
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\\uB3CC\uBA69\uC7742.png"));
		lblNewLabel_4.setBounds(220, 282, 177, 161);
		contentPane.add(lblNewLabel_4);
				
		
		�Ϸ�button.setBounds(159, 446, 128, 36);
		contentPane.add(�Ϸ�button);
	}
	
	public �������_��ũ(��ũ ��ũ) {
		this();
		
		�Ϸ�button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(��button.isSelected()) {
					��ũ.setWeapon(��ũ.ws.get(0));
					System.out.println("�� ����, power: "+��ũ.getWeapon().getPower());
				}
				else if(��ġbutton.isSelected()) {
					��ũ.setWeapon(��ũ.ws.get(1));
					System.out.println("��ġ ����, power: "+��ũ.getWeapon().getPower());
				}
				else if(Ȱbutton.isSelected()) {
					��ũ.setWeapon(��ũ.ws.get(2));
					System.out.println("Ȱ ����, power: "+��ũ.getWeapon().getPower());
				}
				else if(������button.isSelected()) {
					��ũ.setWeapon(��ũ.ws.get(3));
					System.out.println("������ ����, power: "+��ũ.getWeapon().getPower());
				}
				else {
					��ũ.setWeapon(null);
					System.out.println("���� ����");
				}
				dispose();
			}
		});
	}
}
