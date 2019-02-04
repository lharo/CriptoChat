package Test;

import java.util.Date;

import Models.User;

public class UserTest {
	public static User getTestUser() {
		User usuario1 = new User();
		usuario1.setUserId(1);
		usuario1.setUserName("admin");
		usuario1.setPassword("root");
		usuario1.setCreatedAt(new Date());
		usuario1.setConnection(null);		
		return usuario1;
	}
}
