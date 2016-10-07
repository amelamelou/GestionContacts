package entites;

import java.util.TreeSet;

public class Utilisateur {
	
		private long idUser;
		private String login;
		private String password;
		private TreeSet<Contact> contacts;
		
		
		
		public Utilisateur(long idUser, String login, String password) {
			
			this.idUser = idUser;
			this.login = login;
			this.password = password;
		}
		public long getIdUser() {
			return idUser;
		}
		public void setIdUser(long idUser) {
			this.idUser = idUser;
		}
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		public TreeSet<Contact> getContacts() {
			return contacts;
		}
		public void setContacts(TreeSet<Contact> contacts) {
			this.contacts = contacts;
		}
		

}
