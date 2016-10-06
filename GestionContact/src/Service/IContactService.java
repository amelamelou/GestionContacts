package Service;

import entites.Contact;

public interface IContactService {
	
	public Contact createContact(String firstName, String lastName, String email);
	
	public Contact updateContact(Contact contact);
	
	public boolean deleteContact(long id);
	
	public Contact searchContact(Contact contact);

}
