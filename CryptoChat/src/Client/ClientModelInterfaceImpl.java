package Client;

import BuisnessObjects.Message;
import BuisnessObjects.User;

public interface ClientModelInterfaceImpl {
	
	public Message createMessage(User usr, String msg);
}
