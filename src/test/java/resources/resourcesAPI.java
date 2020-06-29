package resources;

public enum resourcesAPI {
	
	LoginAPI("/users/login"),
	SignupAPI(""),
	GetProfileAPI("v5/users/my-profile");
	
	private String resource;
	
	resourcesAPI(String resource){
		this.resource = resource;
	}
	
	public String getResource() {
		return resource;
	}
}
