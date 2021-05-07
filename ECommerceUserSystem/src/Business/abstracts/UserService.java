package Business.abstracts;

import Entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user);
	void delete(User user);
	User getByMail(String mail);
}
