package authentication;

public class AuthenticationService {

	private static ILogin loginProvider = new LoginImpl();

	public static void login(String username, String password) throws Exception {
		loginProvider.authenticate(username, password);
	}
}
