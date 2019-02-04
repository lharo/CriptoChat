package Shared;

import java.util.List;

import Models.MessageWTimestamp;
import Models.User;

public interface DatabaseInterface {
	public void initializeDatabase();
	public Integer createNewChat(Integer creatorId);
	public List<MessageWTimestamp> getBackup(Integer chatId);
	public User createNewUser(String usr, String pwd);
	public User createNewUser(User user);
}
