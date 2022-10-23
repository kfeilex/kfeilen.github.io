package School;

public class ContactClass {
	
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public ContactClass(String id, String firstName, String lastName, String phoneNumber, String address) {
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid id");
		}
		
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		if(phoneNumber == null || phoneNumber.length()!=10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getContactID() {
		return id;
	}	
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getphoneNumber() {
		return phoneNumber;
	}
	public String getaddress() {
		return address;
	}
	public void updateFirstName(String newFirstName) {
		this.firstName = (newFirstName);
	}
	public void updateLastName(String newLastName) {
		this.lastName = (newLastName);
	}
	public void updatePhoneNumber(String newPhoneNumber) {
		this.phoneNumber = (newPhoneNumber);
	}
	public void updateAddress(String newAddress) {
		this.address = (newAddress);
	}
	
	
}
