package adressBook;
import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {
		
		
		
		Contact monContact = new Contact("monLabel");
		
		System.out.println("Avant :"+ monContact.getLabel());
		
		monContact.setLabel("Kaibushin");
		String monLabel = monContact.setLabel("Ka�bushin")
				.setLastName("Diroian")
				.setFirstName("charly")
				.setPhone("0652315979")
				.getLabel();
		
		monContact.setLabel("Ka�bushin");
		monContact.setLastName("Diroian");
		monContact.setFirstName("charly");
		monContact.setPhone("0652315979");
		monContact.getLabel();
		
		
		
		
		
		
		//String monLabel = monContact.getLabel();
		
		System.out.println("Apr�s :"+ monContact.getLabel());
		
		ContactGroup mesContacts = new ContactGroup("Amis!");
		
		System.out.println("Avant :"+ mesContacts.getLabel());
		
		mesContacts.setLabel("Mes Amis!");
		
		String mesLabel = mesContacts.getLabel();
		
		System.out.println("Apr�s : "+ mesContacts.getLabel());

	}

}
