package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel = new JLabel("New label");
	JButton GameStartButton = new JButton("Game Start!");
	ChoosePlayer CP = new ChoosePlayer();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Pictures\\\uC5B4\uBCA4\uC838\uC2A4.jpg"));
		lblNewLabel.setBounds(0, 0, 753, 457);
		contentPane.add(lblNewLabel);
		
		
		GameStartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CP.setVisible(true);
				dispose();
			}
		});
		GameStartButton.setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 20));
		GameStartButton.setBackground(Color.LIGHT_GRAY);
		GameStartButton.setBounds(265, 341, 216, 68);
		contentPane.add(GameStartButton);
	}
}
