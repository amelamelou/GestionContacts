package entites;

import java.util.TreeSet;

public class Contact {
	

	private long idContact;
	private String firstName;
	private String lastName;
	private String email;
	private TreeSet<PhoneNumber> phonesnumber;
	private TreeSet<ContactGroup> contactgroup;
	

	public Contact() {}
	
	public long getIdContact() {
		return idContact;
	}

	public void setIdContact(long idContact) {
		this.idContact = idContact;
	}

		
	public String getEmail() {return email;};
	public void setEmail(String email) {this.email=email;};
	
	
	public String getFirstName(){return firstName;};
	public void setFirstName(String firstName) {this.firstName=firstName;};
	

	public String getLastName(){return lastName;};
	public void setLastName(String lastName) {this.lastName=lastName;};
	
	public TreeSet<PhoneNumber> getPhonesnumber() {
		return phonesnumber;
	}

	public void setPhonesnumber(TreeSet<PhoneNumber> phonesnumber) {
		this.phonesnumber = phonesnumber;
	}

	public TreeSet<ContactGroup> getContactgroup() {
		return contactgroup;
	}

	public void setContactgroup(TreeSet<ContactGroup> contactgroup) {
		this.contactgroup = contactgroup;
	}



}
