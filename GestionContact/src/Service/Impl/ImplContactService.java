package Service.Impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.IContactDAO;
import DAO.Impl.ImplContactDAO;
import entites.Contact;

public class ImplContactService implements Service.IContactService {
	
	@Override
	public Contact createContact(String firstName, String lastName, String email)
	{
		Contact contact = new Contact();

		//IContactDAO contactdao= new ImplContactDAO();
		
		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		contact.setEmail(email);
		

		//contactdao.createContact(contact);
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new
				String[]{"applicationContext.xml"});
				IContactDAO daoC = (ImplContactDAO)context.getBean("beanImplContactDAO");
				Contact contact1 = (Contact)context.getBean("contactBean");
				//Contact contact2 = (Contact)context.getBean("contactBeanC");
		
			daoC.createContact(contact1);
		
		
		return contact;
	}

	@Override
	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContact(long id) {
		boolean reponse;
		IContactDAO contactdao= new ImplContactDAO();
		reponse=contactdao.deleteContact(id);
		
	
		
		
		
		return reponse;
	}

	@Override
	public Contact searchContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
