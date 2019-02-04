package Client;

import java.util.ArrayList;
import java.util.List;

import Models.ChatRoom;
import Models.MessageWTimestamp;
import Models.User;
import Shared.DatabaseInterface;

public class DatabaseClient implements DatabaseInterface {

	@Override
	public void initializeDatabase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User createNewUser(User user) {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public User createNewUser(String usr, String pwd) {
		// TODO Auto-generated method stub
		return Test.UserTest.getTestUser();
	}

	public List<ChatRoom> getChats(Integer userId) {
		List<ChatRoom> chats = new ArrayList<ChatRoom>();
		chats.add(Test.ChatTest.getTestChatRoom());
		// TODO Auto-generated method stub
		return chats;
	}

	public User logInUser(String usr, String pwd) {
		// TODO Auto-generated method stub
		return Test.UserTest.getTestUser();
	}

}
