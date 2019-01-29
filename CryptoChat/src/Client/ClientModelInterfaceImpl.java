package Client;

import Models.ConnectionMessage;
import Models.User;

public interface ClientModelInterfaceImpl {
	
	public ConnectionMessage createMessage(User usr, String msg);
}
