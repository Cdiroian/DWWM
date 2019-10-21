package adressBook;
import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {
		
		
		
		Contact monContact = new Contact("monLabel");
		
		System.out.println("Avant :"+ monContact.getLabel());
		
		monContact.setLabel("Kaibushin");
		String monLabel = monContact.setLabel("Kaïbushin")
				.setLastName("Diroian")
				.setFirstName("charly")
				.setPhone("0652315979")
				.getLabel();
		
		monContact.setLabel("Kaïbushin");
		monContact.setLastName("Diroian");
		monContact.setFirstName("charly");
		monContact.setPhone("0652315979");
		monContact.getLabel();
		
		
		
		
		
		
		//String monLabel = monContact.getLabel();
		
		System.out.println("Aprés :"+ monContact.getLabel());
		
		ContactGroup mesContacts = new ContactGroup("Amis!");
		
		System.out.println("Avant :"+ mesContacts.getLabel());
		
		mesContacts.setLabel("Mes Amis!");
		
		String mesLabel = mesContacts.getLabel();
		
		System.out.println("Aprés : "+ mesContacts.getLabel());

	}

}
