package DAO.Impl;
import java.util.TreeSet;

import org.hibernate.Session;

import DAO.IContactDAO;
import entites.Contact;
import util.HibernateUtil;

public class ImplContactDAO implements IContactDAO {
	
	@Override
	public void createContact(Contact contact) {
		System.out.println("Contact cr��");
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		//d�marrer une transaction
		session.beginTransaction();
		//persister l�objet
		session.save(contact);
		//recharger l�objet � partir de la session
		//committer la transaction
		session.getTransaction().commit();
		}
	
	@Override
	public Contact readContact(Contact contact) 
	{
		return contact;
		
	}

	@Override
	public TreeSet<Contact> readContact()
	{
		return null;
		
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


	

}
