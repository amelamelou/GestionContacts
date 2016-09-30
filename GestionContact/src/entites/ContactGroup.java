package entites;

import java.util.TreeSet;

public class ContactGroup {
	
	private long groupId;
	private String groupName;
	private TreeSet<Contact> contacts;
	
	
	public long getGroupId() {
		return groupId;
	}
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public TreeSet<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(TreeSet<Contact> contacts) {
		this.contacts = contacts;
	}
	
	

}
