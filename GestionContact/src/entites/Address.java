package entites;

public class Address {
	
		private long id;
		private String street;
		private String city;
		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		private String zip;
		private String country;
		private Contact contact;
		
		public Contact getContact() {
			return contact;
		}

		public void setContact(Contact contact) {
			this.contact = contact;
		}

		public Address(){}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getZip() {
			return zip;
		}

		public void setZip(String zip) {
			this.zip = zip;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

	
		
		

}
