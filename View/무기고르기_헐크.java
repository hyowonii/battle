package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Player.«Ê≈©;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class π´±‚∞Ì∏£±‚_«Ê≈© extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel = new JLabel("\uBB34\uAE30\uB97C \uC120\uD0DD\uD558\uC138\uC694.");
	JButton exitbutton = new JButton("EXIT");
	JRadioButton √—button = new JRadioButton("\uCD1D");
	JRadioButton ∏¡ƒ°button = new JRadioButton("\uB9DD\uCE58");
	JRadioButton »∞button = new JRadioButton("\uD65C");
	JRadioButton µπ∏Ê¿Ãbutton = new JRadioButton("\uB3CC\uBA69\uC774");
	JLabel lblNewLabel_1 = new JLabel("");
	JLabel lblNewLabel_2 = new JLabel("");
	JLabel lblNewLabel_3 = new JLabel("");
	JLabel lblNewLabel_4 = new JLabel("");
	JButton øœ∑·button = new JButton("\uBB34\uAE30 \uC120\uD0DD \uC644\uB8CC");
	ButtonGroup group = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					π´±‚∞Ì∏£±‚_«Ê≈© frame = new π´±‚∞Ì∏£±‚_«Ê≈©();
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
	public π´±‚∞Ì∏£±‚_«Ê≈©() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 541);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblNewLabel.setFont(new Font("±º∏≤", Font.PLAIN, 18));
		lblNewLabel.setBounds(36, 10, 177, 29);
		contentPane.add(lblNewLabel);
		
		
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitbutton.setBounds(345, 0, 91, 23);
		contentPane.add(exitbutton);
		
		
		√—button.setBounds(30, 57, 113, 23);
		contentPane.add(√—button);
		
		
		∏¡ƒ°button.setBounds(238, 57, 113, 23);
		contentPane.add(∏¡ƒ°button);
		
		
		»∞button.setBounds(36, 253, 113, 23);
		contentPane.add(»∞button);
		
		
		µπ∏Ê¿Ãbutton.setBounds(238, 253, 113, 23);
		contentPane.add(µπ∏Ê¿Ãbutton);
		
		group.add(√—button);
		group.add(∏¡ƒ°button);
		group.add(»∞button);
		group.add(µπ∏Ê¿Ãbutton);
		
		
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
				
		
		øœ∑·button.setBounds(159, 446, 128, 36);
		contentPane.add(øœ∑·button);
	}
	
	public π´±‚∞Ì∏£±‚_«Ê≈©(«Ê≈© «Ê≈©) {
		this();
		
		øœ∑·button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(√—button.isSelected()) {
					«Ê≈©.setWeapon(«Ê≈©.ws.get(0));
					System.out.println("√— º±≈√, power: "+«Ê≈©.getWeapon().getPower());
				}
				else if(∏¡ƒ°button.isSelected()) {
					«Ê≈©.setWeapon(«Ê≈©.ws.get(1));
					System.out.println("∏¡ƒ° º±≈√, power: "+«Ê≈©.getWeapon().getPower());
				}
				else if(»∞button.isSelected()) {
					«Ê≈©.setWeapon(«Ê≈©.ws.get(2));
					System.out.println("»∞ º±≈√, power: "+«Ê≈©.getWeapon().getPower());
				}
				else if(µπ∏Ê¿Ãbutton.isSelected()) {
					«Ê≈©.setWeapon(«Ê≈©.ws.get(3));
					System.out.println("µπ∏Ê¿Ã º±≈√, power: "+«Ê≈©.getWeapon().getPower());
				}
				else {
					«Ê≈©.setWeapon(null);
					System.out.println("π´±‚ æ¯¿Ω");
				}
				dispose();
			}
		});
	}
}
