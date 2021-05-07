package GoogleAuth;

import Entities.concretes.User;

public class GoogleAuthManager {
	
	public void register(User user) {
		System.out.println("Kullanýcý Google ile eklendi :" + user.getFirstName() +""+ user.getLastName().toUpperCase());
	}
	
	public void login(User user) {
		System.out.println("Goggle ile giriþ yapýldý :" +user.getEmail());
	}
}
