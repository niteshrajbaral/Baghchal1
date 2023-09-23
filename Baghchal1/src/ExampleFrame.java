import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class ExampleFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_0_p;
	private JTextField textField_1_s;
	private JTextField textField_2_d;
	private JTextField textField_3_gk;
	private JTextField textField_4_gr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExampleFrame frame = new ExampleFrame();
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
	public ExampleFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_9_1 = new JLabel("New label");
		lblNewLabel_9_1.setBounds(202, 32, 63, 61);
		contentPane.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(58, 32, 63, 61);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src\\board.png"));
		lblNewLabel.setBounds(0, 0, 751, 703);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Turn of :");
		lblNewLabel_1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(794, 29, 123, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("src\\goat-icon.png"));
		lblNewLabel_2.setBounds(910, 10, 75, 70);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Goat Killed: ");
		lblNewLabel_3.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(794, 114, 164, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Goat Remaining : ");
		lblNewLabel_4.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(794, 147, 212, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Enter Goat Position");
		lblNewLabel_5.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(794, 236, 266, 23);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Position :");
		lblNewLabel_6.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(794, 269, 129, 23);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Source : ");
		lblNewLabel_7.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(794, 302, 129, 23);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Dest : ");
		lblNewLabel_8.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(961, 302, 81, 23);
		contentPane.add(lblNewLabel_8);
		
		textField_0_p = new JTextField();
		textField_0_p.setBounds(910, 269, 37, 24);
		contentPane.add(textField_0_p);
		textField_0_p.setColumns(10);
		
		textField_1_s = new JTextField();
		textField_1_s.setColumns(10);
		textField_1_s.setBounds(910, 305, 37, 24);
		contentPane.add(textField_1_s);
		
		textField_2_d = new JTextField();
		textField_2_d.setColumns(10);
		textField_2_d.setBounds(1043, 302, 37, 24);
		contentPane.add(textField_2_d);
		
		JButton btnNewButton_p = new JButton("OK");
		btnNewButton_p.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		btnNewButton_p.setBounds(984, 269, 96, 25);
		contentPane.add(btnNewButton_p);
		
		JButton btnNewButton_1_s = new JButton("OK");
		btnNewButton_1_s.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		btnNewButton_1_s.setBounds(910, 349, 96, 25);
		contentPane.add(btnNewButton_1_s);
		
		textField_3_gk = new JTextField();
		textField_3_gk.setColumns(10);
		textField_3_gk.setBounds(1005, 117, 37, 24);
		contentPane.add(textField_3_gk);
		
		textField_4_gr = new JTextField();
		textField_4_gr.setColumns(10);
		textField_4_gr.setBounds(1005, 147, 37, 24);
		contentPane.add(textField_4_gr);
		
		JButton btnAskBotTo = new JButton("Ask Bot To Move");
		btnAskBotTo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		btnAskBotTo.setBounds(820, 445, 304, 29);
		contentPane.add(btnAskBotTo);
		
		JButton resetButton = new JButton("Reset");
		resetButton.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		resetButton.setBounds(794, 606, 104, 35);
		contentPane.add(resetButton);
		
		JButton exitButton = new JButton("Exit");
		exitButton.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		exitButton.setBounds(961, 606, 109, 35);
		contentPane.add(exitButton);
	}
}
