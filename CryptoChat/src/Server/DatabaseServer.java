package Server;

import java.util.List;

import Models.ConnectionMessage;
import Models.MessageWTimestamp;
import Models.User;
import Shared.DatabaseInterface;

public class DatabaseServer implements DatabaseInterface {

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
	public List<MessageWTimestamp> getBackup(Integer chatId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer createNewChat(Integer creatorId) {
		// TODO Auto-generated method stub
		return null;
	}

}
