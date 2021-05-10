package eticaretProjesi;

import eticaretProjesi.business.abstracts.UserService;
import eticaretProjesi.business.concretes.EmailManager;
import eticaretProjesi.business.concretes.UserCheckManager;
import eticaretProjesi.business.concretes.UserManager;
import eticaretProjesi.core.JGoogleManagerAdapter;
import eticaretProjesi.dataAccess.concretes.HibernateUserDao;
import eticaretProjesi.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new HibernateUserDao(), new UserCheckManager(), new JGoogleManagerAdapter(), new EmailManager());

		User user = new User(1, "Bircan", "ÇÝFTÇÝ", "bircan@gmail.com", "125869");
		
		userService.login("bircan@gmail.com", "125869", user);
		
		System.out.println("-------------------------------------");
		
		userService.register(user);
		
		
	}

}
