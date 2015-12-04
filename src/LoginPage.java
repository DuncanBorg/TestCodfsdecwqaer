import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Button;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label usernameLabel = new Label("Username:");
		usernameLabel.setBounds(44, 85, 62, 22);
		frame.getContentPane().add(usernameLabel);
		
		Label passwordLabel = new Label("Password:");
		passwordLabel.setBounds(44, 133, 62, 22);
		frame.getContentPane().add(passwordLabel);
		
		TextField usernameText = new TextField();
		usernameText.setBounds(128, 85, 200, 22);
		frame.getContentPane().add(usernameText);
		
		TextField passwordText = new TextField();
		passwordText.setBounds(128, 133, 200, 22);
		frame.getContentPane().add(passwordText);
		
		Label title = new Label("KellimniFejnTrid Login Page");
		title.setAlignment(Label.CENTER);
		title.setBounds(47, 29, 281, 22);
		frame.getContentPane().add(title);
		
		Button loginButton = new Button("Log In");
		loginButton.setBounds(183, 191, 70, 22);
		frame.getContentPane().add(loginButton);
	}

//	private static void addPopup(Component component, final JPopupMenu popup) {
//	}
}
