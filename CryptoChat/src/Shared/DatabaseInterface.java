package Shared;

import java.util.List;

import Models.ConnectionMessage;
import Models.MessageWTimestamp;
import Models.User;

public interface DatabaseInterface {
	public void initializeDatabase();
	public User createNewUser(User user);
	public Integer createNewChat(Integer creatorId);
	public List<MessageWTimestamp> getBackup(Integer chatId);
}
