package eticaretProjesi.business.concretes;

import java.util.List;

import eticaretProjesi.business.abstracts.EmailService;
import eticaretProjesi.business.abstracts.UserService;
import eticaretProjesi.core.GoogleService;
import eticaretProjesi.dataAccess.abstracts.UserDao;
import eticaretProjesi.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private UserCheckManager userCheckManager;
	private GoogleService googleService;
	private EmailService emailService;
	
	public UserManager(UserDao userDao, UserCheckManager userCheckManager, GoogleService googleService, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.userCheckManager = userCheckManager;
		this.googleService = googleService;
		this.emailService = emailService;
	}

	@Override
	public void register(User user) {
		if(userCheckManager.checkFirstName(user) && userCheckManager.checkLastName(user) && userCheckManager.checkPassword(user) && userCheckManager.checkEmail(user)) {
			userCheckManager.checkFirstName(user);
			userCheckManager.checkLastName(user);
			userCheckManager.checkPassword(user);
			userCheckManager.checkEmail(user);
		}
		System.out.println("Üye oldunuz.");	
		emailService.sendVerifyEmail(user);
		emailService.clickToVerifty(user);

	}

	@Override
	public void login(String email, String password, User user) {
		if(user.getEposta() == email && user.getPassword() == password) {
			System.out.println("Giriþ yaptýnýz.");
		}else {
			System.out.println("Kullanýcý bulunamadý! Lütfen bilgilerinizi kontrol ediniz.");
		}
		this.userDao.add(user);
		System.out.println("-------------------------------");
		this.googleService.singUp(user);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
