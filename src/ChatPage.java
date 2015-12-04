import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.ScrollPane;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Button;

public class ChatPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatPage window = new ChatPage();
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
	public ChatPage() {
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
		
		Label label = new Label("KellimniFejnTrid Chat Page");
		label.setAlignment(Label.CENTER);
		label.setBounds(48, 11, 334, 22);
		frame.getContentPane().add(label);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(27, 47, 380, 160);
		frame.getContentPane().add(textArea);
		
		Label label_1 = new Label("Chat: ");
		label_1.setBounds(37, 213, 42, 22);
		frame.getContentPane().add(label_1);
		
		TextField chatTextField = new TextField();
		chatTextField.setBounds(85, 213, 234, 22);
		frame.getContentPane().add(chatTextField);
		
		Button sendButton = new Button("Send");
		sendButton.setBounds(324, 213, 70, 22);
		frame.getContentPane().add(sendButton);
	}
}
