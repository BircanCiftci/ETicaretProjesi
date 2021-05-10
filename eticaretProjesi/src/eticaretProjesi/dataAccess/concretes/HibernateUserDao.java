package eticaretProjesi.dataAccess.concretes;

import java.util.List;

import eticaretProjesi.dataAccess.abstracts.UserDao;
import eticaretProjesi.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	@Override
	public void add(User user) {
			System.out.println("Hibernate ile kullanýcý eklendi. : " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
