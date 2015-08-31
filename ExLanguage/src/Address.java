
public class Address {
	private String street;
	private String city;
	private String state;
	private String zipcode;
	
	public void setAddress(String street, String city, String state, String zipcode) {

		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getState() {
		return state;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	
	public String getCity() {
		return city;
	}
	
}
