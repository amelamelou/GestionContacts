package DAO;
import entites.Contact;




public interface IContactDAO {
	
public void createContact(Contact contact);

public boolean deleteContact(Contact contact);

public Contact updateContact(Contact contact);

}