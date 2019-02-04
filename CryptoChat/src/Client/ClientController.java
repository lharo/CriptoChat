package Client;

import java.util.List;

import Models.ChatRoom;
import Models.Connection;
import Models.MessageMessage;
import Models.User;

public class ClientController implements ClientControllerInterfaceImpl {
	
	private User user;
	private ChatRoom currentChat;
	private List<ChatRoom> userChats;
	private ClientHandler handler;
	private DatabaseClient dbClient;
	private ChatUI chatUi;


	
	@Override
	public void logUser(String usr, String pwd, Boolean isNew) {
		connectToLocalDataBase();
		if(isNew) user = dbClient.createNewUser(usr, pwd);
		else user = dbClient.logInUser(usr, pwd);
		connectToServer();
		Connection con = new Connection();
		con.setConnectedOutput(handler.getOos());
		user.setConnection(con);
		//Retrieve User Chats
		List<ChatRoom> chats = dbClient.getChats(user.getUserId());
		for(ChatRoom chat : chats) {
			System.out.println("Registered Chat");
			chat.setConnectedInput(handler.getOis());
			chat.setConnectedSocket(handler.getConnectedSocket());
		}
		userChats = chats;
	}

	@Override
	public void connectToLocalDataBase() {
		dbClient = new DatabaseClient();
	}

	@Override
	public List<MessageMessage> readCachedMessages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void connectToServer() {
		handler = new ClientHandler(this);
		new Thread(handler).start();		
	}

	@Override
	public void keepListening() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ChatRoom getCurrentChat() {
		return currentChat;
	}

	public void setCurrentChat(ChatRoom currentChat) {
		this.currentChat = currentChat;
	}

	public List<ChatRoom> getUserChats() {
		return userChats;
	}

	public void setUserChats(List<ChatRoom> userChats) {
		this.userChats = userChats;
	}

	public ChatUI getChatUi() {
		return chatUi;
	}

	public void setChatUi(ChatUI chatUi) {
		this.chatUi = chatUi;
	}

	@Override
	public void logUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User createUser() {
		// TODO Auto-generated method stub
		return null;
	}
}
