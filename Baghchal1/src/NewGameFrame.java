import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class NewGameFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewGameFrame frame = new NewGameFrame();
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
	public NewGameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnNewButton_2_1 = new JButton("Play with Bot");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BotFrameStartup start= new BotFrameStartup();
				start.main(null);
				dispose();
			}
		});
		btnNewButton_2_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Consolas", Font.PLAIN, 25));
		btnNewButton_2_1.setBorderPainted(false);
		btnNewButton_2_1.setIcon(new ImageIcon("src\\bot.png"));
		btnNewButton_2_1.setBackground(new Color(0, 102, 204));
		btnNewButton_2_1.setBounds(657, 470, 324, 91);
		contentPane.add(btnNewButton_2_1);
		
		
		JButton btnNewButton = new JButton("Play Locally");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultiPlayStartup gameFrame= new MultiPlayStartup();
				gameFrame.main(null);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(0, 102, 204));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton.setIconTextGap(1);
		btnNewButton.setIcon(new ImageIcon("src\\play_with_friend.png"));
		btnNewButton.setFont(new Font("Consolas", Font.PLAIN, 25));
		btnNewButton.setBounds(657, 330, 324, 91);
		contentPane.add(btnNewButton);
			
		
		JLabel lblNewLabel_1 = new JLabel("Let The Game Begin");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Chiller", Font.PLAIN, 60));
		lblNewLabel_1.setBounds(419, 33, 469, 73);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src\\goat-on-mountain.png"));
		lblNewLabel.setBounds(243, 0, 768, 713);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("src\\back-arrow.png"));
		lblNewLabel_2.setBounds(53, 62, 45, 39);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Create and show the new JFrame when the label is clicked
                WelcomeFrame newFrame = new WelcomeFrame();
                newFrame.setVisible(true);
                dispose();
            }
        });
		contentPane.add(lblNewLabel_2);
	}
}
