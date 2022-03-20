package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Player.Player;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BattleWindow extends JFrame {

	private JPanel contentPane;
	Player p1, p2;
	JPanel panel = new JPanel();
	JLabel p1Image = new JLabel("");
	JPanel panel_1 = new JPanel();
	JLabel p2Image = new JLabel("");
	JScrollPane scrollPane = new JScrollPane();
	JTextArea textArea = new JTextArea();
	JProgressBar p1_hp_bar = new JProgressBar();
	JButton p1기본공격 = new JButton("\uAE30\uBCF8 \uACF5\uACA9");
	JButton p1무기공격 = new JButton("\uBB34\uAE30 \uACF5\uACA9");
	JButton p1무기 = new JButton("\uBB34\uAE30");
	JProgressBar p2_hp_bar = new JProgressBar();
	JButton p2기본공격 = new JButton("\uAE30\uBCF8 \uACF5\uACA9");
	JButton p2무기공격 = new JButton("\uBB34\uAE30 \uACF5\uACA9");
	JButton p2무기 = new JButton("\uBB34\uAE30");
	JLabel p1_hp_label = new JLabel("1000");
	JLabel p2_hp_label = new JLabel("1000");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BattleWindow frame = new BattleWindow();
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
	public BattleWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 587);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		panel.setBackground(Color.PINK);
		panel.setBounds(12, 10, 270, 530);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		p1Image.setIcon(null);
		p1Image.setBounds(12, 10, 246, 294);
		panel.add(p1Image);
		
		
		p1_hp_bar.setMaximum(1000);
		p1_hp_bar.setBackground(Color.WHITE);
		p1_hp_bar.setForeground(Color.GREEN);
		p1_hp_bar.setValue(1000);
		p1_hp_bar.setBounds(12, 343, 246, 24);
		panel.add(p1_hp_bar);
		p1기본공격.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.attack(p2);
				textArea.append(p1.name+"의 기본 공격!\n");
				showHp2();
				
				if(p2.getHp()<=0)gameOver(p1, p2);
			}
		});
		
		
		p1기본공격.setBounds(12, 434, 246, 38);
		panel.add(p1기본공격);
		p1무기공격.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.무기attack(p2);
				textArea.append(p1.name+"의 무기 공격!\n");
				showHp2();
				
				if(p2.getHp()<=0) gameOver(p1, p2);
			}
		});
		
		
		p1무기공격.setBounds(12, 482, 246, 38);
		panel.add(p1무기공격);
		p1무기.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				무기선택(p1);
			}
		});
		
		
		p1무기.setBounds(76, 377, 118, 38);
		panel.add(p1무기);
		p1_hp_label.setBounds(12, 314, 95, 19);
		
		panel.add(p1_hp_label);
		
		
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(581, 10, 270, 530);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		p2Image.setIcon(null);
		p2Image.setBounds(12, 10, 246, 289);
		panel_1.add(p2Image);
		
		
		p2_hp_bar.setMaximum(1000);
		p2_hp_bar.setForeground(Color.GREEN);
		p2_hp_bar.setValue(1000);
		p2_hp_bar.setBounds(12, 342, 246, 23);
		panel_1.add(p2_hp_bar);
		p2기본공격.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p2.attack(p1);
				textArea.append(p2.name+"의 기본 공격!\n");
				showHp1();
				
				if(p1.getHp()<=0) gameOver(p2, p1);
			}
		});
		
		
		p2기본공격.setBounds(12, 434, 246, 38);
		panel_1.add(p2기본공격);
		p2무기공격.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p2.무기attack(p1);
				textArea.append(p2.name+"의 무기 공격!\n");
				showHp1();
				
				if(p1.getHp()<=0) gameOver(p2 ,p1);
			}
		});
		
		
		p2무기공격.setBounds(12, 482, 246, 38);
		panel_1.add(p2무기공격);
		p2무기.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				무기선택(p2);
			}
		});
		
		
		p2무기.setBounds(73, 375, 118, 38);
		panel_1.add(p2무기);
		p2_hp_label.setBounds(12, 317, 89, 15);
		
		panel_1.add(p2_hp_label);
		
		
		scrollPane.setBounds(294, 61, 277, 386);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(textArea);
	}
	
	public BattleWindow(Player P1, Player P2) {
		this();
		p1 = P1;
		p2 = P2;
		
		this.p1Image.setIcon(new ImageIcon(p1.imgFile));
		this.p2Image.setIcon(new ImageIcon(p2.imgFile));
		
		textArea.append("      player    hp    power");
		textArea.append("\n");
		showPlayer(p1);
		showPlayer(p2);
		
		textArea.append("============Game Strat!============\n");
		
		
	}
	
	public void showPlayer(Player p) {
		textArea.append("     "+p.name+"      "+p.getHp()+"      "+p.getPower());
		textArea.append("\n");
	}
	
	public void 무기선택(Player p) {
		p.무기선택();
	}
	
	public void showHp1() {
		int value = p1.getHp();
		p1_hp_bar.setValue(value);
		p1_hp_label.setText(Integer.toString(value));
		textArea.append(p1.name+"의 hp: "+p1_hp_label.getText()+"\n");
	}
	
	public void showHp2() {
		int value = p2.getHp();
		p2_hp_bar.setValue(value);
		p2_hp_label.setText(Integer.toString(value));
		textArea.append(p2.name+"의 hp: "+p2_hp_label.getText()+"\n");
	}
	
	public void gameOver(Player P1, Player P2) {
		textArea.append("==============Game Over==============\n");
		textArea.append(P2.name+" die \n");
		textArea.append(P1.name+"의 승리! \n");
		
		new ShowWinner(P1).setVisible(true);
		
		p1기본공격.setEnabled(false);
		p1무기공격.setEnabled(false);
		p2기본공격.setEnabled(false);
		p2무기공격.setEnabled(false);
	}
	
}
