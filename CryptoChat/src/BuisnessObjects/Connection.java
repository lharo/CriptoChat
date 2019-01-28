package BuisnessObjects;

import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Connection implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private ObjectOutputStream oos;

	public ObjectOutputStream getOos() {
		return oos;
	}

	public void setOos(ObjectOutputStream oos) {
		this.oos = oos;
	}
	
}
