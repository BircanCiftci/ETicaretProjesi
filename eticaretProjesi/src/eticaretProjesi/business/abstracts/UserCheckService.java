package eticaretProjesi.business.abstracts;

import eticaretProjesi.entities.concretes.User;

public interface UserCheckService {
	boolean checkPassword(User user);
	boolean checkFirstName(User user);
	boolean checkLastName(User user);
	boolean checkEmail(User user);
}
