package entites;

public class PhoneNumber {
	
	private long id;
	private String phoneKind;
	private String phoneNumero;
	private Contact contact;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPhoneKind() {
		return phoneKind;
	}
	public void setPhoneKind(String phoneKind) {
		this.phoneKind = phoneKind;
	}
	public String getPhoneNumero() {
		return phoneNumero;
	}
	public void setPhoneNumero(String phoneNumero) {
		this.phoneNumero = phoneNumero;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	

}
