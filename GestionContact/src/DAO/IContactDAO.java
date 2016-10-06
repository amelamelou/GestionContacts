package DAO;
import java.util.TreeSet;

import entites.Contact;




public interface IContactDAO {
	
public void createContact(Contact contact);

public Contact readContact(Contact contact);

public TreeSet<Contact> readContact();

public Contact updateContact(Contact contact);

public boolean deleteContact(Contact contact);


}