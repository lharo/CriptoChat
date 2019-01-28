package Server;

import java.util.List;

import BuisnessObjects.Message;
import BuisnessObjects.User;

public class Server implements ServerInterfaceImpl {

	private List<User> users;
	
	@Override
	public void startServer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lookForConnections() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listenForMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void forwardMessage(Message msg) {
		// TODO Auto-generated method stub
		
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
