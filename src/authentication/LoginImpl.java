package authentication;

public class LoginImpl implements ILogin {
	
	public LoginImpl() {};

	@Override
	public boolean authenticate(String username, String password) throws Exception {
		return ApiService.INSTANCE.authenticateOnRemote(username, password);
	}

}
