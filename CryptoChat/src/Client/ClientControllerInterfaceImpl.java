package Client;

import java.util.List;

import BuisnessObjects.Message;

public interface ClientControllerInterfaceImpl {
	
	public void logUser();
	public List<Message> readCachedMessages();
	public void connectToServer();
	public List<Message> lookForNewMessages();
	public void keepListening();
	public void sendMessage();
	void connectToLocalDataBase();
	
}
