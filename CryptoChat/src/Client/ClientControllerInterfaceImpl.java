package Client;

import java.util.List;

import Models.MessageMessage;

public interface ClientControllerInterfaceImpl {
	
	public List<MessageMessage> readCachedMessages();
	public void connectToServer();
	public void keepListening();
	public void sendMessage();
	void connectToLocalDataBase();
	public void logUser(String usr, String pwd, Boolean isNew);
	
}
