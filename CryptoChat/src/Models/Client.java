package Models;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import Client.DatabaseClient;

public class Client {
	private Socket localSocket;
	private Integer port;
	private User user;
	private ObjectOutputStream serverOutput;
	private ObjectInputStream serverInput;
	private DatabaseClient dbClient;
	private Boolean isConnected;
	
	public Socket getLocalSocket() {
		return localSocket;
	}
	public void setLocalSocket(Socket localSocket) {
		this.localSocket = localSocket;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ObjectOutputStream getServerOutput() {
		return serverOutput;
	}
	public void setServerOutput(ObjectOutputStream serverOutput) {
		this.serverOutput = serverOutput;
	}
	public ObjectInputStream getServerInput() {
		return serverInput;
	}
	public void setServerInput(ObjectInputStream serverInput) {
		this.serverInput = serverInput;
	}
	public DatabaseClient getDbClient() {
		return dbClient;
	}
	public void setDbClient(DatabaseClient dbClient) {
		this.dbClient = dbClient;
	}
}
