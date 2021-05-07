
import java.util.ArrayList;
import java.util.Scanner;

import Business.concretes.UserManager;
import Core.GoogleAuthManagerAdapter;
import DataAccess.concretes.inMemory.InMemoryUserDao;
import Entities.concretes.User;
import GoogleAuth.GoogleAuthManager;

public class Main {

	public static void main(String[] args) {
		System.out.println("1 - Giri� Yap \n2 - Kay�t Ol");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yapmak istedi�iniz i�lemi se�iniz");
        int selection = scanner.nextInt();
        if(selection == 1){

            System.out.println("1 - Google \n2 - Mail & Password");
            Scanner sc = new Scanner(System.in);
            System.out.println("Giri� Y�ntemi Se�iniz : ");
            int selection2 = sc.nextInt();
            if (selection2 == 1){
                User user = new User();
                user.setEmail("nazile1@nazile.com");
                User user2 = new User();
                user2.setEmail("nazile@nazile.com");
                user2.setPassword("abcdef");

                UserManager userManager = new UserManager(null, new GoogleAuthManagerAdapter(new GoogleAuthManager()));
                userManager.login(user);
                userManager.login(user2);
            }else if (selection2 == 2){
                User user = new User();
                user.setEmail("nazile1@nazile.com");
                User user2 = new User();
                user2.setEmail("nazile@nazile.com");
                user2.setPassword("abcdef");

                ArrayList<User> users = new ArrayList<>();
                UserManager userManager = new UserManager(new InMemoryUserDao(users), null);
                userManager.login(user);
                userManager.login(user2);
            }
        }
        else if (selection == 2) {

            ArrayList<User> users = new ArrayList<>();
            UserManager userManager = new UserManager(new InMemoryUserDao(users), null);
            User user = new User(1, "Nazile", "Ta�", "nazile@nazile.com", "abcdef");
            User user2 = new User(1, "Naz", "Tag", "nazile1@nazile.com", "abcdef");
            userManager.register(user);
            userManager.register(user2);
        }
	}

}
