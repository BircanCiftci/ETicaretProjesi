package eticaretProjesi.business.concretes;

import eticaretProjesi.business.abstracts.EmailService;
import eticaretProjesi.entities.concretes.User;

public class EmailManager implements EmailService{

	@Override
	public void sendVerifyEmail(User user) {
		System.out.println("Do�rulama epostas� " + user.getEposta() + " adresinize g�nderildi. ");
		
	}

	@Override
	public void clickToVerifty(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kayd�n�z� do�rulamak i�in ba�lant�ya t�klay�n.");
		
	}

}
