package DAO.Impl;
import java.util.List;
import java.util.TreeSet;

import org.hibernate.Query;
import org.hibernate.Session;

import DAO.IContactDAO;
import entites.Contact;
import util.HibernateUtil;

public class ImplContactDAO implements IContactDAO {
	
	@Override
	public void createContact(Contact contact) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		session.save(contact);
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
	public boolean deleteContact(long id) {
		System.out.println("Contact supprimé");
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		Contact contact = (Contact) session.get(Contact.class, id);
		Query query = session.createSQLQuery("SELECT * From contact_table;");
		List results = query.list();
		System.out.println(results);
		session.delete(contact);
		session.getTransaction().commit();
		return true;
	}


	

}
