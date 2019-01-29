package Models;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class Server {
	
	private List<Chat> activeChats; 
	private Boolean isActive;
	private ServerSocket serverSocket;
	private Integer localSocketPort;
	private Socket dummySocket;
	
	public Integer getLocalSocketPort() {
		return localSocketPort;
	}
	public void setLocalSocketPort(Integer localSocketPort) {
		this.localSocketPort = localSocketPort;
	}
	public List<Chat> getActiveChats() {
		return activeChats;
	}
	public void setActiveChats(List<Chat> activeChats) {
		this.activeChats = activeChats;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public ServerSocket getServerSocket() {
		return serverSocket;
	}
	public void setServerSocket(ServerSocket serverSocket) {
		this.serverSocket = serverSocket;
	}
	public Socket getDummySocket() {
		return dummySocket;
	}
	public void setDummySocket(Socket dummySocket) {
		this.dummySocket = dummySocket;
	}
	
}
