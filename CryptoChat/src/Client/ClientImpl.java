package Client;

public class ClientImpl {

	private static ClientController controller;
	private static ClientModel model;
	
	public static void main(String[] args) {
		
		model = new ClientModel();
		controller = new ClientController(model);
		
		//Waits for input on javaFX APP either sign In or 
		
		controller.connectToServer();
		//Gotta create it somewhere
		controller.connectToLocalDataBase();
		
	}

}
