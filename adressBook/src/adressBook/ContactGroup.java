package adressBook;
import java.util.ArrayList;
import java.util.Scanner;


public class ContactGroup {

	private String label;
	
	private ArrayList<Contact>list;
	
	Scanner sc = new Scanner(System.in);
	
	public ContactGroup(String _label) 
	{
		this.label = _label;
		this.list = new ArrayList<Contact>();
	}
	
	public ArrayList <Contact> getList()
	{
		return list;
	}
	
	//Retourne le nom du label
	public String getLabel() 
	{
		return label;
	}
	
	
	public ContactGroup setLabel(String _label) 
	{
		this.label = _label;
		return this;
	}
	
	//Création du contact. public addContact(Contact):bool
	public Boolean addContact(Contact _contact)
	{
		if(null != this.getContact(_contact.getLabel())) 
		{
			return false;
		}
		
		return this.list.add(_contact);
		
		
		/*for(int i =0; i> list.size(); i++)//En ArrayList le list.Length n'existe pas
		{
			Contact contactActuel = list.get(i);
			if(contactActuel.getLabel().equals(_contact.getLabel())) 
			{
				return false;
			}
		}
		return this.list.add(_contact);*/
		
		
	}
	
	public Contact getContact(String _label) //Rechercher un contact par son nom. public getContact(String):Contact;
	{
		for(int i =0; i <this.list.size();i++) 
		{
			if(_label.equals(list.get(i).getLabel())) 
			{
				return this.list.get(i);
			}
		}
		return null;
	}
	//Supprimer un contact. public deletContact(String):bool;
	public Boolean deletContact(String _label)
	{
		for(Contact contactActuel : list) 
		{
			
			if(contactActuel.getLabel().equals(_label)) 
			{
				return list.remove(contactActuel);
			}
		}
		return false;
	}
	public ContactGroup clear() //Vider la liste. public Clear():Void;
	{
		list.clear();
		return this;
	}
	
	
	
	
	
	
	
	public String toString()
	{
		return "Le nom du group est : "+label+"\n" +
				"Les contacts sont : "+list+ "\n";
	}
	
	
	
	
	
	
}
