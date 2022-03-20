package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Player.Player;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ShowWinner extends JFrame {

	private JPanel contentPane;
	JLabel winnerImage = new JLabel("");
	JLabel lblNewLabel_1 = new JLabel("WINNER!");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowWinner frame = new ShowWinner();
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
	public ShowWinner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 453, 467);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		winnerImage.setIcon(null);
		winnerImage.setBounds(93, 97, 246, 294);
		contentPane.add(winnerImage);
		
		
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(165, 35, 103, 36);
		contentPane.add(lblNewLabel_1);
		
		
	}
	
	public ShowWinner(Player p) {
		this();
		this.winnerImage.setIcon(new ImageIcon(p.imgFile));
	}
}
