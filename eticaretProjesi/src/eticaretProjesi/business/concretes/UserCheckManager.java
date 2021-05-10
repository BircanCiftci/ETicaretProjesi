package eticaretProjesi.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eticaretProjesi.business.abstracts.UserCheckService;
import eticaretProjesi.entities.concretes.User;

public class UserCheckManager implements UserCheckService{
	public static final String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	
	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length() <= 5) {
			System.out.println("Lütfen parolanýzý en az 6 karakterli yapýnýz.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkFirstName(User user) {
		if(user.getFirstName().length() <= 1) {
			System.out.println("Adýnýz en az 2 karakterden oluþmalýdýr.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(User user) {
		if(user.getLastName().length() <= 1) {
			System.out.println("Soyadýnýz en az 2 karakterden oluþmalýdýr.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkEmail(User user) {
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEposta());
		if(!matcher.matches()) {
			System.out.println("E-postanýz formata uymamaktadýr.");
			return false;
		}
		return true;
	}
	
}
