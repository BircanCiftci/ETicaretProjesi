package eticaretProjesi.business.abstracts;

import eticaretProjesi.entities.concretes.User;

public interface EmailService {
	void sendVerifyEmail(User user);
	void clickToVerifty(User user);
}
