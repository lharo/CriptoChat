package Client;

import java.util.ArrayList;
import java.util.List;

import Models.ChatRoom;
import Models.MessageWTimestamp;
import Models.User;
import Shared.DatabaseInterface;
import Test.UserTest;

public class DataBaseClient implements DatabaseInterface{

	@Override
	public void initializeDatabase() {
		
	}

	public User logInUser(String usr, String pwd) {
		return UserTest.getTestUser();
	}
	
	@Override
	public User createNewUser(String usr, String pwd) {
		// TODO Auto-generated method stub
		return UserTest.getTestUser();
	}

	@Override
	public Integer createNewChat(Integer creatorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MessageWTimestamp> getBackup(Integer chatId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ChatRoom> getChats(Integer id) {
		List<ChatRoom> chats = new ArrayList<ChatRoom>();
		chats.add(Test.ChatTest.getTestChatRoom());
		return chats;
	}

	@Override
	public User createNewUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
