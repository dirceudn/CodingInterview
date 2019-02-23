package authentication;

public enum ApiService {
	INSTANCE;
	
	
	public boolean authenticateOnRemote(String username, String password) {
		return true;
	}

}
