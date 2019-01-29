package Server;

import java.net.Socket;

import Models.ChatRoom;

public class ChatRoomImpl implements Runnable {

	private ChatRoom chatRoom = new ChatRoom();
	
	public ChatRoomImpl(Socket tempSocket, ServerImpl serverImpl) {
		chatRoom.setConnectedSocket(tempSocket);
		chatRoom.setServer(serverImpl);
	}
	@Override
	public void run() {
		try {
			listenForMessages();
		}catch(Exception e) {
			
		}
	}
	private void listenForMessages() {
		// TODO Auto-generated method stub
		
	}

}
