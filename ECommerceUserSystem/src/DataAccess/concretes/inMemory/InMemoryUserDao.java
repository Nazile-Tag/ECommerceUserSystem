package DataAccess.concretes.inMemory;

import java.util.List;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class InMemoryUserDao implements UserDao {
	
	private List<User> users;
	
	public InMemoryUserDao(List<User> users) {
		super();
		this.users = users;
	}

	@Override
	public void register(User user) {
		users.add(user);
		System.out.println("Kullanýcý kaydedildi" + user.getEmail());
		
	}

	@Override
	public void login(User user) {
		System.out.println("Kullanýcý giriþi baþarýlý" + user.getEmail());
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println("Kullanýcý silindi" + user.getEmail());
		
	}

	@Override
	public User getByMail(String mail) {
		for (User user : users) {
			if(user.getEmail().equals(mail)) {
				return user;
			}
		}
		return null;
	}



}
