package resources;

import TreblePojo.Login;

public class TestDataBuild {
	
	public Login login() {
	
		Login login = new Login();
		
	    login.setEmail_id("rajnish.kumar@kiwitech.com");
	    login.setPassword("Fran@12345");
	    login.setDevice_id("12345");
	    login.setDevice_type("WEB");
	    
	    return login;
	}
}
