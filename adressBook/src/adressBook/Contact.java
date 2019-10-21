package adressBook;


public class Contact{
	
	private String label;
	
	private String lastName;
	
	private String firstName;
	
	private String phone;
	
	private String email;
	
	private String photo;
	
	
	
	
	public Contact(String _label) 
	{
		this.setLabel(_label);
	}
	
	
	public String getLabel() {
		
		return label;
	}

	public Contact setLabel(String label) {
		
		//on défintnit une longueur minimum du label de 2 caractères.
		if(label.length()>=2) {
			this.label = label;
		}
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public Contact setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public Contact setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	//on défintnit une longueur minimum du téléphone
	public Contact setPhone(String phone) {
		
		if(phone.length() >= 2 && phone.length()<=15) 
		{
			this.phone = phone;
		}
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Contact setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getPhoto() {
		return photo;
	}

	public Contact setPhoto(String photo) {
		this.photo = photo;
		return this;
	}

	
	@Override
	public String toString() {
		return label +"\n"+lastName+"\n"+firstName+"\n"+ phone +"\n";
	}
}
