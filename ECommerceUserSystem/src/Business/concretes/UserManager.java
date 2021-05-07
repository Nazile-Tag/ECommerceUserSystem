package Business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Business.abstracts.UserService;
import Core.AuthService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private AuthService authService;

	public UserManager(UserDao userDao, AuthService authService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
	}

	@Override
	public void register(User user) {
		if(user.getPassword().length() <6) {
			System.out.println("�ifreniz en az 6 karakter olmal�d�r.");
			return;
		}
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getEmail());
        if (!matcher.matches()) {
            System.out.println("Mail adresi e posta format�nda olmal�d�r(example@example.com)");
            return;
        }
		
	}

	@Override
	public void login(User user) {
		if(user.getEmail() ==null || user.getPassword() ==null) {
			System.out.println("Email ve �ifre alan� bo� b�rak�lamaz");
		}
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public User getByMail(String mail) {
		return userDao.getByMail(mail);
		
	}

}
