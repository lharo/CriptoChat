package Test;

import java.util.Date;

import Models.ChatRoom;

public class ChatTest {
	public static ChatRoom getTestChatRoom() {
		ChatRoom chat = new ChatRoom();
		chat.setChatRoomId(1);
		chat.setChatRoomName("Test Chat Room");
		chat.setCreatedAt(new Date());
		chat.setIsActive(true);
		return chat;
	}
}
