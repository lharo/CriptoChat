package Client;

public class ClientImpl {

	private static ClientController controller;
	private static ClientModel model;
	
	public static void main(String[] args) {
		
		model = new ClientModel();
		controller = new ClientController(model);
		controller.connectToServer();
		controller.connectToLocalDataBase();
		
	}

}
