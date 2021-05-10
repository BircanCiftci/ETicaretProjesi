package eticaretProjesi.jGoogle;

import eticaretProjesi.entities.concretes.User;

public class JGoogleManager {
	public void singUpWithGoogle(User user) {
		System.out.println("Google ile giriþ yapýldý. " + user.getFirstName() + " " + user.getLastName());
	}
}
