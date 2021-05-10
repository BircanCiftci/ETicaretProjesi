package eticaretProjesi.business.concretes;

import eticaretProjesi.business.abstracts.EmailService;
import eticaretProjesi.entities.concretes.User;

public class EmailManager implements EmailService{

	@Override
	public void sendVerifyEmail(User user) {
		System.out.println("Doðrulama epostasý " + user.getEposta() + " adresinize gönderildi. ");
		
	}

	@Override
	public void clickToVerifty(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kaydýnýzý doðrulamak için baðlantýya týklayýn.");
		
	}

}
