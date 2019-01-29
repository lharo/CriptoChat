package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import Models.Chat;
import Models.ConnectionMessage;
import Models.MessageMessage;
import Models.Server;
import Models.User;

public class ServerImpl implements ServerInterface {

	private Server server = new Server();
	
	@Override
	public void startServer() {		
		connectToDataBase(); //Missing
		createServerSocket();
		lookForConnections();
		keepListening();
	}

	@Override
	public void lookForConnections() {
		for(int port = JavaUtil.Constants.MIN; port <= JavaUtil.Constants.MAX; port++) {
			if(port != server.getLocalSocketPort()) {
				try {
					Socket tempSocket = new Socket("127.0.0.1", port);
						System.out.println("Connected to previously existing node at port " + port);
					new Thread(new ChatRoomImpl(tempSocket, this)).start();;
				} catch (UnknownHostException e) {
					e.printStackTrace();
					System.out.println("Unknown Host Exception");
				} catch (IOException e) {}
			}
		}	
	}
	@Override
	public void forwardMessage(MessageMessage msg) {
		for(Chat c : server.getActiveChats()) {
			if(c.getChatRoomId() == msg.getChatId()) {
				for(User u : c.getMembers()) {
					try {
						u.getConnection().getConnectedOutput().writeObject(msg);
						System.out.println("The message was sent to the user: " + u.getUserName());
					} catch (IOException e) {
						System.out.println("Failed to send message to: " + u.getUserName());
					}
				}
			}
		}
	}
	@Override
	public void keepListening() {
		while(server.getIsActive()) {
			try {
				server.setDummySocket(server.getServerSocket().accept());
				System.out.println("New connection found at port: " + server.getDummySocket().getPort());
				new Thread(new ChatRoomImpl(server.getDummySocket(), this)).start();;
				
			} catch (IOException e) {
				System.out.println("Coudln't accept new connection");
				e.printStackTrace();
			}
		}
	}
	@Override
	public void connectToDataBase() {
		
	}
	@Override
	public void createServerSocket() {
		for(int port = JavaUtil.Constants.MIN; port <= JavaUtil.Constants.MIN; port++) {
			try {
				server.setServerSocket(new ServerSocket(port));
				System.out.println("Connection at port: " + port);
				server.setLocalSocketPort(port);
				server.setIsActive(true);
				break;
			} catch (IOException e) {
				System.out.println("Not possible to connect at port: " + port);
			}
		}
	}

	@Override
	public void addToChat(ConnectionMessage msg) {
		for(Chat c : server.getActiveChats()){
			if(c.getChatRoomId() == msg.getGenericId()) {
				c.getMembers().add(msg.getUser());
				return;
			}
		}
	}
	
}
