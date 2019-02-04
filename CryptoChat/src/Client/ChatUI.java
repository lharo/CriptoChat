package Client;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Models.ChatRoom;
import Models.User;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class ChatUI {

	private JFrame frame;
	private User usuario;
	private JTextField textField;
	private ClientController controller;
	private JComboBox comboBox;
	
	/**
	 * Launch the application.
	 */
	public void chatInterface(ClientController controller) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatUI window = new ChatUI(controller);
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
	public ChatUI(ClientController controller) {
		setController(controller);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 778, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Preferences");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem = new JMenuItem("Edit User");
		mnNewMenu.add(menuItem);
		
		JMenu mnChat = new JMenu("Chat");
		menuBar.add(mnChat);
		
		JMenuItem mntmCreateChat = new JMenuItem("Create Chat");
		mnChat.add(mntmCreateChat);
		
		JMenuItem mntmLeaveAllChats = new JMenuItem("Leave All Chats");
		mnChat.add(mntmLeaveAllChats);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(177, 11, 555, 329);
		frame.getContentPane().add(textArea);
		
		textField = new JTextField();
		textField.setBounds(177, 343, 467, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("Send");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(643, 342, 89, 23);
		frame.getContentPane().add(button);
		
		comboBox = new JComboBox();
		comboBox.setBounds(10, 88, 157, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel label = new JLabel("Chats");
		label.setBounds(10, 63, 46, 14);
		frame.getContentPane().add(label);
		
		JButton btnGetChats = new JButton("Get Chats");
		btnGetChats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(ChatRoom chat : controller.getUserChats())
				{
					comboBox.addItem(chat.getChatRoomName());
				}
			}
		});
		btnGetChats.setBounds(63, 59, 89, 23);
		frame.getContentPane().add(btnGetChats);
	}

	public void setUser(User user) {
		this.usuario = user;
		System.out.println(usuario.getUserName() + " has entered the chatUI");
	}

	public void setController(ClientController controller) {
		if(controller != null)
		{
			this.controller = controller;
		}
	}
}
