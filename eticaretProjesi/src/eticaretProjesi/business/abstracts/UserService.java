package eticaretProjesi.business.abstracts;

import java.util.List;

import eticaretProjesi.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(String email, String password, User user);
	List<User> getAll();
}
