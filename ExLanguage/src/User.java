
public class User {
	private String firstname;
	private String lastname;
	private String email;
	private Address address =new Address();
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(String street, String city, String state, String zipcode) {
		address.setAddress(street, city, state, zipcode);
	}
}
