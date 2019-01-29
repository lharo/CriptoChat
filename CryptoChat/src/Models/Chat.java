package Models;

import java.io.ObjectOutputStream;
import java.util.List;

public class Chat {
	private List<User> members;
	private Integer chatRoomId;
	private ObjectOutputStream chatOutput;
	
	public List<User> getMembers() {
		return members;
	}
	public void setMembers(List<User> members) {
		this.members = members;
	}
	public Integer getChatRoomId() {
		return chatRoomId;
	}
	public void setChatRoomId(Integer chatRoomId) {
		this.chatRoomId = chatRoomId;
	}
	public ObjectOutputStream getChatOutput() {
		return chatOutput;
	}
	public void setChatOutput(ObjectOutputStream chatOutput) {
		this.chatOutput = chatOutput;
	}	
}
