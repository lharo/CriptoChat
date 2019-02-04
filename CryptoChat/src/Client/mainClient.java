package Client;

public class mainClient {

	public static void main(String[] args) {
		
		ClientController controller = new ClientController();
		LogInUI ui = new LogInUI(controller);
		ui.logIn(controller);
	}	
}


