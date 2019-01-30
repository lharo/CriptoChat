package Server;

import Models.ConnectionMessage;
import Models.MessageMessage;

public interface ServerInterface {
	
	public void startServer();
	public void lookForConnections(); //New thread is instanced upon finding new connection
	public void forwardMessage(MessageMessage msg);
	public void keepListening();
	public void connectToDataBase();
	public void createServerSocket();
	public void addToChat(ConnectionMessage msg);
	public Integer createChat();
}
