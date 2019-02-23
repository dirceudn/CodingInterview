package authentication;

public interface ILogin {

	public boolean authenticate(String username, String password) throws Exception;
	
}
