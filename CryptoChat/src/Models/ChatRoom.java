package Models;

import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

public class ChatRoom {
	
	private Integer chatRoomId;
	private String chatRoomName;
	private Date createdAt;
	private String[] users;
	private Boolean isActive;
	private Socket connectedSocket;
	private ObjectInputStream connectedInput;
	
	public Integer getChatRoomId() {
		return chatRoomId;
	}
	public void setChatRoomId(Integer chatRoomId) {
		this.chatRoomId = chatRoomId;
	}
	public String getChatRoomName() {
		return chatRoomName;
	}
	public void setChatRoomName(String chatRoomName) {
		this.chatRoomName = chatRoomName;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String[] getUsers() {
		return users;
	}
	public void setUsers(String[] users) {
		this.users = users;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Socket getConnectedSocket() {
		return connectedSocket;
	}
	public void setConnectedSocket(Socket connectedSocket) {
		this.connectedSocket = connectedSocket;
	}
	public ObjectInputStream getConnectedInput() {
		return connectedInput;
	}
	public void setConnectedInput(ObjectInputStream connectedInput) {
		this.connectedInput = connectedInput;
	}
	
}
