package GoogleAuth;

import Entities.concretes.User;

public class GoogleAuthManager {
	
	public void register(User user) {
		System.out.println("Kullan�c� Google ile eklendi :" + user.getFirstName() +""+ user.getLastName().toUpperCase());
	}
	
	public void login(User user) {
		System.out.println("Goggle ile giri� yap�ld� :" +user.getEmail());
	}
}
