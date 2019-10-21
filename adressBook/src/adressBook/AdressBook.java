package adressBook;
import java.util.ArrayList;
public class AdressBook {

	
	private String contactGroups[];
	//private contactGroup [] listGroups;
	private String groupDefault;
	

	private ArrayList<ContactGroup>groups;
	
	public ArrayList<ContactGroup> getGroups()
	{
			
		return this.groups;
		
	}
	

	public String getGroupDefault() 
	{
		return groupDefault;
	}
	
	public AdressBook setGroupDefault(String groupDefault) //à finir
	{
		if(contactGroups.equals(groupDefault)) 
		{
			
		}
		
		return this;
		//this.groupDefault = groupDefault;
	}	

	
	public String[] getContactGroups() 
	{
		return contactGroups;
	}

	
	public AdressBook setContactGroups(String[] contactGroups) 
	{
		this.contactGroups = contactGroups;
		return this;
		
	}
	 	    
	
	public AdressBook(String[] _contactGroups) 
	{
		this.contactGroups = _contactGroups;
		this.groups = new ArrayList<ContactGroup>();
		this.groupDefault = groupDefault;
	}
	
	
	//Création du group. public addGroup():bool
	public Boolean addContactGroup(ContactGroup _groups) 
	{
		if(null != this.getContactGroups()) 
		{
			return false;
		}
		
		return this.groups.add(_groups);
	}
	
	//Supprimer un group.
		public Boolean deletGroup(String _contactGroups)
		{
			for(ContactGroup groupActuel : this.groups) 
			{
				
				if(groupActuel.getLabel().equals( _contactGroups)) 
				{
					return this.groups.remove(groupActuel);
				}
			}
			return false;
		}
		
		//Rechercher un groupe par son nom.
		
		public ContactGroup getContactGroup (String _contactGroups) 
		{
			for(int i = 0; i < this.groups.size(); i++) 
			{
				if(_contactGroups.equals (this.groups.get(i).getLabel())) 
				{
					return this.groups.get(i);
				}
			}
			return null;
		}
	
	
	
	public AdressBook clear() //Vide la liste des groupes.
	{
		groups.clear();
		return this;
		
	}
	
	
	
}
