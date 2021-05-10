package eticaretProjesi.core;

import eticaretProjesi.entities.concretes.User;
import eticaretProjesi.jGoogle.JGoogleManager;

public class JGoogleManagerAdapter implements GoogleService{

	@Override
	public void singUp(User user) {
		JGoogleManager googleManager = new JGoogleManager();
		googleManager.singUpWithGoogle(user);
		
	}

}
