
package Client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import Models.Connection;
import Models.ConnectionMessage;
import Models.MessageMessage;
import Models.User;

public class ClientHandler implements Runnable{
	private Socket connectedSocket;
	private ClientController clientController;
	private ObjectOutputStream oos; 
    private ObjectInputStream ois;
    private boolean isAlive = true;
    
    public ClientHandler(ClientController clientController) {
    	this.clientController = clientController;
    	
    }
    public void connectToServer() {
		for(int port = JavaUtil.Constants.MIN; port <= JavaUtil.Constants.MIN; port++) {
			try {
				connectedSocket =  new Socket("127.0.0.1", port);
				System.out.println("Found connection at port " + port);
				break;
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
	}
    public void forwardMessage(ConnectionMessage msg) {
    	try {
			oos.writeObject(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void getMessage() throws ClassNotFoundException {
		System.out.println("Listening for messages");

		while(isAlive) {
			MessageMessage receivedMessage; 
			try {
				receivedMessage = (MessageMessage) ois.readObject();
				System.out.println("Received message from " + receivedMessage.getSenderId());
				processObject(receivedMessage);
				
			} catch (IOException e) {
				System.out.println("Error reading message");
				break;
			}
		}
	}

	private void processObject(MessageMessage receivedMessage) {
		if(receivedMessage.getChatId() == clientController.getCurrentChat().getChatRoomId()) {
			//Set Message on Interface
		}
		else {
			//Save Message on Database for change of chat
		}
	}
	@Override
	public void run() {
		connectToServer();
		try {
			ois = new ObjectInputStream(this.connectedSocket.getInputStream());
			oos = new ObjectOutputStream(this.connectedSocket.getOutputStream());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		User u = clientController.getUser();
		Connection conn = new Connection();
		conn.setConnectedOutput(oos);
		u.setConnection(conn);
		
		try {
			getMessage();
		} catch (ClassNotFoundException e) {
			System.out.println("Coudln't listen for another message");
		}
	}
	public Socket getConnectedSocket() {
		return connectedSocket;
	}
	public void setConnectedSocket(Socket connectedSocket) {
		this.connectedSocket = connectedSocket;
	}
	public ClientController getClientController() {
		return clientController;
	}
	public void setClientController(ClientController clientController) {
		this.clientController = clientController;
	}
	public ObjectOutputStream getOos() {
		return oos;
	}
	public void setOos(ObjectOutputStream oos) {
		this.oos = oos;
	}
	public ObjectInputStream getOis() {
		return ois;
	}
	public void setOis(ObjectInputStream ois) {
		this.ois = ois;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
}
