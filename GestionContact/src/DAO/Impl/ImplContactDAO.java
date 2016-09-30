package DAO.Impl;
import org.hibernate.Session;

import DAO.IContactDAO;
import entites.Contact;
import util.HibernateUtil;

public class ImplContactDAO implements IContactDAO {
	
	@Override
	public void createContact(Contact contact) {
		System.out.println("Contact créé");
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		//démarrer une transaction
		session.beginTransaction();
		//persister l’objet
		session.save(contact);
		//recharger l’objet à partir de la session
		//committer la transaction
		session.getTransaction().commit();
		}

	@Override
	public boolean deleteContact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
