package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Player.��������;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �������_�������� extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel = new JLabel("\uBB34\uAE30\uB97C \uC120\uD0DD\uD558\uC138\uC694.");
	JCheckBox ��checkbox = new JCheckBox("\uCD1D");
	JLabel lblNewLabel_1 = new JLabel("");
	private final JButton exitbutton = new JButton("EXIT");
	JButton �Ϸ�button = new JButton("\uBB34\uAE30 \uC120\uD0DD \uC644\uB8CC");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					�������_�������� frame = new �������_��������();
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
	public �������_��������() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 362);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 18));
		
		
		lblNewLabel.setBounds(33, 10, 240, 25);
		contentPane.add(lblNewLabel);
		
		
		��checkbox.setFont(new Font("����", Font.PLAIN, 14));
		��checkbox.setBounds(48, 54, 107, 23);
		contentPane.add(��checkbox);
		
		
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\\uCD1D23.png"));
		lblNewLabel_1.setBounds(163, 66, 177, 187);
		contentPane.add(lblNewLabel_1);
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitbutton.setBounds(345, 0, 91, 23);
		
		contentPane.add(exitbutton);
		
				
		�Ϸ�button.setBounds(147, 263, 126, 37);
		contentPane.add(�Ϸ�button);
	}
	
	public �������_��������(�������� ��������) {
		this();
		
		�Ϸ�button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(��checkbox.isSelected()) {
					
					��������.setWeapon(��������.ws.get(0));
					System.out.println("���� ����, power: "+��������.getWeapon().getBulletPower()+", �Ѿ˰���: 5��");
				}
				else {
					��������.setWeapon(null);
					System.out.println("���� ����");
				}
				dispose();
			}		
		});
	}
}
