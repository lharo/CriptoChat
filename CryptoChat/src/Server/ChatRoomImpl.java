package Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

import Models.ChatRoom;
import Models.ConnectionMessage;
import Models.MessageWTimestamp;

public class ChatRoomImpl implements Runnable {

	private ChatRoom chatRoom = new ChatRoom();
	private DatabaseServer dbServer = new DatabaseServer();
	
	public ChatRoomImpl(Socket tempSocket, ServerImpl serverImpl) {
		chatRoom.setConnectedSocket(tempSocket);		
	}
	@Override
	public void run() {
		try {
			listenForMessages();
		}catch(Exception e) {
			
		}
	}
	private void listenForMessages() {
		System.out.println("Listening for messages");
		try {
			chatRoom.setConnectedInput(new ObjectInputStream(chatRoom.getConnectedSocket().getInputStream()));
			
		} catch (IOException e) {
			chatRoom.setIsActive(false);
			System.out.println("Lost connection");
		}
		while(chatRoom.getIsActive()) {
			ConnectionMessage receivedMessage; 
			try {
				receivedMessage = (ConnectionMessage) chatRoom.getConnectedInput().readObject();
				System.out.println("Received message with the content code" + receivedMessage.getContentCode());
				processObject(receivedMessage);
				
			} catch (IOException | ClassNotFoundException e) {
				System.out.println("Error reading message");
				break;
			}
		}		
	}
	private void processObject(ConnectionMessage receivedMessage) {
		switch(receivedMessage.getContentCode()) {
			//For every case make sure message has room to give the sender id so that it can be sent to them or not depending on the requirements
			//Likewise change the forwardMessage function to reflect this
			case 1:{
				dbServer.createNewUser(receivedMessage.getUser());
				//Compose answer with cc 1 and new user id;
				break;
			}
			case 2:{
				Integer newChatId = dbServer.createNewChat(receivedMessage.getUser().getUserId());
				//Compose answer with cc 2 and the new chat id
				break;
			}
			case 3:{
				List<MessageWTimestamp> chatBackUp = dbServer.getBackup(receivedMessage.getGenericId());
				//Compose answer with cc 3 and figure out how to send the list
				break;
			}
			default:{
				System.out.println("There was something wrong with the message " + receivedMessage.getGenericId() );
				break;
			}
		}
	}

}
