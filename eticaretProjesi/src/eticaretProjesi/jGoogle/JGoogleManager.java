package eticaretProjesi.jGoogle;

import eticaretProjesi.entities.concretes.User;

public class JGoogleManager {
	public void singUpWithGoogle(User user) {
		System.out.println("Google ile giri� yap�ld�. " + user.getFirstName() + " " + user.getLastName());
	}
}
