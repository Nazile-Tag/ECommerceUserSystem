package Core;

import Entities.concretes.User;
import GoogleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {
	
	private final GoogleAuthManager googleAuthManager;

	public GoogleAuthManagerAdapter(GoogleAuthManager googleAuthManager) {
		super();
		this.googleAuthManager = googleAuthManager;
	}

	@Override
	public void register(User user) {
		googleAuthManager.register(user);
		
	}

	@Override
	public void login(User user) {
		googleAuthManager.login(user);
		
	}

}
