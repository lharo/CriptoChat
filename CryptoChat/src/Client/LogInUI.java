package Client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import Models.User;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogInUI {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private ClientController controller;
	
	/**
	 * Launch the application.
	 */
	public void logIn(ClientController controller) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInUI window = new LogInUI(controller);
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
	public LogInUI(ClientController controller) {
		setController(controller);
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
		
		textField = new JTextField();
		textField.setBounds(91, 76, 223, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(91, 129, 223, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(91, 51, 46, 14);
		frame.getContentPane().add(lblUser);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(91, 104, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		JButton btnSignIn = new JButton("Register");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PreparedStatement stmt = con.prepareStatement("Insert Into Login where username='"+value1+"' && password='"+value2+"'");
				System.out.println("User Succesfully created");
				controller.logUser(textField.getText(), passwordField.getPassword().toString(), true);
				OpenChat(controller.getUser());
			}
		});
		btnSignIn.setBounds(87, 181, 89, 23);
		frame.getContentPane().add(btnSignIn);
		
		JButton button = new JButton("Log In");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PreparedStatement stmt = con.prepareStatement("SELECT * FROM login where username='"+value1+"' && password='"+value2+"'");
				//if(textField.getText().equals("admin") && passwordField.getPassword().equals("root"));
				
				controller.logUser(textField.getText(), passwordField.getPassword().toString(), false);
				System.out.println("LogIn succesful");
				OpenChat(controller.getUser());
			}

		});
		button.setBounds(225, 181, 89, 23);
		frame.getContentPane().add(button);
		
	}
	private void OpenChat(User user) {
		ChatUI chatUI = new ChatUI(controller);
		chatUI.setUser(user);
		if(controller != null) {
			System.out.println("Controller Still on the UI");
		}
		chatUI.chatInterface(controller);
	}

	public void setController(ClientController controller) {
		this.controller = controller;
		if(controller != null) {
			System.out.println("Controller Added to UI");
		}
	}
}
