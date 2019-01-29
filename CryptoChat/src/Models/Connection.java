package Models;

import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Connection implements Serializable{

	private static final long serialVersionUID = 1L;
	private ObjectOutputStream connectedOutput;
	public ObjectOutputStream getConnectedOutput() {
		return connectedOutput;
	}
	public void setConnectedOutput(ObjectOutputStream connectedOutput) {
		this.connectedOutput = connectedOutput;
	}
	
}
