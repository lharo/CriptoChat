package Models;

import java.io.Serializable;
import java.util.List;

public class MessageMessage implements Serializable{

	private static final long serialVersionUID = 1L;
	private List<MessageWTimestamp> messages;
	private Integer chatId;
	private Integer senderId;
	
	public List<MessageWTimestamp> getMessages() {
		return messages;
	}
	public void setMessages(List<MessageWTimestamp> messages) {
		this.messages = messages;
	}
	public Integer getChatId() {
		return chatId;
	}
	public void setChatId(Integer chatId) {
		this.chatId = chatId;
	}
	public Integer getSenderId() {
		return senderId;
	}
	public void setSenderId(Integer senderId) {
		this.senderId = senderId;
	}
}
