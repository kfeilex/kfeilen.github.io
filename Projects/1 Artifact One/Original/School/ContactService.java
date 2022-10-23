package School;

import java.util.List;
import java.util.ArrayList;


public class ContactService {
	

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;

	//Initializing the array
	private List<ContactClass> contactList = new ArrayList<>();
	
	//Using Math to create random numbers then using power to ensure it will be less than 9 digits
	//Then converted back to a String
	private String newContactID() {
		int uniqueID = (int)(Math.random()*Math.pow(10, 8));
		String newContactID= new Integer(uniqueID).toString();
		return newContactID;
	}
	
		
	// Find task by searching by task ID
	private ContactClass findContactbyID(String id) {
		int start = 0;
		while (start < contactList.size()) {
			if (id.equals(contactList.get(start).getContactID())) {
				return contactList.get(start);
			}
			start++;
		}
		throw new IllegalArgumentException("Invalid Contact ID, Try Again.");
	}

	//Create new unique id and assign it to the array, creating a new entry.
	public void newContact() {
		ContactClass contact = new ContactClass(newContactID(), firstName, lastName, phoneNumber, address);
		contactList.add(contact);
	}
	
	//Adding first name
	public void newContact(String firstName) {
		ContactClass contact = new ContactClass(newContactID(), firstName, lastName, phoneNumber, address);
		contactList.add(contact);
	}
	
	//Adding Last name
	public void newContact(String firstName, String lastName) {
		ContactClass contact = new ContactClass(newContactID(), firstName, lastName, phoneNumber, address);
		contactList.add(contact);
	}
	
	//Adding phone number
	
	public void newContact(String firstName, String lastName, String phoneNumber) {
		ContactClass contact = new ContactClass(newContactID(), firstName, lastName, phoneNumber, address);
		contactList.add(contact);
	}
		
	//Adding Address
	public void newContact(String firstName, String lastName, String phoneNumber, String Address) {
		ContactClass contact = new ContactClass(newContactID(), firstName, lastName, phoneNumber, address);
		contactList.add(contact);		
	}
		
		
	//Search for and delete task by task ID
	public void removeContact(String id) {
		contactList.remove(findContactbyID(id));
	}
	
	
	//Updates first name
	public void updateFirstName(String id, String firstName) {
		findContactbyID(id).updateFirstName(firstName);
	}
	
			
	//Updates last name
	public void updateLastName(String id, String lastName) {
		findContactbyID(id).updateLastName(lastName);
	}
	
	
	//Updates phone number
	public void updatePhoneNumber(String id, String phoneNumber) {
		findContactbyID(id).updatePhoneNumber(phoneNumber);
	}	
	
	
	//Updates address
	public void updateAddress(String id, String address) {
		findContactbyID(id).updateAddress(address);
	}
	
		
	public List<ContactClass> getcontactList() {
		return contactList;
	}
}