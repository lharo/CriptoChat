package Server;

import BuisnessObjects.Message;

public interface ServerInterfaceImpl {
	
	public void startServer();
	public void lookForConnections(); //New thread is instanced upon finding new connection
	public void listenForMessage();
	public void forwardMessage(Message msg);
}
