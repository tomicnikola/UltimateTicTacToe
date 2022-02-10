package tictactoe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalButtonUI;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Game extends JFrame {

	private JPanel contentPane;
	Igrac igrac = new Igrac();
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
		setResizable(false);
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
		btn_1_9.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_1_9.setBounds(98, 99, 40, 40);
		panel_1.add(btn_1_9);
		
		JButton[] kvadrat1 = new JButton[]{btn_1_1, btn_1_2, btn_1_3, btn_1_4, btn_1_5, btn_1_6, btn_1_7, btn_1_8, btn_1_9};
		
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
		
		JButton[] kvadrat2 = new JButton[]{btn_2_1, btn_2_2, btn_2_3, btn_2_4, btn_2_5, btn_2_6, btn_2_7, btn_2_8, btn_2_9};
		
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
		
		JButton[] kvadrat3 = new JButton[]{btn_3_1, btn_3_2, btn_3_3, btn_3_4, btn_3_5, btn_3_6, btn_3_7, btn_3_8, btn_3_9};
		
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
		
		JButton[] kvadrat4 = new JButton[]{btn_4_1, btn_4_2, btn_4_3, btn_4_4, btn_4_5, btn_4_6, btn_4_7, btn_4_8, btn_4_9};
		
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
		
		JButton[] kvadrat5 = new JButton[]{btn_5_1, btn_5_2, btn_5_3, btn_5_4, btn_5_5, btn_5_6, btn_5_7, btn_5_8, btn_5_9};
		
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
		
		JButton[] kvadrat6 = new JButton[]{btn_6_1, btn_6_2, btn_6_3, btn_6_4, btn_6_5, btn_6_6, btn_6_7, btn_6_8, btn_6_9};
		
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
		
		JButton[] kvadrat7 = new JButton[]{btn_7_1, btn_7_2, btn_7_3, btn_7_4, btn_7_5, btn_7_6, btn_7_7, btn_7_8, btn_7_9};
		
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
		
		JButton[] kvadrat8 = new JButton[]{btn_8_1, btn_8_2, btn_8_3, btn_8_4, btn_8_5, btn_8_6, btn_8_7, btn_8_8, btn_8_9};
		
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
		
		JButton[] kvadrat9 = new JButton[]{btn_9_1, btn_9_2, btn_9_3, btn_9_4, btn_9_5, btn_9_6, btn_9_7, btn_9_8, btn_9_9};
		for (JButton jButton : kvadrat9) {
			
		}
		
		btn_1_7.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_1_7.setText("X");
					btn_1_7.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_1_7.setText("O");
					btn_1_7.setForeground(Color.red);
				}
				igrac.lokalnaTabla[2][0] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat1);
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_1_8.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_1_8.setText("X");
					btn_1_8.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_1_8.setText("O");
					btn_1_8.setForeground(Color.red);
				}
				igrac.lokalnaTabla[2][1] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat1);
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_1_9.setText("X");
					btn_1_9.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_1_9.setText("O");
					btn_1_9.setForeground(Color.red);
				}
				igrac.lokalnaTabla[2][2] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat1);
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
			}
		});
		
		btn_1_4.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_1_4.setText("X");
					btn_1_4.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_1_4.setText("O");
					btn_1_4.setForeground(Color.red);
				}
				igrac.lokalnaTabla[1][0] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat1);
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_1_5.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_1_5.setText("X");
					btn_1_5.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_1_5.setText("O");
					btn_1_5.setForeground(Color.red);
				}
				igrac.lokalnaTabla[1][1] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat1);
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_1_1.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_1_1.setText("X");
					btn_1_1.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_1_1.setText("O");
					btn_1_1.setForeground(Color.red);
				}
				igrac.lokalnaTabla[0][0] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat1);
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			
			}
		});
		
		btn_1_3.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_1_3.setText("X");
					btn_1_3.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_1_3.setText("O");
					btn_1_3.setForeground(Color.red);
				}
				igrac.lokalnaTabla[0][2] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat1);
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_1_2.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_1_2.setText("X");
					btn_1_2.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_1_2.setText("O");
					btn_1_2.setForeground(Color.red);
				}
				igrac.lokalnaTabla[0][1] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat1);
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_1_6.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_1_6.setText("X");
					btn_1_6.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_1_6.setText("O");
					btn_1_6.setForeground(Color.red);
				}
				igrac.lokalnaTabla[1][2] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat1);
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_2_8.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_2_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_2_8.setText("X");
					btn_2_8.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_2_8.setText("O");
					btn_2_8.setForeground(Color.red);
				}
				igrac.lokalnaTabla[2][4] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat2);
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_2_7.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_2_7.setText("X");
					btn_2_7.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_2_7.setText("O");
					btn_2_7.setForeground(Color.red);
				}
				igrac.lokalnaTabla[2][3] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat2);
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_2_4.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_2_4.setText("X");
					btn_2_4.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_2_4.setText("O");
					btn_2_4.setForeground(Color.red);
				}
				igrac.lokalnaTabla[1][3] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat2);
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_2_5.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_2_5.setText("X");
					btn_2_5.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_2_5.setText("O");
					btn_2_5.setForeground(Color.red);
				}
				igrac.lokalnaTabla[1][4] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat2);
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_2_9.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_2_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(igrac.trenutniIgrac.equals("X")) {
					btn_2_9.setText("X");
					btn_2_9.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_2_9.setText("O");
					btn_2_9.setForeground(Color.red);
				}
				igrac.lokalnaTabla[2][5] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat2);
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
			}
		});
		
		btn_2_6.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_2_6.setText("X");
					btn_2_6.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_2_6.setText("O");
					btn_2_6.setForeground(Color.red);
				}
				igrac.lokalnaTabla[1][5] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat2);
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_2_3.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_2_3.setText("X");
					btn_2_3.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_2_3.setText("O");
					btn_2_3.setForeground(Color.red);
				}
				igrac.lokalnaTabla[0][5] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat2);
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_2_2.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_2_2.setText("X");
					btn_2_2.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_2_2.setText("O");
					btn_2_2.setForeground(Color.red);
				}
				igrac.lokalnaTabla[0][4] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat2);
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_2_1.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_2_1.setText("X");
					btn_2_1.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_2_1.setText("O");
					btn_2_1.setForeground(Color.red);
				}
				igrac.lokalnaTabla[0][3] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat2);
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_3_1.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_3_1.setText("X");
					btn_3_1.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_3_1.setText("O");
					btn_3_1.setForeground(Color.red);
				}
				igrac.lokalnaTabla[0][6] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat3);
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_3_2.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_3_2.setText("X");
					btn_3_2.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_3_2.setText("O");
					btn_3_2.setForeground(Color.red);
				}
				igrac.lokalnaTabla[0][7] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat3);
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_3_3.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_3_3.setText("X");
					btn_3_3.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_3_3.setText("O");
					btn_3_3.setForeground(Color.red);
				}
				igrac.lokalnaTabla[0][8] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat3);
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
				
			}
		});
		
		btn_3_4.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_3_4.setText("X");
					btn_3_4.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_3_4.setText("O");
					btn_3_4.setForeground(Color.red);
				}
				igrac.lokalnaTabla[1][6] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat3);
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_3_5.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_3_5.setText("X");
					btn_3_5.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_3_5.setText("O");
					btn_3_5.setForeground(Color.red);
				}
				igrac.lokalnaTabla[1][7] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat3);
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_3_6.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_3_6.setText("X");
					btn_3_6.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_3_6.setText("O");
					btn_3_6.setForeground(Color.red);
				}
				igrac.lokalnaTabla[1][8] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat3);
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_3_7.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_3_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_3_7.setText("X");
					btn_3_7.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_3_7.setText("O");
					btn_3_7.setForeground(Color.red);
				}
				igrac.lokalnaTabla[2][6] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat3);
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_3_8.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_3_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_3_8.setText("X");
					btn_3_8.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_3_8.setText("O");
					btn_3_8.setForeground(Color.red);
				}
				igrac.lokalnaTabla[2][7] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat3);
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_3_9.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_3_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_3_9.setText("X");
					btn_3_9.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_3_9.setText("O");
					btn_3_9.setForeground(Color.red);
				}
				igrac.lokalnaTabla[2][8] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat3);
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
			}
		});
		
		btn_4_1.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_4_1.setText("X");
					btn_4_1.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_4_1.setText("O");
					btn_4_1.setForeground(Color.red);
				}
				igrac.lokalnaTabla[3][0] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat4);
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_4_2.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_4_2.setText("X");
					btn_4_2.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_4_2.setText("O");
					btn_4_2.setForeground(Color.red);
				}
				igrac.lokalnaTabla[3][1] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat4);
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_4_3.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_4_3.setText("X");
					btn_4_3.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_4_3.setText("O");
					btn_4_3.setForeground(Color.red);
				}
				igrac.lokalnaTabla[3][2] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat4);
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_4_4.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_4_4.setText("X");
					btn_4_4.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_4_4.setText("O");
					btn_4_4.setForeground(Color.red);
				}
				igrac.lokalnaTabla[4][0] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat4);
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_4_5.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_4_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_4_5.setText("X");
					btn_4_5.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_4_5.setText("O");
					btn_4_5.setForeground(Color.red);
				}
				igrac.lokalnaTabla[4][1] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat4);
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_4_6.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_4_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_4_6.setText("X");
					btn_4_6.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_4_6.setText("O");
					btn_4_6.setForeground(Color.red);
				}
				igrac.lokalnaTabla[4][2] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat4);
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_4_7.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_4_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_4_7.setText("X");
					btn_4_7.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_4_7.setText("O");
					btn_4_7.setForeground(Color.red);
				}
				igrac.lokalnaTabla[5][0] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat4);
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_4_8.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_4_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_4_8.setText("X");
					btn_4_8.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_4_8.setText("O");
					btn_4_8.setForeground(Color.red);
				}
				igrac.lokalnaTabla[5][1] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat4);
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_4_9.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_4_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_4_9.setText("X");
					btn_4_9.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_4_9.setText("O");
					btn_4_9.setForeground(Color.red);
				}
				igrac.lokalnaTabla[5][2] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat4);
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
			}
		});
		
		btn_5_1.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_5_1.setText("X");
					btn_5_1.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_5_1.setText("O");
					btn_5_1.setForeground(Color.red);
				}
				igrac.lokalnaTabla[3][3] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat5);
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_5_2.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_5_2.setText("X");
					btn_5_2.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_5_2.setText("O");
					btn_5_2.setForeground(Color.red);
				}
				igrac.lokalnaTabla[3][4] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat5);
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_5_3.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_5_3.setText("X");
					btn_5_3.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_5_3.setText("O");
					btn_5_3.setForeground(Color.red);
				}
				igrac.lokalnaTabla[3][5] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat5);
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_5_4.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_5_4.setText("X");
					btn_5_4.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_5_4.setText("O");
					btn_5_4.setForeground(Color.red);
				}
				igrac.lokalnaTabla[4][4] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat5);
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_5_5.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_5_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_5_5.setText("X");
					btn_5_5.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_5_5.setText("O");
					btn_5_5.setForeground(Color.red);
				}
				igrac.lokalnaTabla[4][5] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat5);
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_5_6.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_5_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_5_6.setText("X");
					btn_5_6.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_5_6.setText("O");
					btn_5_6.setForeground(Color.red);
				}
				igrac.lokalnaTabla[4][5] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat5);
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_5_7.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_5_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_5_7.setText("X");
					btn_5_7.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_5_7.setText("O");
					btn_5_7.setForeground(Color.red);
				}
				igrac.lokalnaTabla[5][3] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat5);
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_5_8.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_5_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_5_8.setText("X");
					btn_5_8.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_5_8.setText("O");
					btn_5_8.setForeground(Color.red);
				}
				igrac.lokalnaTabla[5][4] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat5);
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_5_9.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_5_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_5_9.setText("X");
					btn_5_9.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_5_9.setText("O");
					btn_5_9.setForeground(Color.red);
				}
				igrac.lokalnaTabla[5][5] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat5);
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
			}
		});
		
		btn_6_1.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_6_1.setText("X");
					btn_6_1.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_6_1.setText("O");
					btn_6_1.setForeground(Color.red);
				}
				igrac.lokalnaTabla[3][6] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat6);
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_6_2.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_6_2.setText("X");
					btn_6_2.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_6_2.setText("O");
					btn_6_2.setForeground(Color.red);
				}
				igrac.lokalnaTabla[3][7] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat6);
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_6_3.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_6_3.setText("X");
					btn_6_3.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_6_3.setText("O");
					btn_6_3.setForeground(Color.red);
				}
				igrac.lokalnaTabla[3][8] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat6);
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_6_4.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_6_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_6_4.setText("X");
					btn_6_4.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_6_4.setText("O");
					btn_6_4.setForeground(Color.red);
				}
				igrac.lokalnaTabla[4][6] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat6);
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_6_5.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_6_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_6_5.setText("X");
					btn_6_5.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_6_5.setText("O");
					btn_6_5.setForeground(Color.red);
				}
				igrac.lokalnaTabla[4][7] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat6);
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_6_6.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_6_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_6_6.setText("X");
					btn_6_6.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_6_6.setText("O");
					btn_6_6.setForeground(Color.red);
				}
				igrac.lokalnaTabla[4][8] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat6);
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
				
				
			}
		});
		
		btn_6_7.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_6_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_6_7.setText("X");
					btn_6_7.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_6_7.setText("O");
					btn_6_7.setForeground(Color.red);
				}
				igrac.lokalnaTabla[5][6] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat6);
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_6_8.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_6_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_6_8.setText("X");
					btn_6_8.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_6_8.setText("O");
					btn_6_8.setForeground(Color.red);
				}
				igrac.lokalnaTabla[5][7] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat6);
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_6_9.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_6_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_6_9.setText("X");
					btn_6_9.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_6_9.setText("O");
					btn_6_9.setForeground(Color.red);
				}
				igrac.lokalnaTabla[5][8] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat6);
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
			}
		});
		
		btn_7_1.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_7_1.setText("X");
					btn_7_1.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_7_1.setText("O");
					btn_7_1.setForeground(Color.red);
				}
				igrac.lokalnaTabla[6][0] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat7);
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_7_2.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_7_2.setText("X");
					btn_7_2.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_7_2.setText("O");
					btn_7_2.setForeground(Color.red);
				}
				igrac.lokalnaTabla[6][1] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat7);
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_7_3.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_7_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_7_3.setText("X");
					btn_7_3.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_7_3.setText("O");
					btn_7_3.setForeground(Color.red);
				}
				igrac.lokalnaTabla[6][2] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat7);
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_7_4.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_7_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_7_4.setText("X");
					btn_7_4.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_7_4.setText("O");
					btn_7_4.setForeground(Color.red);
				}
				igrac.lokalnaTabla[7][0] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat7);
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_7_5.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_7_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_7_5.setText("X");
					btn_7_5.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_7_5.setText("O");
					btn_7_5.setForeground(Color.red);
				}
				igrac.lokalnaTabla[7][1] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat7);
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_7_6.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_7_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_7_6.setText("X");
					btn_7_6.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_7_6.setText("O");
					btn_7_6.setForeground(Color.red);
				}
				igrac.lokalnaTabla[7][2] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat7);
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_7_7.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_7_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_7_7.setText("X");
					btn_7_7.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_7_7.setText("O");
					btn_7_7.setForeground(Color.red);
				}
				igrac.lokalnaTabla[8][0] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat7);
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_7_8.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_7_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_7_8.setText("X");
					btn_7_8.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_7_8.setText("O");
					btn_7_8.setForeground(Color.red);
				}
				igrac.lokalnaTabla[8][1] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat7);
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_7_9.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_7_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_7_9.setText("X");
					btn_7_9.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_7_9.setText("O");
					btn_7_9.setForeground(Color.red);
				}
				igrac.lokalnaTabla[8][2] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat7);
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
			}
		});
		
		btn_8_1.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_8_1.setText("X");
					btn_8_1.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_8_1.setText("O");
					btn_8_1.setForeground(Color.red);
				}
				igrac.lokalnaTabla[6][3] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat8);
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_8_2.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_8_2.setText("X");
					btn_8_2.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_8_2.setText("O");
					btn_8_2.setForeground(Color.red);
				}
				igrac.lokalnaTabla[6][4] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat8);
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_8_3.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_8_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_8_3.setText("X");
					btn_8_3.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_8_3.setText("O");
					btn_8_3.setForeground(Color.red);
				}
				igrac.lokalnaTabla[6][5] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat8);
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_8_4.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_8_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_8_4.setText("X");
					btn_8_4.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_8_4.setText("O");
					btn_8_4.setForeground(Color.red);
				}
				igrac.lokalnaTabla[7][3] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat8);
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_8_5.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_8_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_8_5.setText("X");
					btn_8_5.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_8_5.setText("O");
					btn_8_5.setForeground(Color.red);
				}
				igrac.lokalnaTabla[7][4] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat8);
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_8_6.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_8_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_8_6.setText("X");
					btn_8_6.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_8_6.setText("O");
					btn_8_6.setForeground(Color.red);
				}
				igrac.lokalnaTabla[7][5] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat8);
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_8_7.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_8_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_8_7.setText("X");
					btn_8_7.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_8_7.setText("O");
					btn_8_7.setForeground(Color.red);
				}
				igrac.lokalnaTabla[8][3] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat8);
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_8_8.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_8_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_8_8.setText("X");
					btn_8_8.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_8_8.setText("O");
					btn_8_8.setForeground(Color.red);
				}
				igrac.lokalnaTabla[8][4] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat8);
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_8_9.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_8_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_8_9.setText("X");
					btn_8_9.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_8_9.setText("O");
					btn_8_9.setForeground(Color.red);
				}
				igrac.lokalnaTabla[8][5] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat8);
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
			}
		});
		
		btn_9_1.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_9_1.setText("X");
					btn_9_1.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_9_1.setText("O");
					btn_9_1.setForeground(Color.red);
				}
				igrac.lokalnaTabla[6][6] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat9);
				kvadratOmoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_9_2.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_9_2.setText("X");
					btn_9_2.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_9_2.setText("O");
					btn_9_2.setForeground(Color.red);
				}
				igrac.lokalnaTabla[6][7] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat9);
				kvadratOmoguci(kvadrat2);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_9_3.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_9_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_9_3.setText("X");
					btn_9_3.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_9_3.setText("O");
					btn_9_3.setForeground(Color.red);
				}
				igrac.lokalnaTabla[6][8] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat9);
				kvadratOmoguci(kvadrat3);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_9_4.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_9_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_9_4.setText("X");
					btn_9_4.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_9_4.setText("O");
					btn_9_4.setForeground(Color.red);
				}
				igrac.lokalnaTabla[7][6] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat9);
				kvadratOmoguci(kvadrat4);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_9_5.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_9_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_9_5.setText("X");
					btn_9_5.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_9_5.setText("O");
					btn_9_5.setForeground(Color.red);
				}
				igrac.lokalnaTabla[7][7] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat9);
				kvadratOmoguci(kvadrat5);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_9_6.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_9_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_9_6.setText("X");
					btn_9_6.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_9_6.setText("O");
					btn_9_6.setForeground(Color.red);
				}
				igrac.lokalnaTabla[7][8] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat9);
				kvadratOmoguci(kvadrat6);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_9_7.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_9_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_9_7.setText("X");
					btn_9_7.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_9_7.setText("O");
					btn_9_7.setForeground(Color.red);
				}
				igrac.lokalnaTabla[8][6] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat9);
				kvadratOmoguci(kvadrat7);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat8);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_9_8.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_9_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_9_8.setText("X");
					btn_9_8.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_9_8.setText("O");
					btn_9_8.setForeground(Color.red);
				}
				igrac.lokalnaTabla[8][7] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat9);
				kvadratOmoguci(kvadrat8);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat9);
			}
		});
		
		btn_9_9.setFont(new Font("Arial Black", Font.BOLD, 7));
		btn_9_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(igrac.trenutniIgrac.equals("X")) {
					btn_9_9.setText("X");
					btn_9_9.setForeground(Color.blue);
				}
				if(igrac.trenutniIgrac.equals("O")) {
					btn_9_9.setText("O");
					btn_9_9.setForeground(Color.red);
				}
				igrac.lokalnaTabla[8][8] = igrac.trenutniIgrac;
				igrac.zameniIgraca();
				
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat9);
				kvadratOmoguci(kvadrat9);
				kvadratOnemoguci(kvadrat1);
				kvadratOnemoguci(kvadrat2);
				kvadratOnemoguci(kvadrat3);
				kvadratOnemoguci(kvadrat4);
				kvadratOnemoguci(kvadrat5);
				kvadratOnemoguci(kvadrat6);
				kvadratOnemoguci(kvadrat7);
				kvadratOnemoguci(kvadrat8);
				btn_9_9.setEnabled(false);
			}
		});
	}
	
	
	public static void kvadratOnemoguci(JButton[] kvadrat) {
		for (JButton jButton : kvadrat) {
			jButton.setEnabled(false);
		}
	}
	
	public static void kvadratOmoguci(JButton[] kvadrat) {
		for (JButton jButton : kvadrat) {
			if(jButton.getText().equals("X") || jButton.getText().equals("O")) {
				jButton.setUI(new MetalButtonUI() {
					protected Color getDisabledTextColor() {
						Color c = Color.yellow;
						if(jButton.getText().equals("X"))
							c = Color.blue;
						if(jButton.getText().equals("O"))
							c = Color.red;
						return c;
					}
				});
				jButton.setEnabled(false);
			}	
			else 
				jButton.setEnabled(true);
			
		}
	}
	
	
}
