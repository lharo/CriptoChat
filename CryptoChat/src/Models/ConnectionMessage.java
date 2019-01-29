package Models;

import java.util.List;

/*
 * Content Codes for this class are:
 * 1. Create new user from the user object, chat id will be empty.
 * 2. Create new chat, a message will be sent to the user with the chat id.
 * 3. Request backup, List of Strings will be sent to the client.
 * 4.  
 */

public class ConnectionMessage {
	private User user;
	private Integer contentCode;
	private Integer genericId;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getContentCode() {
		return contentCode;
	}
	public void setContentCode(Integer contentCode) {
		this.contentCode = contentCode;
	}
	public Integer getGenericId() {
		return genericId;
	}
	public void setGenericId(Integer genericId) {
		this.genericId = genericId;
	}	
}
