package Service.Impl;

import DAO.IContactDAO;
import DAO.Impl.ImplContactDAO;
import entites.Contact;

public class ImplContactService implements Service.IContactService {
	
	@Override
	public Contact createContact(String firstName, String lastName, String email)
	{
		Contact contact = new Contact();

		IContactDAO contactdao= new ImplContactDAO();
		
		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		contact.setEmail(email);
		

		contactdao.createContact(contact);
		
		
		return contact;
	}

	@Override
	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contact searchContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
