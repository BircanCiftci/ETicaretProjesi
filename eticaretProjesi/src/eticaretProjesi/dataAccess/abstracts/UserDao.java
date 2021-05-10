package eticaretProjesi.dataAccess.abstracts;

import java.util.List;

import eticaretProjesi.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();
	User get(int id);
}
