package Client;

import java.util.List;

import Models.MessageMessage;
import Models.User;

public interface ClientControllerInterfaceImpl {
	
	public void logUser();
	public User createUser();
	public List<MessageMessage> readCachedMessages();
	public void connectToServer();
	public void keepListening();
	public void sendMessage();
	void connectToLocalDataBase();
}
