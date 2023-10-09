import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

 import com.mysql.cj.jdbc.result.ResultSetMetaData;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.prefs.Preferences;

import javax.swing.JButton;

public class WelcomeFrame extends JFrame {

	private JPanel contentPane;
	public String username1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeFrame frame = new WelcomeFrame("Nitesh");
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
	public WelcomeFrame(String username1) {
		this.username1=username1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnExitGame = new JButton("Exit Game");
		btnExitGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExitGame.setForeground(Color.WHITE);
		btnExitGame.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		btnExitGame.setBorderPainted(false);
		btnExitGame.setBackground(new Color(0, 102, 255));
		btnExitGame.setBounds(699, 539, 209, 37);
		contentPane.add(btnExitGame);
		
		JButton btnViewStats = new JButton("View Stats");
		btnViewStats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StatTable st = new StatTable(username1);
				st.setVisible(true);
			
				
			}
		});
		btnViewStats.setForeground(Color.WHITE);
		btnViewStats.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		btnViewStats.setBorderPainted(false);
		btnViewStats.setBackground(new Color(0, 102, 255));
		btnViewStats.setBounds(699, 488, 209, 37);
		contentPane.add(btnViewStats);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Manish Shrestha");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(227, 579, 236, 31);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Developed by");
		lblNewLabel_2.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(227, 494, 236, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO BAGHCHAL");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Chiller", Font.PLAIN, 54));
		lblNewLabel_1.setBounds(318, 31, 590, 85);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nitesh raj Baral");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(227, 542, 236, 31);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Laxmi Kanta Poudel");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1.setBounds(227, 621, 236, 31);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JButton btnNewButton = new JButton("New Game");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 102, 255));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		btnNewButton.setBounds(699, 441, 209, 37);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				playSound();
				setVisible(false);
				NewGameFrame newFrame= new NewGameFrame(username1);
				newFrame.setVisible(true);
				
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src\\Tiger_and_goat.png"));
		lblNewLabel.setBounds(190, 0, 766, 723);
		contentPane.add(lblNewLabel);
	}

}
