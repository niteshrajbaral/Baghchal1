import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class EmailOTP extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtEnterYourOtp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EmailOTP dialog = new EmailOTP();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EmailOTP() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtEnterYourOtp = new JTextField();
			txtEnterYourOtp.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					if (txtEnterYourOtp.getText().equals("Enter your OTP")) {
						txtEnterYourOtp.setText("");
						txtEnterYourOtp.setForeground(Color.BLACK);
	                }
				}
				public void focusLost(FocusEvent e) {
					if (txtEnterYourOtp.getText().isEmpty()) {
						txtEnterYourOtp.setText("Enter your OTP");
						txtEnterYourOtp.setForeground(Color.GRAY);
	                }
				}
			});
			txtEnterYourOtp.setForeground(new Color(192, 192, 192));
			txtEnterYourOtp.setText("Enter your OTP");
			txtEnterYourOtp.setFont(new Font("Century Gothic", Font.PLAIN, 16));
			txtEnterYourOtp.setColumns(10);
			txtEnterYourOtp.setBounds(69, 102, 301, 59);
			contentPanel.add(txtEnterYourOtp);
		}
		{
			JButton okButton = new JButton("OK");
			okButton.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
			okButton.setActionCommand("OK");
			okButton.setBounds(88, 213, 122, 35);
			contentPanel.add(okButton);
		}
		{
			JButton cancelButton = new JButton("Cancel");
			cancelButton.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
			cancelButton.setActionCommand("Cancel");
			cancelButton.setBounds(219, 213, 122, 35);
			contentPanel.add(cancelButton);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Check your mail");
			lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
			lblNewLabel_1.setBounds(135, 45, 219, 35);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel = new JLabel("Send OTP Again");
			lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
			lblNewLabel.setBounds(160, 171, 112, 32);
			contentPanel.add(lblNewLabel);
		}
	}
}
