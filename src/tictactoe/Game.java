package tictactoe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Game extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
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
	public Game() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 485, 492);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.BLACK));
		panel_1.setBounds(10, 11, 148, 150);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btn_1_7 = new JButton("");
		btn_1_7.setBounds(10, 99, 40, 40);
		panel_1.add(btn_1_7);
		
		JButton btn_1_8 = new JButton("");
		btn_1_8.setBounds(54, 99, 40, 40);
		panel_1.add(btn_1_8);
		
		JButton btn_1_4 = new JButton("");
		btn_1_4.setBounds(10, 54, 40, 40);
		panel_1.add(btn_1_4);
		
		JButton btn_1_5 = new JButton("");
		btn_1_5.setBounds(54, 54, 40, 40);
		panel_1.add(btn_1_5);
		
		JButton btn_1_6 = new JButton("");
		btn_1_6.setBounds(98, 54, 40, 40);
		panel_1.add(btn_1_6);
		
		JButton btn_1_2 = new JButton("");
		btn_1_2.setBounds(54, 11, 40, 40);
		panel_1.add(btn_1_2);
		
		JButton btn_1_3 = new JButton("");
		btn_1_3.setBounds(98, 11, 40, 40);
		panel_1.add(btn_1_3);
		
		JButton btn_1_1 = new JButton("");
		btn_1_1.setBounds(10, 11, 40, 40);
		panel_1.add(btn_1_1);
		
		JButton btn_1_9 = new JButton("");
		btn_1_9.setBounds(98, 99, 40, 40);
		panel_1.add(btn_1_9);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(168, 11, 148, 150);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btn_2_1 = new JButton("");
		btn_2_1.setBounds(10, 11, 40, 40);
		panel_2.add(btn_2_1);
		
		JButton btn_2_2 = new JButton("");
		btn_2_2.setBounds(55, 11, 40, 40);
		panel_2.add(btn_2_2);
		
		JButton btn_2_3 = new JButton("");
		btn_2_3.setBounds(98, 11, 40, 40);
		panel_2.add(btn_2_3);
		
		JButton btn_2_6 = new JButton("");
		btn_2_6.setBounds(98, 55, 40, 40);
		panel_2.add(btn_2_6);
		
		JButton btn_2_9 = new JButton("");
		btn_2_9.setBounds(98, 99, 40, 40);
		panel_2.add(btn_2_9);
		
		JButton btn_2_5 = new JButton("");
		btn_2_5.setBounds(55, 55, 40, 40);
		panel_2.add(btn_2_5);
		
		JButton btn_2_4 = new JButton("");
		btn_2_4.setBounds(10, 55, 40, 40);
		panel_2.add(btn_2_4);
		
		JButton btn_2_7 = new JButton("");
		btn_2_7.setBounds(10, 99, 40, 40);
		panel_2.add(btn_2_7);
		
		JButton btn_2_8 = new JButton("");
		btn_2_8.setBounds(55, 99, 40, 40);
		panel_2.add(btn_2_8);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(326, 11, 148, 150);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btn_3_1 = new JButton("");
		btn_3_1.setBounds(10, 11, 40, 40);
		panel_3.add(btn_3_1);
		
		JButton btn_3_2 = new JButton("");
		btn_3_2.setBounds(54, 11, 40, 40);
		panel_3.add(btn_3_2);
		
		JButton btn_3_3 = new JButton("");
		btn_3_3.setBounds(98, 11, 40, 40);
		panel_3.add(btn_3_3);
		
		JButton btn_3_4 = new JButton("");
		btn_3_4.setBounds(10, 55, 40, 40);
		panel_3.add(btn_3_4);
		
		JButton btn_3_5 = new JButton("");
		btn_3_5.setBounds(54, 55, 40, 40);
		panel_3.add(btn_3_5);
		
		JButton btn_3_6 = new JButton("");
		btn_3_6.setBounds(98, 55, 40, 40);
		panel_3.add(btn_3_6);
		
		JButton btn_3_7 = new JButton("");
		btn_3_7.setBounds(10, 99, 40, 40);
		panel_3.add(btn_3_7);
		
		JButton btn_3_8 = new JButton("");
		btn_3_8.setBounds(54, 99, 40, 40);
		panel_3.add(btn_3_8);
		
		JButton btn_3_9 = new JButton("");
		btn_3_9.setBounds(98, 99, 40, 40);
		panel_3.add(btn_3_9);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.BLACK));
		panel_4.setBounds(10, 172, 148, 150);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btn_4_1 = new JButton("");
		btn_4_1.setBounds(10, 11, 40, 40);
		panel_4.add(btn_4_1);
		
		JButton btn_4_2 = new JButton("");
		btn_4_2.setBounds(55, 11, 40, 40);
		panel_4.add(btn_4_2);
		
		JButton btn_4_3 = new JButton("");
		btn_4_3.setBounds(98, 11, 40, 40);
		panel_4.add(btn_4_3);
		
		JButton btn_4_4 = new JButton("");
		btn_4_4.setBounds(10, 54, 40, 40);
		panel_4.add(btn_4_4);
		
		JButton btn_4_5 = new JButton("");
		btn_4_5.setBounds(55, 54, 40, 40);
		panel_4.add(btn_4_5);
		
		JButton btn_4_6 = new JButton("");
		btn_4_6.setBounds(98, 54, 40, 40);
		panel_4.add(btn_4_6);
		
		JButton btn_4_7 = new JButton("");
		btn_4_7.setBounds(10, 99, 40, 40);
		panel_4.add(btn_4_7);
		
		JButton btn_4_8 = new JButton("");
		btn_4_8.setBounds(55, 99, 40, 40);
		panel_4.add(btn_4_8);
		
		JButton btn_4_9 = new JButton("");
		btn_4_9.setBounds(98, 99, 40, 40);
		panel_4.add(btn_4_9);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(168, 172, 148, 150);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btn_5_1 = new JButton("");
		btn_5_1.setBounds(10, 11, 40, 40);
		panel_5.add(btn_5_1);
		
		JButton btn_5_2 = new JButton("");
		btn_5_2.setBounds(55, 11, 40, 40);
		panel_5.add(btn_5_2);
		
		JButton btn_5_3 = new JButton("");
		btn_5_3.setBounds(98, 11, 40, 40);
		panel_5.add(btn_5_3);
		
		JButton btn_5_4 = new JButton("");
		btn_5_4.setBounds(10, 54, 40, 40);
		panel_5.add(btn_5_4);
		
		JButton btn_5_5 = new JButton("");
		btn_5_5.setBounds(55, 54, 40, 40);
		panel_5.add(btn_5_5);
		
		JButton btn_5_6 = new JButton("");
		btn_5_6.setBounds(98, 54, 40, 40);
		panel_5.add(btn_5_6);
		
		JButton btn_5_7 = new JButton("");
		btn_5_7.setBounds(10, 99, 40, 40);
		panel_5.add(btn_5_7);
		
		JButton btn_5_8 = new JButton("");
		btn_5_8.setBounds(55, 99, 40, 40);
		panel_5.add(btn_5_8);
		
		JButton btn_5_9 = new JButton("");
		btn_5_9.setBounds(98, 99, 40, 40);
		panel_5.add(btn_5_9);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBounds(326, 172, 148, 150);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btn_6_1 = new JButton("");
		btn_6_1.setBounds(10, 11, 40, 40);
		panel_6.add(btn_6_1);
		
		JButton btn_6_2 = new JButton("");
		btn_6_2.setBounds(53, 11, 40, 40);
		panel_6.add(btn_6_2);
		
		JButton btn_6_3 = new JButton("");
		btn_6_3.setBounds(98, 11, 40, 40);
		panel_6.add(btn_6_3);
		
		JButton btn_6_4 = new JButton("");
		btn_6_4.setBounds(10, 56, 40, 40);
		panel_6.add(btn_6_4);
		
		JButton btn_6_5 = new JButton("");
		btn_6_5.setBounds(53, 56, 40, 40);
		panel_6.add(btn_6_5);
		
		JButton btn_6_6 = new JButton("");
		btn_6_6.setBounds(98, 56, 40, 40);
		panel_6.add(btn_6_6);
		
		JButton btn_6_7 = new JButton("");
		btn_6_7.setBounds(10, 99, 40, 40);
		panel_6.add(btn_6_7);
		
		JButton btn_6_8 = new JButton("");
		btn_6_8.setBounds(53, 99, 40, 40);
		panel_6.add(btn_6_8);
		
		JButton btn_6_9 = new JButton("");
		btn_6_9.setBounds(98, 99, 40, 40);
		panel_6.add(btn_6_9);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBounds(10, 333, 148, 150);
		panel.add(panel_7);
		panel_7.setLayout(null);
		
		JButton btn_7_1 = new JButton("");
		btn_7_1.setBounds(10, 11, 40, 40);
		panel_7.add(btn_7_1);
		
		JButton btn_7_2 = new JButton("");
		btn_7_2.setBounds(55, 11, 40, 40);
		panel_7.add(btn_7_2);
		
		JButton btn_7_3 = new JButton("");
		btn_7_3.setBounds(98, 11, 40, 40);
		panel_7.add(btn_7_3);
		
		JButton btn_7_4 = new JButton("");
		btn_7_4.setBounds(10, 55, 40, 40);
		panel_7.add(btn_7_4);
		
		JButton btn_7_5 = new JButton("");
		btn_7_5.setBounds(55, 55, 40, 40);
		panel_7.add(btn_7_5);
		
		JButton btn_7_6 = new JButton("");
		btn_7_6.setBounds(98, 55, 40, 40);
		panel_7.add(btn_7_6);
		
		JButton btn_7_7 = new JButton("");
		btn_7_7.setBounds(10, 99, 40, 40);
		panel_7.add(btn_7_7);
		
		JButton btn_7_8 = new JButton("");
		btn_7_8.setBounds(55, 99, 40, 40);
		panel_7.add(btn_7_8);
		
		JButton btn_7_9 = new JButton("");
		btn_7_9.setBounds(98, 99, 40, 40);
		panel_7.add(btn_7_9);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setBounds(168, 333, 148, 150);
		panel.add(panel_8);
		panel_8.setLayout(null);
		
		JButton btn_8_1 = new JButton("");
		btn_8_1.setBounds(10, 11, 40, 40);
		panel_8.add(btn_8_1);
		
		JButton btn_8_2 = new JButton("");
		btn_8_2.setBounds(56, 11, 40, 40);
		panel_8.add(btn_8_2);
		
		JButton btn_8_3 = new JButton("");
		btn_8_3.setBounds(98, 11, 40, 40);
		panel_8.add(btn_8_3);
		
		JButton btn_8_4 = new JButton("");
		btn_8_4.setBounds(10, 55, 40, 40);
		panel_8.add(btn_8_4);
		
		JButton btn_8_5 = new JButton("");
		btn_8_5.setBounds(56, 55, 40, 40);
		panel_8.add(btn_8_5);
		
		JButton btn_8_6 = new JButton("");
		btn_8_6.setBounds(98, 55, 40, 40);
		panel_8.add(btn_8_6);
		
		JButton btn_8_7 = new JButton("");
		btn_8_7.setBounds(10, 99, 40, 40);
		panel_8.add(btn_8_7);
		
		JButton btn_8_8 = new JButton("");
		btn_8_8.setBounds(56, 99, 40, 40);
		panel_8.add(btn_8_8);
		
		JButton btn_8_9 = new JButton("");
		btn_8_9.setBounds(98, 99, 40, 40);
		panel_8.add(btn_8_9);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9.setBounds(326, 333, 148, 150);
		panel.add(panel_9);
		panel_9.setLayout(null);
		
		JButton btn_9_1 = new JButton("");
		btn_9_1.setBounds(10, 11, 40, 40);
		panel_9.add(btn_9_1);
		
		JButton btn_9_2 = new JButton("");
		btn_9_2.setBounds(54, 11, 40, 40);
		panel_9.add(btn_9_2);
		
		JButton btn_9_3 = new JButton("");
		btn_9_3.setBounds(98, 11, 40, 40);
		panel_9.add(btn_9_3);
		
		JButton btn_9_4 = new JButton("");
		btn_9_4.setBounds(10, 55, 40, 40);
		panel_9.add(btn_9_4);
		
		JButton btn_9_5 = new JButton("");
		btn_9_5.setBounds(54, 55, 40, 40);
		panel_9.add(btn_9_5);
		
		JButton btn_9_6 = new JButton("");
		btn_9_6.setBounds(98, 55, 40, 40);
		panel_9.add(btn_9_6);
		
		JButton btn_9_7 = new JButton("");
		btn_9_7.setBounds(10, 99, 40, 40);
		panel_9.add(btn_9_7);
		
		JButton btn_9_8 = new JButton("");
		btn_9_8.setBounds(54, 99, 40, 40);
		panel_9.add(btn_9_8);
		
		JButton btn_9_9 = new JButton("");
		btn_9_9.setBounds(98, 99, 40, 40);
		panel_9.add(btn_9_9);
	}
}
